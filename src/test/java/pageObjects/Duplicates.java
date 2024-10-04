package pageObjects;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {
		int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 3, 5, 1, 6};

        int[] uniqueArray = removeDuplicates(arrayWithDuplicates);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : array) {
            uniqueElements.add(num);
        }

        // Convert HashSet back to an array
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }

        return resultArray;
    

	}

}
