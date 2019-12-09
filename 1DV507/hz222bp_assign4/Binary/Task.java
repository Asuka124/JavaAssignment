package hz222bp_assign4.Binary;

/*Assignment 4; Exercise 6(VG)
 *Hailing Zhang(hz222bp) 
 *2018-14-03*/
public interface Task {
	public void setDescription(String d); // Set task description

	public String getDescription(); // Get task description

	public void setPriority(int n); // Set task priority

	public int getPriority(); // Get task priority

	public boolean equals(Object e);// Return true if equal

	public String toString();
}
