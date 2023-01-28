package me.moix.xiaoaianalyze


suspend fun main(args: Array<String>) {
    val superClassHandler = SuperCourseHandler()
    superClassHandler.login("Phone", "Password")
    val lessons = superClassHandler.getCourseTable("46055666",2022,0) // superid year term
    println(lessons)
}