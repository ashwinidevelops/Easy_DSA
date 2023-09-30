/*
 *        Selection Sort
 *   Idea -> pick the smallest(from unsorted), put it at the beginning.
 */


public class SelectionSort {
 
    public static void sortArray(int array[]) {
        for(int i=0; i<array.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<array.length; j++){
              if(array[minPos]>array[j]){
                  minPos=j;
              }
            } 

            // swap
            int tmp=array[i];
            array[i]=array[minPos];
            array[minPos]=tmp;  
        }
    }
    public static void main(String[] args) {
        int array[]={5,4,1,3,2};
        sortArray(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}

/*
 *   Output:
 *   1 2 3 4 5 
 */
/*
Import Statements: The code begins with import statements, but it appears that the javax.lang.model.element.Element import is not used in the code and can be safely removed.

Linear Search Function: The core of the code is the arraySearch function, which performs the linear search. It takes two arguments: the input array (array) and the key element to be searched (key).

Inside the arraySearch function, a for loop is used to iterate through the elements of the array one by one, from index 0 to the last index.
For each element at index i, it checks if the element is equal to the specified key. If a match is found, it returns the index i where the element was found.
If the loop completes without finding a match, it returns -1 to indicate that the key element was not found in the array.
Main Method: In the main method:

It initializes a Scanner object sc to read input from the user.
Asks the user for the number of elements they want to enter in the array (n).
Creates an integer array arr of size n to store the elements.
Prompts the user to enter the n elements one by one and stores them in the arr array.
Asks the user to enter the element they want to search (key).
Calls the arraySearch function with the input array arr and the specified key element to find its index.
Finally, it prints the result:
If the index returned by arraySearch is -1, it means the element was not found, so it prints a message indicating that.
Otherwise, it prints the index where the element was found.
Output: The code includes an example of how to use it. The user is asked to enter the number of elements, the elements themselves, and the element to search for. Then, it prints whether the element was found and, if found, its index.

This code demonstrates a basic implementation of linear search, which has a time complexity of O(n), where n is the number of elements in the array. It is a straightforward search algorithm suitable for small to moderately sized arrays but may not be efficient for very large datasets compared to more advanced search algorithms like binary search for sorted arrays.
 */
