package edu.rosehulman.alarmnotifier.model

import android.app.AlarmManager
import android.app.Application
import android.content.Context.ALARM_SERVICE
import androidx.lifecycle.AndroidViewModel
import java.util.*


class AlarmViewModel(private val app: Application) : AndroidViewModel(app) {

    private val alarmManager = app.getSystemService(ALARM_SERVICE) as AlarmManager
    private val REQUEST_CODE = 1
    val SECOND_IN_MILLIS: Long = 1_000L // timers work in milliseconds
    private var alarmHour: Int = 0
    private var alarmMinute: Int = 0
    private var currentHour: Int = 0
    private var currentMinute: Int = 0

    enum class AlarmType {
        NOW,
        SOON,
        SCHEDULED,
        RECURRING,
    }

    fun setCurrentTime() {
        Calendar.getInstance().also {
            currentHour = it.get(Calendar.HOUR_OF_DAY)
            currentMinute = it.get(Calendar.MINUTE)
        }

        Calendar.getInstance().also {
            it.set(Calendar.MINUTE, it.get(Calendar.MINUTE) + 1)
            alarmHour = it.get(Calendar.HOUR_OF_DAY)
            alarmMinute = it.get(Calendar.MINUTE)
        }
    }

    fun setAlarmTime(hour: Int, minute: Int) {
        alarmHour = hour
        alarmMinute = minute
    }

    fun currentTimeString() = String.format("%2d:%02d", currentHour, currentMinute)
    fun alarmTimeString() = String.format("%2d:%02d", alarmHour, alarmMinute)

    fun setAlarmSoon() {
        // TODO
        // you should uncomment and call makePendingIntent too.
    }

//    private fun makePendingIntent(message: String): PendingIntent {
//        val notifyIntent = Intent(app, AlarmReceiver::class.java).also {
//            it.putExtra(NotificationUtils.MESSAGE_KEY, message)
//        }
//        return PendingIntent.getBroadcast(
//            app,
//            REQUEST_CODE,
//            notifyIntent,
//            PendingIntent.FLAG_UPDATE_CURRENT
//        )
//    }

    fun setAlarmScheduled() {
        // TODO. Write this
    }

    fun setAlarmRecurring() {
        // This is beyond this lesson. You can try it out if your app requires it.
    }

    fun cancelAllAlarms() {
    // TODO Uncomment so you can cancel alarms:
    //        alarmManager.cancel(makePendingIntent(AlarmType.RECURRING.toString().lowercase()))
    }

}
