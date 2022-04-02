/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmultipleinherit;

/**
 *
 * @author Tata
 */
abstract class Sortable {
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){
        int n = a.length;
 
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                Sortable temp = a[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && (a[j - gap].compare(temp) < 0); j -= gap)
                    a[j] = a[j - gap];
 
                // put temp (the original a[i]) in its correct
                // location
                a[j] = temp;
            }
        }
    }
}
