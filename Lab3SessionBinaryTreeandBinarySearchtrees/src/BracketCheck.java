import java.util.Stack;
public class BracketCheck {
		    public static void main(String[] args) {
		 
		         String str = "([[{}]])";
		 
		         
		         Stack<Character> stack = new Stack<Character>();
		 
		         
		         for(int i = 0; i < str.length(); i++) {
		 
		            char m=str.charAt(i);
		            if(m == '{' || m == '[' || m == '(') {
		                   stack.push(m);
		 
		            } else if ( !stack.empty() && ((m== ']' && stack.peek() == '[') || (m == '}' && stack.peek() == '{') || (m == ')' && stack.peek() == '(')))
		            {
	                      stack.pop();
		 
		             } else {
		                  stack.push(m);
		             }
		         }
		 
		         if(stack.empty()) {
		              System.out.println("The entered String has Balanced Brackets");
		         } 
		         else {
		              System.out.println("The entered Strings do not contain Balanced Brackets");
		         }
		   }
		}
