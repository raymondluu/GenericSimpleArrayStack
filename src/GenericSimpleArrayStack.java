/*
 * TCSS 342 Winter 2013
 * Assignment 1
 */

/**
 * A Generic Simple Array Stack class that will implement StackADT.
 * 
 * @author Raymond Luu
 * @version Winter 2013
 * 
 * @param <E> the generic type parameter
 */
public final class GenericSimpleArrayStack<E> implements StackADT<E>
{
  
  /**
   * Default capacity of Stack.
   */
  private static final int DEFAULT_CAPACITY = 10; // a default size for Stack
  
  /**
   * Size of the Stack.
   */
  private int my_size;
  
  /**
   * Top of the Stack.
   */
  private int my_top;
  
  /**
   * An array to hold the elements in this Stack.
   */
  private E[] my_elements;
  
  /**
   * Constructs an empty ArrayStack.
   */
  public GenericSimpleArrayStack() // This method is O(1) runtime complexity 
  {                                // due to clear method being O(1)
    clear();
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public void push(final E the_element) // This method is O(1) runtime complexity
  {
    my_size++;
    my_top++;
    my_elements[my_top] = the_element;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public E pop() // This method is O(1) runtime complexity
  {
    if (my_top < 0)
    {
      throw new ArrayIndexOutOfBoundsException("Cannot 'pop' the element at index " + size()
                                               + "; in a stack of size " + size());
    }
    
    final E popped = my_elements[my_top];
    
    System.arraycopy(my_elements, my_top + 1, my_elements, my_top, size() - my_top);
    
    my_size--;
    my_top--;
    
    return popped;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public E peek() // This method is O(1) runtime complexity
  {
    return my_elements[my_top];
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public int size() // This method is O(1) runtime complexity
  {
    return my_size;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEmpty() // This method is O(1) runtime complexity
  {
    boolean status = false;
    if (my_size == 0)
    {
      status = true;
    }
    return status;
  }
  
  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() // This method is O(n) runtime complexity
  {
    final StringBuilder str = new StringBuilder();
    
    for (int i = my_top; i >= 0; i--)
    {
      str.append(my_elements[i]);
      str.append("\n");
    }
    return str.toString();
  }
  
  /**
   * Empty the ArrayStack.
   */
  public void clear() // This method is O(1) runtime complexity
  {
    my_size = 0;
    my_top = -1; // empty stack top is -1
    my_elements = (E[]) new Object[DEFAULT_CAPACITY];
  }
  
}
