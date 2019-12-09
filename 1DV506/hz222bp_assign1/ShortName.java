package hz222bp_assign1;
/*
* ShortName.java
*
* Author: Hailing Zhang
* Created 2017-11-05
*/
import java.util.Scanner; 

public class ShortName{
  public static void main(String [] args)throws Exception{
	Scanner sc = new Scanner(System.in);//input the name
	System.out.print ("First name: "); 
	String forename = sc.nextLine ();
	char ch1 = forename.charAt(0);
	System.out.print ("Last name: "); 
	String surname = sc.nextLine ();
	
	int len = surname.length();//caculate the length of names
	
	if (len >= 4){
		System.out.println ("Short name: "+ch1+". "+surname.subSequence(0,4));//printout shortname
	}else{
		System.out.println ("Short name: "+ch1+". "+surname);
	}	
	sc.close (); 
	}
}
