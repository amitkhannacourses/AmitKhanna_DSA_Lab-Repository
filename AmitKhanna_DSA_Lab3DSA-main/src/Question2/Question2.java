package Question2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {

	public static Node insert(Node root, int key) {

		if (root == null) {
			return new Node(key);
		}
		//// System.out.println("this is key value" + key);
		// System.out.println("this is root data :" + root.data);
		if (key < root.data) {

			root.left = insert(root.left, key);
			// System.out.println("this is left side nodes : " + root.left.data);
		} else {

			root.right = insert(root.right, key);
			// System.out.println("this is right side nodes : " + root.right.data);
		}

		// System.out.println("this is root :" + root);
		return root;
	}

	public static boolean SearchPairforSumInBST(Node root, int sum, List<Integer> lst) {
		// base case
		if (root == null) {
			return false;
		}

		// return true if pair is found in the left subtree; otherwise, continue
		// processing the node
		if (SearchPairforSumInBST(root.left, sum, lst)) {
			return true;
		}
		// System.out.println("this is root data :" + root.data);
		// if a pair is formed with the current node, print the pair and return true
		if (lst.contains(sum - root.data)) {
			System.out.println("Pair found (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		}

		// insert the current node's value into the set
		else {

			lst.add(root.data);
			// System.out.println("added into list :" + root.data);
		}

		// search in the right subtree
		return SearchPairforSumInBST(root.right, sum, lst);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] keys = { 40, 20, 10, 30, 60, 50, 70 };

		Node root = null;

		for (int i = 0; i < keys.length; i++) {
			// System.out.println(keys[i]);
			root = insert(root, keys[i]);
		}

		try (// check the pair is there or not with the given sum
				Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the sum value:");

			int sumVal = sc.nextInt();

			// create an empty set
			List<Integer> lst = new ArrayList<>();

			if (!SearchPairforSumInBST(root, sumVal, lst)) {
				System.out.println("Nodes are not found.");
			}
		}
	}

}
