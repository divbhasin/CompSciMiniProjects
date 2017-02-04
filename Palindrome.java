
public class Palindrome {

	public static void main(String[] args) {
		
		new Palindrome();

	}
	
	public Palindrome() {
		
		char[] words = {'R', 'A', 'D', 'A', 'R'};
		
		if (findPalindrome(words) == true)
			System.out.println("True");
		else 
			System.out.println("False");
	}
	
	public boolean findPalindrome(char[] array) {
		int var1 = 0;
		int var2 = array.length - 1;
		
		while (var1 < var2) {
			if (array[var2] != array[var1]) 
				return false;
			var1++;
			var2--;
		}
		
		return true;
	}

}
