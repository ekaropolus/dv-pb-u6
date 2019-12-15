package arrayutilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edvaldes
 */
import java.util.*;

public class ArrayAnalaizer {

    // function to return minimum element using recursion
    public static int findMinRec(int A[], int n) {
        // if size = 0 means whole array
        // has been traversed
        if (n == 1) {
            return A[0];
        }

        return Math.min(A[n - 1], findMinRec(A, n - 1));
    }

}
