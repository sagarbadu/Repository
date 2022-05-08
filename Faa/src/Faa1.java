public class Faa1 {
	
	
public static void main(String[] args) {
//int a[] = {1,2,7,4,8,6,0};
//int size = a.length;
//Arrays.sort(a);
//System.out.println("Sorted Array " + Arrays.toString(a));
//System.out.println("The second highest number is " + a[size-2]);
	 int counteven  = 0;
	 int countodd = 0;
	int a[] = {1,2,7,4,8,6};
	System.out.println("The even numbers are: ");

	for(int i = 0; i < a.length; i++) {
		
		if(a[i] % 2 == 0) {
			counteven++;
			System.out.println(a[i]);
		}
		
	}
	System.out.println("The odd numbers are: ");

		for(int i = 0; i < a.length; i++) {
		if (a[i] % 2 != 0) {
			countodd++;
			System.out.println( a[i]);
		}
		
	}
	System.out.println("There are " + counteven + " even numbers and " + countodd + " odd numbers in this Array");
}
}


