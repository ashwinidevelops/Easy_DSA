/*
 *       Counting Sort
 */

public class CountingSort {
    
    public static void sortArray(int array[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            largest=Math.max(array[i],largest);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int array[]={1,4,1,3,2,4,3,7};
        sortArray(array);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

/*
 *   Output:
 *   1 1 2 3 3 4 4 7
 */
/*
Initialization: The code starts by initializing a variable largest to Integer.MIN_VALUE, which will be used to find the largest element in the input array.

Find the Largest Element: A loop is used to iterate through the input array, and the largest variable is updated to store the largest element encountered in the array.

Counting Array: An array called count is created with a size of largest + 1. This array will be used to count the occurrences of each element in the input array.

Counting Occurrences: Another loop is used to iterate through the input array again. For each element array[i], the corresponding index in the count array is incremented. This step counts the occurrences of each unique element in the input array.

Sorting: After counting the occurrences of each element, the code uses a while loop to iterate through the count array. For each non-zero count at index i, it updates the original array with the value i and decrements the count at index i. This effectively places each element back into the original array in sorted order.

Printing the Sorted Array: Finally, in the main method, the sortArray function is called to sort the array and then the sorted elements are printed to the console.

Output: The sorted array is printed to the console, showing the elements in ascending order.
    */
