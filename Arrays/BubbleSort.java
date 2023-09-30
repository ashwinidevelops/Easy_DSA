/*
 *     Bubble Sort
 * 
 *     Idea - Large elements come to the end of array by Swapping With adjacent elements
 */

 
public class BubbleSort {

    public static void sortArray(int array[]) {
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        } 
    }

    public static void main(String args[]) {
        int array[]={8,7,6,5,4,3,2,1,0};
        sortArray(array);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
/*Bubble Sort Overview:

Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list to be sorted, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, indicating that the list is sorted.
Bubble Sort Implementation:

The sortArray method in your code is responsible for implementing the Bubble Sort algorithm.
It takes an integer array (array) as its input parameter.
Sorting Process:

The outer loop iterates from i = 0 to i < array.length - 1. It represents the number of passes needed to sort the array.
The inner loop iterates from j = 0 to j < array.length - i - 1. It represents the comparison and swapping phase within each pass.
Inside the inner loop, it compares the current element array[j] with the next element array[j+1].
If array[j] is greater than array[j+1], it swaps these two elements using a temporary variable tmp.
This swapping operation ensures that the larger elements "bubble up" to the end of the array in each pass.
Sorting Completeness:

After completing all the passes, the array is sorted in ascending order because the largest elements have moved to the end of the array.
The sorted array is then printed in the main method.
Output:

When you run the program, it sorts the initial array {8, 7, 6, 5, 4, 3, 2, 1, 0} using Bubble Sort and prints the sorted array, which should be {0, 1, 2, 3, 4, 5, 6, 7, 8}.
In summary, this code demonstrates the Bubble Sort algorithm, which is straightforward but not very efficient for large datasets. It repeatedly compares and swaps adjacent elements until the entire array is sorted in ascending order.


/*
 *    Output:
 *    0 1 2 3 4 5 6 7 8
 */
