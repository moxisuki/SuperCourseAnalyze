package me.moix.xiaoaianalyze

import com.google.gson.annotations.SerializedName

data class CourseData(

	@field:SerializedName("data")
	val data: CoursesData? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class CoursesData(

	@field:SerializedName("maxCountInt")
	val maxCountInt: Int? = null,

	@field:SerializedName("beginYearInt")
	val beginYearInt: Int? = null,

	@field:SerializedName("termInt")
	val termInt: Int? = null,

	@field:SerializedName("statusInt")
	val statusInt: Int? = null,

	@field:SerializedName("courseList")
	val courseList: List<CourseListItem?>? = null
)

data class CourseListItem(

	@field:SerializedName("sectionStart")
	val sectionStart: Int? = null,

	@field:SerializedName("studentCount")
	val studentCount: Int? = null,

	@field:SerializedName("courseType")
	val courseType: Int? = null,

	@field:SerializedName("period")
	val period: String? = null,

	@field:SerializedName("nonsupportAmount")
	val nonsupportAmount: Int? = null,

	@field:SerializedName("supportAmount")
	val supportAmount: Int? = null,

	@field:SerializedName("beginYear")
	val beginYear: Int? = null,

	@field:SerializedName("classroom")
	val classroom: String? = null,

	@field:SerializedName("endYear")
	val endYear: Int? = null,

	@field:SerializedName("provinceId")
	val provinceId: Int? = null,

	@field:SerializedName("teacher")
	val teacher: String? = null,

	@field:SerializedName("verifyStatus")
	val verifyStatus: Int? = null,

	@field:SerializedName("schooltime")
	val schooltime: Int? = null,

	@field:SerializedName("sectionEnd")
	val sectionEnd: Int? = null,

	@field:SerializedName("autoEntry")
	val autoEntry: Boolean? = null,

	@field:SerializedName("schoolId")
	val schoolId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("smartPeriod")
	val smartPeriod: String? = null,

	@field:SerializedName("term")
	val term: Int? = null,

	@field:SerializedName("courseMark")
	val courseMark: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("schoolName")
	val schoolName: String? = null,

	@field:SerializedName("courseId")
	val courseId: Int? = null,

	@field:SerializedName("day")
	val day: Int? = null
)
