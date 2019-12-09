package hz222bp_assign1;
/*
* Quote.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.Scanner; 

public class Quote{
  public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print ("Write a line of text: "); 
	String text = "\""+sc.nextLine ()+"\""; 
	System.out.print ("Quote:"+text); 

	sc.close (); 
	}
}

