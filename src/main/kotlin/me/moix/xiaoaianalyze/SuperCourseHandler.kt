package me.moix.xiaoaianalyze

import com.google.gson.Gson
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*

class SuperCourseHandler {

    val gson: Gson = Gson()
    var client: HttpClient = HttpClient(CIO)
    var loginData: LoginData? = null

    suspend fun login(account: String, password: String): LoginData {
        try {
            val response: HttpResponse = client.submitForm(
                url = "http://120.55.151.61/V2/StudentSkip/loginCheckV4.action",
                formParameters = Parameters.build {
                    append("phoneBrand", "Xiaomi")
                    append("platform", "1")
                    append("deviceCode", "868144032406818")
                    append("phoneVersion", "28")
                    append("channel", "XiaoMiMarket")
                    append("phoneModel", "MIX+2S")
                    append("versionNumber", "9.5.5")
                    append("account", account)
                    append("password", password)
                }) {
                headers {
                    append("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                    append("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 9; MIX 2S MIUI/V11.0.2.0.PDGCNXM)")
                    append("Host", "120.55.151.61")
                    append("Connection", "Keep-Alive")
                    append("Accept-Encoding", "gzip")
                }
            }
            val superResponse = gson.fromJson(response.bodyAsText(), SuperResponse::class.java)
            if (superResponse.data?.statusInt == 1) {
                val cookie = response.setCookie()
                var serverId = ""
                var jSessionID = ""
                cookie.forEach {
                    if (it.name == "SERVERID") {
                        serverId = it.value
                    }
                    if (it.name == "JSESSIONID") {
                        jSessionID = it.value
                    }
                }
                loginData = LoginData(superResponse.data.student, LoginCookie(serverId, jSessionID))
                return loginData as LoginData
            } else {
                throw Exception("登录失败 ${superResponse.data?.errorStr}")
            }
        } catch (e: Exception) {
            throw e
        }
    }

    suspend fun getCourseTable(superID: String, beginYear: Int, term: Int): List<CourseListItem?>? {
        try {
            val response: HttpResponse = client.submitForm(
                url = "http://120.55.151.61/V2/Course/getCourseTableBySuperId.action",
                formParameters = Parameters.build {
                    append("phoneModel", "MIX+2S")
                    append("phoneBrand", "Xiaomi")
                    append("channel", "yingyongbao")
                    append("beginYear", beginYear.toString())
                    append("term", term.toString())
                    append("superId", superID)
                    append("platform", "1")
                    append("versionNumber", "9.5.5")
                    append("phoneVersion", "28")
                }
            ) {
                headers.append("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                headers.append("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 9; MIX 2S MIUI/V11.0.2.0.PDGCNXM)")
                headers.append("Host", "120.55.151.61")
                headers.append("Connection", "Keep-Alive")
                headers.append("Accept-Encoding", "gzip")
                headers.append("Content-Length", "142")
                if (loginData == null) {
                    throw Exception("请先登录")
                }else {
                    cookie("SERVERID", loginData!!.loginCookie.serverId)
                    cookie("JSESSIONID", loginData!!.loginCookie.jSessionID)
                }
            }
            val result = response.bodyAsText()
            println(result)
            val course = gson.fromJson(result, CourseData::class.java)
            return course.data?.courseList
        } catch (e: Exception) {
            throw e
        }
    }
}