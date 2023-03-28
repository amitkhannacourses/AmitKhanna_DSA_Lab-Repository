package Question1;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

	public static boolean isBalanced(String bracketchar) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < bracketchar.length(); i++) {
			char ch = bracketchar.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				// System.out.println(ch);
				st.push(ch);
				System.out.println("pushed char : " + ch);
			}

			else if (ch == ']' || ch == '}' || ch == ')') {
				if (st.empty())
					return false;

				char check;
				switch (ch) {
				// Opening square brace
				case ']':
					check = st.pop();
					if (check != '[')
						return false;
					break;
				// Opening curly brace
				case '}':
					check = st.pop();
					if (check != '{')
						return false;
					break;
				// Opening round brace
				case ')':
					check = st.pop();
					if (check != '(')
						return false;
					break;
				default:
					break;
				}
			}

		}

		if (st.empty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter different brackets");
		String bracketchar = sc.nextLine();
		boolean valid = isBalanced(bracketchar);
		if (valid) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		sc.close();

	}

}
