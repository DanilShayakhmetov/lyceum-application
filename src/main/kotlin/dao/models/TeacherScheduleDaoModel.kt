package dao.models

import java.sql.ResultSet

class TeacherScheduleDaoModel(resultSet: ResultSet) {
    val day: Int = resultSet.getInt("day_of_week")
    val startTime: String = resultSet.getString("start_time")
    val endTime: String = resultSet.getString("end_time")
    val subject: String = resultSet.getString("name")
    val room: Int = resultSet.getInt("room")
    val classNumber: Int = resultSet.getInt("number")
    val classLetter: String = resultSet.getString("letter")

    companion object {
        val teacherSchedulesFromResultSet: (ResultSet) -> List<TeacherScheduleDaoModel> = {
            val list = mutableListOf<TeacherScheduleDaoModel>()
            while (it.next()) {
                list.add(TeacherScheduleDaoModel(it))
            }
            list
        }
    }
}