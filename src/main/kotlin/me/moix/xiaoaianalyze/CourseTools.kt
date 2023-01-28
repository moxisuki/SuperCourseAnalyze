package me.moix.xiaoaianalyze

class CourseTools(val lessons: List<CourseListItem>, val loginData: LoginData) {
    val termList = mutableListOf<>()
    init {
        try {

                loginData.student?.attachmentBO?.myTermList?.forEach {

            }
        } catch (e: Exception) {
            throw e
        }
    }

    fun isTakingCourse(lesson: CourseListItem): Boolean {
        val now = System.currentTimeMillis()
        val begin = lesson.beginTime
        val end = lesson.endTime
        return now in begin..end
    }
}