
/*
 *      Push at the Bottom of the Stack
 */

import java.util.Stack;

public class PushAtBottomOfStack {

    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int pop = s.pop();
        pushBottom(s, data);
        s.push(pop);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

/*
 * Output:
 * 3
 * 2
 * 1
 * 4
 * 
 */
/*Stack Declaration: In the main method, a Stack<Integer> named s is declared and initialized. Three integer values (1, 2, and 3) are pushed onto the stack initially.

pushBottom Function: The core of the code is the pushBottom function, which is a recursive function used to push an element to the bottom of the stack.

If the stack s is initially empty, the function simply pushes the data element onto the stack and returns. This is the base case of the recursion.

If the stack is not empty, the function does the following:

It pops the top element (let's call it pop) from the stack.
It recursively calls pushBottom with the remaining stack and the data element to be pushed.
After the recursive call returns, it pushes the pop element back onto the stack. This effectively moves the data element to the bottom of the stack while maintaining the order of the other elements.
Main Method:

Initially, three values (1, 2, and 3) are pushed onto the stack s.
Then, the pushBottom function is called with the value 4 to be pushed to the bottom of the stack.
Finally, a while loop is used to pop and print elements from the stack until it is empty. This prints the elements in the order they are popped, which is the reversed order of how they were initially pushed.
Output: The code prints the elements of the stack, and since the pushBottom function moves the 4 element to the bottom of the stack, the output shows the elements in the following order:


3
2
1
4
So, the element 4 has been successfully pushed to the bottom of the stack while maintaining the order of the other elements.

This code demonstrates a recursive approach to push an element to the bottom of a stack. It's a creative way to manipulate a stack's contents while preserving the order of the elements.
*/




