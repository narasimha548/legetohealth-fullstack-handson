package basic;

public class TestArrays {

	public static void main(String[] args) {
		// array declaration & initialization both
		String[] fruits = { "Orange", "Apple", "Grapes", "Water melon" };
		
		// array declaration
		int[] items = new int[5]; // allocates 5 memory to store int in each block
		
		items[0] = 50;
		items[1] = 10;
		items[2] = 30;
		items[3] = 40;
		items[4] = 20;
		
		//items[5] = 44; // It ArraysIndexOutOfBoundException throws exception because index 5 is not
					
		
		// Iterating over the array using for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	
		// Iterating array using for loop is enhanced for loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("***********");
		for (int x : items) {
			System.out.println(x);
		}
	}
}
