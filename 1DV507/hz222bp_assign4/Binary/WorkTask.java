package hz222bp_assign4.Binary;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2018-16-03*/
public class WorkTask implements Task {
	private int priority = 0;
	private String description = "";
    
	//This class define one of the data of the priority queue
	public WorkTask(int p, String d) {
		check(p);//check if the task is repeated
		setPriority(p);//the priority decide the position in the queue
		setDescription(d);//describe the tasks contents by string
	}

	private void check(int a) {
		if (a > 0) {// the priority level should not be negative
			return;
		} else {
			throw new IllegalArgumentException("The task priority should be positive.");
		}
	}

	@Override
	public void setDescription(String d) {
		description = d;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setPriority(int n) {
		priority = n;
	}

	@Override
	public int getPriority() {
		return priority;
	}

	//Check if the two tasks have the same description and priority level  
	@Override
	public boolean equals(Object e) {
		if (e instanceof WorkTask) {
			Task other = (WorkTask) e;
			return priority == other.getPriority() && description.equals(other.getDescription());
		}
		return false;
	}

	public String toString() {
		return "("+getPriority()+". " + getDescription()+") ";
	}
}
