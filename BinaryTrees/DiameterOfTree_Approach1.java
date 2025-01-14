public class DiameterOfTree_Approach1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root) { // O(n^2)
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);
        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam)) + 1;
    }

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max diameter of tree : " + diameter(root)); // Max diameter of tree :5

        root.right.right.right = new Node(9);
        root.right.right.right.right = new Node(10);

        System.out.println("Max diameter of tree : " + diameter(root)); // Max diameter of tree : 7
    }
}
/*
Node Class: The code defines an inner class Node that represents nodes in the binary tree. Each Node has an integer data, a left child (left), and a right child (right). The constructor initializes a Node with the given data and sets both children to null.

Height Calculation (height Method):

The height method is a helper function that calculates the height of a subtree rooted at a given node.
It uses a recursive approach to calculate the height. If the input node is null, it returns 0 (base case).
Otherwise, it calculates the heights of the left subtree (lh) and the right subtree (rh) recursively.
The height of the subtree rooted at the current node is the maximum of lh and rh, plus 1 (to account for the current node). It returns this height.
Diameter Calculation (diameter Method):

The diameter method calculates the diameter of the binary tree using a recursive approach.
If the input node root is null, it returns 0 (base case).
It recursively calculates the diameters of the left subtree (leftDiam) and the right subtree (rightDiam).
It also calculates the heights of the left subtree (leftHt) and the right subtree (rightHt).
The selfDiam variable represents the diameter of the tree rooted at the current node. It is calculated as the sum of the heights of the left and right subtrees plus 1 (to account for the current node).
The method returns the maximum of selfDiam, leftDiam, and rightDiam, representing the diameter of the entire tree rooted at the current node.
Main Method:

In the main method, a binary tree is created with the following structure:

r
Copy code
   ```
        1
       / \
      2   3
     / \ / \
    4  5 6  7
   ```
The diameter of the tree is calculated using the diameter method and printed, resulting in the output:

mathematica
Copy code
Max diameter of tree : 5
Additional nodes are added to the tree:

r
Copy code
   ```
        1
       / \
      2   3
     / \ / \
    4  5 6  7
                \
                 9
                  \
                   10
   ```
The diameter is recalculated and printed again, resulting in the output:

mathematica
Copy code
Max diameter of tree : 7
The code correctly calculates the diameter of the binary tree but has a time complexity of O(n^2), where n is the number of nodes in the tree, due to the nested recursive calls. There are more efficient algorithms to calculate the diameter of a binary tree in O(n) time, such as using a bottom-up approach or dynamic programming.




*/
