package IntermediateJavaTutorials.CollectionsAndListsAndDataStructures;

import java.util.Stack;

public class StackPushPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> stack) {
        if(stack.isEmpty()) System.out.println("Stack is empty");
        else
            System.out.printf("%s TOP\n", stack);
    }
}
