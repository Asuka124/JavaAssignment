package hz222bp_assign4.stack;
/*Assignment 4; Exercise 3
 *Hailing Zhang(hz222bp) 
 *2017-12-25*/
import java.util.Iterator;
import java.util.Scanner;
//A demonstration for check methods.
public class StackMain {
	public static void main(String[] args) {
		Stack stack = new StackSteps();

		System.out.println("The size of the array: " + stack.size());
		System.out.println("Is the Array empty? " + stack.isEmpty());
		System.out.println("The top element is: " + stack.peek());
		
		//input the top element
		System.out.print("Input next element: ");
		Scanner scan = new Scanner(System.in);
		Object element = scan.nextLine();
		stack.push(element);
		scan.close();
		
		//the current array
		System.out.println("Now the top element is: " + stack.peek());
		
		//check the structure of the new array with the new top element
		/*Iterator<Object> now = stack.iterator();
		System.out.println("Printing all of the elements: ");
		while (now.hasNext()) {
			System.out.println(now.next());
		}*/
		
		//remove the top element and show the ordinary array
		System.out.println("Removing the top element: " + stack.pop());
		//check the structure of the new array without the added top element
		Iterator<Object> it = stack.iterator();
		System.out.print("Printing all of the elements: ");
		while (it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
}