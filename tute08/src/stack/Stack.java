package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 *
 */
public class Stack<E> implements Iterable<E> {
    private List<E> data = new ArrayList<>();

    public Stack() {
        // 
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.data.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return this.data.remove(this.data.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.data.get(this.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        List<E> copy = this.toArrayList();
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the stack as an List
     */
    public List<E> toArrayList() {
        List<E> copy = new ArrayList<>(data);
        Collections.reverse(copy);
        return copy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        Integer counter = 0;
        for (Integer x : stack) {
            counter += x;
        }
        return counter;
    }

    public static void prettyPrint(Stack<?> stack) {

        for (Object x : stack) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }

}