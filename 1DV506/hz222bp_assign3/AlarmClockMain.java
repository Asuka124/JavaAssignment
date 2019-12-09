package hz222bp_assign3;

/*Assignment 3; Exercise 4(test Main)
 *Hailing Zhang(hz222bp) 
 *2017-11-30*/
public class AlarmClockMain {
	// A demonstration for check methods.
	public static void main(String[] args) {
		AlarmClock ac = new AlarmClock(23, 48);

		ac.displayTime(); // current time

		ac.setAlarm(6, 15);// alarm time
		// ac.checkAlarm(); I prefer check alarm
		// ac.displayAlarmTime(); but the question did not ask to do so

		for (int i = 0; i < 500; i++) { // make the clock tick
			ac.timeTick();
		}
		ac.displayTime();
	}
}
