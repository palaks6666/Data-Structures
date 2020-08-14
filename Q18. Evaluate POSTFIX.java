import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		String exp = "231*+9-";
		Stack < Integer > stack = new Stack < > ();
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if (Character.isDigit(c)) {
				stack.push(c-'0');
			} else {
				int v1 = stack.pop();
				int v2 = stack.pop();
				if (c == '+') stack.push(v2 + v1);
				else if (c == '-') stack.push(v2 - v1);
				else if (c == '/') stack.push(v2 / v1);
				else if (c == '*') stack.push(v2 * v1);
				else if (c == '^') stack.push(v2 ^ v1);
				else System.out.println("Operator Not avaliable");
			}
		}
		System.out.println(stack.pop());
	}
}
