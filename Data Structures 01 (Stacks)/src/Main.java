import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		
		// stack = LIFO data structure. Last-in First-Out
		//		   stores objects into a sort of "vertical tower"
		//		   push() to add to the top
		//		   pop() to remove from the top
		
		// uses of stacks?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history'
		// 3. backtracking algorithms (maze, file directories)
		// 4. calling functions (call stack)
		
		Stack<String> stack = new Stack<String>();
		
		//System.out.println(stack.empty());
		
		stack.push("Ford");
		stack.push("Dodge");
		stack.push("Chevy");
		stack.push("Toyota");
		stack.push("Honda");
		
		//String myFavCar = stack.pop();

		System.out.println(stack.peek());
		
		System.out.println(stack);
		//System.out.println(myFavCar);
		
		System.out.println(stack.search("Honda"));
		
		/*
		 * for (int i = 0; i < 1000000000; i++) { stack.push("Ladda"); }
		 */
	
		
	}

}
