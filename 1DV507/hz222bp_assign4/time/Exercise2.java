package hz222bp_assign4.time;
/*Assignment 4; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2018-12-03*/
public class Exercise2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			PlusShort();
		}
		for (int i = 0; i < 5; i++) {
			PlusLong();
		}
		for (int i = 0; i < 5; i++) {
			AppendShort();
		}
		for (int i = 0; i < 5; i++) {
			AppendLong();
		}
	}

	public static void PlusShort() {
		String str = "";
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < 1000) {
			str = str + "a";
		}
		long end = System.currentTimeMillis();
		int time = (int) (end - start);
		System.out.println("Plus one characters during " + time + " milliseconds, total concatenations: " + str.length()
				+ " , and length: " + str.length());
	}

	public static void PlusLong() {
		String str = "";
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < 1000) {
			str = str + "assignmentassignmentassignmentassignmentassignmentassignmentassignmentassignment";
		}
		long end = System.currentTimeMillis();
		int time = (int) (end - start);
		System.out.println("Plus 80 characters during " + time + " milliseconds, total concatenations: "
				+ (str.length() / 80) + " , and length:" + str.length());
	}

	public static void AppendShort() {
		// Measure the to String time
		StringBuilder stb = new StringBuilder();
		long startTime = System.currentTimeMillis();
		while ((System.currentTimeMillis() - startTime) < 1000) {
			stb.append("a");
		}
		long tsBegin = System.currentTimeMillis();
		stb.toString();
		long tsEnd = System.currentTimeMillis();
		int toStringTime = (int) (tsEnd - tsBegin);
		// Measure running time
		StringBuilder st = new StringBuilder();
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < 1000 - toStringTime) {
			st.append("a");
		}
		long end = System.currentTimeMillis();
		int runTime = (int) (end - start);

		System.out.println("Appending one character during " + (runTime + toStringTime)
				+ " milliseconds. Total concatenations: " + st.length() + ", and length: " + st.length());
	}

	public static void AppendLong() {
		// Measure the to String time
		StringBuilder stb = new StringBuilder();
		long startTime = System.currentTimeMillis();
		while ((System.currentTimeMillis() - startTime) < 1000) {
			stb.append("assignmentassignmentassignmentassignmentassignmentassignmentassignmentassignment");
		}
		long tsBegin = System.currentTimeMillis();
		stb.toString();
		long tsEnd = System.currentTimeMillis();
		int toStringTime = (int) (tsEnd - tsBegin);
		// Measure running time
		StringBuilder st = new StringBuilder();
		long start = System.currentTimeMillis();
		while ((System.currentTimeMillis() - start) < 1000 - toStringTime) {
			st.append("assignmentassignmentassignmentassignmentassignmentassignmentassignmentassignment");
		}
		long end = System.currentTimeMillis();
		int runTime = (int) (end - start);

		System.out.println("Appending 80 characters during " + (runTime + toStringTime)
				+ " milliseconds. Total concatenations: " + (st.length() / 80) + ", and length: " + st.length());
	}
}