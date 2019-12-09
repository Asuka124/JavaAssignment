package Assignment1;

public class SequenceWithMinimumRun {

	public static void main(String[] args) {
		
		SequenceWithMinimum swm = new SequenceWithMinimum();
		
		System.out.println("InsertRight:");
		swm.insertRight(5);
		System.out.println(swm.toString());
		swm.insertRight(4);
		System.out.println(swm.toString());
		swm.insertRight(15);
		System.out.println(swm.toString());
		
		System.out.println("");
		
		System.out.println("RemoveRight:");
		System.out.println(swm.removeRight());
		System.out.println(swm.toString());
		
		System.out.println("");
		
		System.out.println("InsertLeft:");
		swm.insertLeft(9);
		System.out.println(swm.toString());
		
		System.out.println("");
		
		System.out.println("FindMinimum:");
		System.out.println(swm.findMinimum());
		System.out.println(swm.toString());
		
		System.out.println("");
		
		System.out.println("RemoveLeft:");
		System.out.println(swm.removeLeft());
		System.out.println(swm.toString());
		System.out.println(swm.removeLeft());
		System.out.println(swm.toString());

	}

}
