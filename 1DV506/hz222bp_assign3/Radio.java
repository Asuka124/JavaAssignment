package hz222bp_assign3;

/*Assignment 3; Exercise 5
 *Hailing Zhang(hz222bp) 
 *2017-11-30*/
public class Radio {

	// The default settings of a Radio
	private int Volume = 1;
	private int Channel = 1;
	private boolean On = false;

	// Turn on the radio
	public void turnOn() {
		On = true;
	}

	// Turn off the radio
	public void turnOff() {
		On = false;
		Volume = 1;
		Channel = 1;
	}

	// Getting the parameters
	public String getSettings() {
		return "Settings: On " + On + ", Channel " + Channel + ", Volume " + Volume;
	}

	// Set Volume and Channel in the right range
	public void setVolume(int v) {
		if (On) {
			if (v < 0 || v > 5) {
				System.out.println("New volume not within range!");
			} else {
				Volume = v;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");

		}
	}

	public void setChannel(int c) {
		if (On) {
			if (c < 1 || c > 10) {
				System.out.println("New channel not within range!");
			} else {
				Channel = c;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");
		}

	}

	// Add or minus volume and channel in the right range
	public void volumeUp() {
		int v = Volume + 1;
		if (On) {
			if (v < 0 || v > 5) {
				System.out.println("New volume not within range!");
			} else {
				Volume = v;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");

		}

	}

	public void volumeDown() {
		int v = Volume - 1;
		if (On) {
			if (v < 0 || v > 5) {
				System.out.println("New volume not within range!");
			} else {
				Volume = v;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");

		}
	}

	public void channelUp() {
		int c = Channel + 1;
		if (On) {
			if (c < 1 || c > 10) {
				System.out.println("New channel not within range!");
			} else {
				Channel = c;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");
		}
	}

	public void channelDown() {
		int c = Channel - 1;
		if (On) {
			if (c < 1 || c > 10) {
				System.out.println("New channel not within range!");
			} else {
				Channel = c;
			}
		} else {
			System.out.println("Radio off ==> No adjustment possible");
		}
	}

}
