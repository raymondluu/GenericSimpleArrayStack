/*
 * TCSS 342 Winter 2013
 * Assignment 1
 */

/**
 * A stack provides last-in-first-out (LIFO) behavior. All access operations on
 * a stack are done at its <code>top</code>.
 * 
 * @author Alan Fowler
 * @version Winter 2013
 * 
 * @param <E> the generic type parameter
 */
public interface StackADT<E>
{
  /**
   * Adds an element to the top of the Stack.
   * 
   * @param the_element the element to add to the Stack
   */
  void push(final E the_element);

  /**
   * Removes and returns the element at the top of the Stack.
   * 
   * @return the element at the top of the Stack
   * @throws EmptyStackException if pop() is called on an Empty Stack.
   */
  E pop();

  /**
   * Return the top element of the stack without removing it.
   * 
   * @return the element at the top of the Stack
   * @throws EmptyStackException if the Stack is empty
   */
  E peek();

  /**
   * Reports the number of elements currently in the Stack.
   * 
   * @return the number of elements in the Stack
   */
  int size();

  /**
   * Determines if the stack is empty.
   * 
   * @return true if the Stack contains no elements; false otherwise
   */
  boolean isEmpty();

}
