package Start;

/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
        
		SelectionSort sort = new SelectionSort();
		int a[] = {1,4,22,36,1,64,46,1};
		
		for (int i = 0; i < a.length; i++) { // invert list
			a[i] = a[i] * -1;
		}
		
		int sorted[] = {-64,-46,-36,-22,-4,-1,-1,-1};
		
		int[] returnValue;
		returnValue = sort.basicSelectionSort(a);
		
		for(int i = 0; i < returnValue.length; i++) {
			assertEquals(sorted[i], returnValue[i]);
		}
    }
    
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    }


}
