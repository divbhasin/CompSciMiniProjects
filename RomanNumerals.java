
public class RomanNumerals {

	public RomanNumerals() {

		char n1[] = {'I', 'I'}; //2
		char n2[] = {'I', 'X'}; //9
		char n3[] = {'V', 'I', 'I'}; //7
		char n4[] = {'C', 'X', 'I', 'I', 'I'}; //113
		char n5[] = {'L', 'I', 'V'}; //54
		char n6[] = {'X', 'X', 'X', 'V', 'I', 'I', 'I'}; //38
		char n7[] = {'X', 'C', 'I', 'X'}; //99
		char n8[] = {'D', 'C', 'L', 'X', 'X', 'V', 'I', 'I', 'I'}; //678

		System.out.println(convertRomanNumerals(n1));
		System.out.println(convertRomanNumerals(n2));
		System.out.println(convertRomanNumerals(n3));
		System.out.println(convertRomanNumerals(n4));
		System.out.println(convertRomanNumerals(n5));
		System.out.println(convertRomanNumerals(n6));
		System.out.println(convertRomanNumerals(n7));
		System.out.println(convertRomanNumerals(n8));
	}

	public int convertRomanNumerals(char[] numerals) {
		int number = 0;
		for (int i = 0; i < numerals.length; i++) {

			if (numerals[i] == 'I') {
				number++;
				if (i < numerals.length-1) {
					switch(numerals[i+1]) {
					case 'X': 
						number += 8;
						break;
					case 'V':
						number += 3;
						break;
					}
				}
			}

			else if (numerals[i] == 'X') {
				if (i > 0) {
					if (numerals[i - 1] != 'I')
						number+=10;
				}
				else 
					number += 10;
				if (i < numerals.length-1) {
					switch(numerals[i+1]) {
					case 'L': 
						number += 30;
						break;
					case 'C':
						number += 80;
						break;
					}
				}
			}
			else if (numerals[i] == 'V') 
				if (i > 0) {
					if (numerals[i - 1] != 'I')
						number += 5;
				}
				else 
					number += 5;

			else if (numerals[i] == 'L')
				if (i > 0) {
					if (numerals[i - 1] != 'X')
						number+=50;
				}
				else 
					number += 50;
			else if (numerals[i] == 'C') {
				if (i > 0) {
					if (numerals[i - 1] != 'X')
						number+=100;
				}
				else 
					number += 100;
				if (i < numerals.length-1) {
					switch(numerals[i+1]) {
					case 'D': 
						number += 300;
						break;
					case 'M':
						number += 800;
						break;
					}
				}

			}
			else if (numerals[i] == 'D') {
				if (i > 0) {
					if (numerals[i - 1] != 'C')
						number+=500;
				}
				else 
					number += 500;
			}


			else if (numerals[i] == 'M')
				if (i != 0) {
					if (numerals[i - 1] != 'C')
						number+=1000;
				}
				else 
					number += 1000;
		}
		return number;
	}

	public static void main(String[] args) {

		new RomanNumerals();

	}

}
