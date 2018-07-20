package _01_array_manipulation;



public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		
		int [] air = new int [testArray.length +1];
		for (int k = 0; k < air.length; k++) {
			if (k == j) {
				air [j] = i;
			}
			else {
				if (k < j) {
					air[k] = testArray [k];
					
				}
				else {
					air[k] = testArray [k+1];
				}
			}
		}
		
		return air;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		String [] ss = new String [orderedArray.length +1];
		int insert = -1;
		for (int i = 0; i < ss.length; i++) {
			if (string.compareTo(orderedArray[i]) > 0) {
				ss [i] = string;
				insert = i;
			}
			else {
				
			}
		}
		
		return null;
	}
	
}
