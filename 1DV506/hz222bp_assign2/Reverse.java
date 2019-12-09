package hz222bp_assign2;
/*Assignment 2; Exercise 10
 *Hailing Zhang(hz222bp) 
 *2017-11-15*/
public class Reverse {
	public static void main(String[] args) {
		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };

		String b = new String(text);
		char[] c = b.toCharArray();
		System.out.println(c);// the content of the array text

		char temp;

		for (int i = 0; i < (int) Math.floor(b.length() / 2); i++) {
			temp = text[i];
			text[i] = text[b.length() - 1 - i];
			text[b.length() - 1 - i] = temp;// swap places of the elements in the array
		}
		String result = "";
		for (int j = 0; j < b.length(); j++) {
			result += text[j];
		}
		System.out.println(result);
	}
}
