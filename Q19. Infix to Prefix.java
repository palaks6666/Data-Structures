import java.util.*;
public class Main {
	static boolean isOperator(char c) {
		return (!(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'Z'));
	}
	static int priority(char C) {
		if (C == '-' || C == '+') return 1;
		else if (C == '*' || C == '/') return 2;
		else if (C == '^') return 3;
		return 0;
	}
	public static void main(String args[]) {
		String infix = "(A-B/C)*(A/K-L)";
		Stack < Character > operators = new Stack < Character > ();
		Stack < String > operands = new Stack < String > ();
		for (int i = 0; i < infix.length(); i++) {
			if (infix.charAt(i) == '(') {
				operators.push(infix.charAt(i));
			} else if (infix.charAt(i) == ')') {
				while (!operators.empty() && operators.peek() != '(') {
					String op1 = operands.peek();
					operands.pop();
					String op2 = operands.peek();
					operands.pop();
					char op = operators.peek();
					operators.pop();
					operands.push(op + op2 + op1);
				}
				operators.pop();
			} else if (!isOperator(infix.charAt(i))) {
				operands.push(infix.charAt(i) + "");
			} else {
				while (!operators.empty() && priority(infix.charAt(i)) <= priority(operators.peek())) {
					String op1 = operands.peek();
					operands.pop();
					String op2 = operands.peek();
					operands.pop();
					char op = operators.peek();
					operators.pop();
					String tmp = op + op2 + op1;
					operands.push(tmp);
				}
				operators.push(infix.charAt(i));
			}
		}
		while (!operators.empty()) {
			String op1 = operands.peek();
			operands.pop();
			String op2 = operands.peek();
			operands.pop();
			char op = operators.peek();
			operators.pop();
			String tmp = op + op2 + op1;
			operands.push(tmp);
		}
		System.out.println(operands.peek());
	}
}
