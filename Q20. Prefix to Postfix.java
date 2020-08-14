import java.util.*;
public class Main {
	public static void main(String args[]) {
		String exp = "*-A/BC-/AKL";
		Stack < String > s = new Stack < String > ();
		int length = exp.length();
		for (int i = length - 1; i >= 0; i--) {
		    char c=exp.charAt(i);
		    if (c=='+'||c=='^'||c=='/'||c=='*'||c=='-') {
				String o1 = s.peek();
				s.pop();
				String o2 = s.peek();
				s.pop();
				s.push(o1 + o2 + exp.charAt(i));
			} else {
				s.push(exp.charAt(i) + "");
			}
		}
		System.out.println("Postfix : " + s.peek());
	}
}
