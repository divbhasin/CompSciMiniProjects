
public class Sorting {

	public Sorting() {
		
		int num[]={16, 1, 516, 2048, 2, 64, 128, 256, 1024, 32, 4, 8};
	    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	    double moreNums[] ={3.45, 6.54, 7.89, 9.87, 2.34, 1.23, 5.78, 4.32, 6.45, 8.96, 9.07, 3.67, 0.34, 1.46, 1.47};
	    String names []={"Sunflower", "Peashooter", "Cherry Bomb", "Wall-nut",
	    		"Potato Mine", "Snow Pea", "Chomper", "Repeater", "Puff-Shroom",
	    		"Lily-Pad", "Squash", "Threepeater", "Tangle Kelp", "Jalapeno"};
	    int sun[]={50, 100, 150, 50, 25, 175, 150, 200, 0, 25, 50, 325, 25, 125};
	    
	    printArray(num);
	    System.out.println(SelectionSort(num));
	    
	    printArray(months);
	    System.out.println(BubbleSort(months));
	    
	    printArray(alphabets);
	    System.out.println(SelectionSort(alphabets));
	    
	    printArray(moreNums);
	    System.out.println(BubbleSort(moreNums));
	    
	    printArray(names);
	    printArray(sun);
	    System.out.println(SelectionSort(names));
	    System.out.println(SelectionSort(sun));
	    
	    printArray(names);
	    printArray(sun);
	    System.out.println(SelectionSort(sun));
	    System.out.println(SelectionSort(names));
	    

	}

	public static void main(String[] args) {
		new Sorting();

	}
	
	public double[] BubbleSort(double a[]) {
		for (int i = 0 ; i < a.length - 1 ; i++)
		{
			for (int j = 0 ; j < a.length - 1 - i ; j++)
			{ // compare the two neighbours
				if (a [j + 1] < a [j])
				{ //swap the neighbours if necessary
					double temp = a [j];
					a [j] = a [j + 1];
					a [j + 1] = temp;
				}
			}
		}
		return a;
	}
	
	public String[] BubbleSort(String a[]) {
		for (int i = 0 ; i < a.length - 1 ; i++)
		{
			for (int j = 0 ; j < a.length - 1 - i ; j++)
			{ // compare the two neighbours
				if (a [j + 1].compareTo(a[j]) < 0)
				{ //swap the neighbours if necessary
					String temp = a [j];
					a [j] = a [j + 1];
					a [j + 1] = temp;
				}
			}
		}
		return a;
	}
	
	public int[] SelectionSort(int a[]) {
		for (int left = a.length - 1 ; left > 0 ; left--)
		{
			int max = 0;
			for (int i = 1 ; i <= left ; i++)
			{
				if (a [max] < a [i])
					max = i;
			}
			int temp = a [max];
			a [max] = a [left];
			a [left] = temp;
		}

		return a;
	}
	
	public String[] SelectionSort(String a[]) {
		for (int left = a.length - 1 ; left > 0 ; left--)
		{
			int max = 0;
			for (int i = 1 ; i <= left ; i++)
			{
				if (a [max].compareTo(a[i]) > 0)
					max = i;
			}
			String temp = a [max];
			a [max] = a [left];
			a [left] = temp;
		}

		return a;
	}
	
	public char[] SelectionSort(char a[]) {
		for (int left = a.length - 1 ; left > 0 ; left--)
		{
			int max = 0;
			for (int i = 1 ; i <= left ; i++)
			{
				if (a [max] < a [i])
					max = i;
			}
			char temp = a [max];
			a [max] = a [left];
			a [left] = temp;
		}

		return a;
	}
	
	public void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
	
	public void printArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
	
	public void printArray(double a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
	
	public void printArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

}
