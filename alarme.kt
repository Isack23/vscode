fun main() {
      private var alarmMgr: AlarmManager? = null
    private lateinit var alarmIntent: PendingIntent
    ...
    alarmMgr = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    alarmIntent = Intent(context, AlarmReceiver::class.java).let { intent ->
        PendingIntent.getBroadcast(context, 0, intent, 0)
    }

    alarmMgr?.set(
            AlarmManager.ELAPSED_REALTIME_WAKEUP,
            SystemClock.elapsedRealtime() + 60 * 1000,
            alarmIntent
    )


}