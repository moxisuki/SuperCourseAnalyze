package me.moix.xiaoaianalyze

data class SuperResponse(
	val data: Data? = null,
	val status: Int? = null
)

data class NowWeekMsg(
	val nowWeek: Int? = null,
	val setTime: Long? = null
)

data class Data(
	val student: Student? = null,
	val statusInt: Int? = null,
	val isRegister: Int? = null,
	val errorStr: String? = null
)

data class TermBOListItem(
	val termId: Int? = null,
	val content: String? = null
)

data class Student(
	val bornCityId: Int? = null,
	val academyId: Int? = null,
	val studentType: Int? = null,
	val supportAuto: Boolean? = null,
	val academyName: String? = null,
	val addTime: Long? = null,
	val gender: Int? = null,
	val isCelebrity: Int? = null,
	val mobileNumber: String? = null,
	val beginYear: Int? = null,
	val maxCount: Int? = null,
	val nickNameReview: Int? = null,
	val studentId: Int? = null,
	val vipLevel: Int? = null,
	val schoolRoll: Int? = null,
	val highSchoolId: Int? = null,
	val rate: Int? = null,
	val identity: String? = null,
	val oldnicknamereview: Int? = null,
	val weiboExpiresIn: Int? = null,
	val schoolId: Int? = null,
	val verify: String? = null,
	val term: Int? = null,
	val id: Int? = null,
	val superId: String? = null,
	val memberShipType: Int? = null,
	val schoolName: String? = null,
	val isCancel: Boolean? = null,
	val certificationType: Int? = null,
	val nickName: String? = null,
	val bornDate: Int? = null,
	val weiboAccount: Int? = null,
	val avaterReview: Int? = null,
	val lastLoginTime: Long? = null,
	val realName: String? = null,
	val showRate: Boolean? = null,
	val versionId: Int? = null,
	val publishType: Int? = null,
	val attachmentBO: AttachmentBO? = null,
	val oldNickName: String? = null,
	val grade: Int? = null,
	val oldAvatarUrl: String? = null,
	val bornProvinceId: Int? = null,
	val photoBO: List<Any?>? = null,
	val loveState: Int? = null
)

data class GopushBO(
	val aliasName: String? = null,
	val mid: Int? = null,
	val pmid: Int? = null
)

data class SchoolInfo(
	val firstDayOfWeek: Int? = null
)

data class CourseTimeList(
	val courseTimeBO: List<CourseTimeBOItem?>? = null
)

data class CourseTimeBOItem(
	val endTimeStr: String? = null,
	val beginTimeStr: String? = null
)

data class MyTermListItem(
	val studentId: Int? = null,
	val addTime: Long? = null,
	val beginYear: Int? = null,
	val courseTimeList: CourseTimeList? = null,
	val term: Int? = null,
	val id: Int? = null,
	val maxCount: Int? = null
)

data class AttachmentBO(
	val realNameMsgNum: Int? = null,
	val supportAuto: Boolean? = null,
	val schoolInfo: SchoolInfo? = null,
	val termBOList: List<TermBOListItem?>? = null,
	val nowWeekMsg: NowWeekMsg? = null,
	val type: String? = null,
	val courseRemindTime: Long? = null,
	val vipLevel: Int? = null,
	val courseRemind: Int? = null,
	val dayOfWeek: Int? = null,
	val rate: Int? = null,
	val identity: String? = null,
	val defaultOpen: Int? = null,
	val openJpush: Boolean? = null,
	val pushTime: Long? = null,
	val defaultImgUrl: List<String?>? = null,
	val needSASL: Int? = null,
	val openGopush: Boolean? = null,
	val showRate: Boolean? = null,
	val contactStatus: Int? = null,
	val myTermList: List<MyTermListItem?>? = null,
	val hasVerCode: Boolean? = null,
	val openRubLessonInt: Int? = null,
	val purviewValue: Int? = null,
	val rubLessonTips: String? = null,
	val hasTermList: Boolean? = null,
	val gopushBO: GopushBO? = null,
	val xmppDomain: String? = null
)

