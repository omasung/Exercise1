
package exercise1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author USER
 */
public class Exercise1 {

        static int smallestNonOccurringInteger(int[] A) {

        int N = A.length;

        Set<Integer> set = new HashSet<>();

        for (int a : A) {

            if (a > 0) {
                
                set.add(a);
                
            }

        }

        for (int i = 1; i <= N + 1; i++) {

            if (!set.contains(i)) {
                
                return i;
                
            }

        }

        return N + 1;
    }

    // Driver method 
    public static void main(String[] args) {

        /*
         * Example for the given arrays
         * 
         * Given Array 1 = [1, 3, 6, 4, 1, 2] the function should return 5.
         * 
         * Given Array 2 = [5, -1, -3] the function should return 1.
         * 
         */
        
        int[][] givenArrays = new int[][]{{1, 3, 6, 4, 1, 2}, {5, -1, -3}};

        System.out.println("For The Given Arrays: ");

        for (int[] givenArray : givenArrays) {
            
            System.out.println(Arrays.toString(givenArray) + " returns " + smallestNonOccurringInteger(givenArray));
       
        }

    }  
    
}
