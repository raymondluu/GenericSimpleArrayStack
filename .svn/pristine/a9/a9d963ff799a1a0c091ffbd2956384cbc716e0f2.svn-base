/*
 * TCSS 342 Winter 2013
 * Assignment 1
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A Generic Simple Array Stack JUnit Test.
 * 
 * @author Raymond Luu
 * @version Winter 2013
 * 
 */
public class JUnitTestGenericSimpleArrayStack
{
  
  /**
   * A stack to test with.
   */
  private GenericSimpleArrayStack<String> my_stack;
  
  /**
   * Initialize the stack before each test is ran.
   */
  @Before
  public void setup()
  {
    my_stack = new GenericSimpleArrayStack<>();
  }
  
  // the tests
  
  /**
   * Test method for Generic Simple Array Stack.
   */
  @Test
  public void testGenericSimpleArrayStack()
  {
    assertTrue("New Stack should be empty. Size should equal 0", my_stack.size() == 0);
  }
  
  /**
   * Test method for Push.
   */
  @Test
  public void testPush()
  {
    pushElements();
    
    // test size was incremented correctly after two pushes; size should be 2
    assertTrue("push() failed to increment size", my_stack.size() == 2);
    
    // test top was incremented correctly after two pushes; top should be 1
    assertTrue("push() failed to increment top", my_stack.size() - 1 == 1);
    
    final String return_value1 = my_stack.pop();
    
    // test if top element is in correct position; element should be "World"
    assertTrue("push() failed to put element in correctly!", "World".equals(return_value1));
    
    final String return_value2 = my_stack.pop();
    
    // test if the last element is in correct position; element should be "Hello"
    assertTrue("push() failed to put element in correctly!", "Hello".equals(return_value2));

  }
  
  /**
   * Test method for Pop.
   */
  @Test
  public void testPop()
  {
    pushElements();
    final String return_value = my_stack.pop();
    
    // test if the right element is returned; popped element should be "World"
    assertTrue("pop() returned the wrong element!", "World".equals(return_value));
    
    // test size was decremented; size should be 1
    assertTrue("pop() didn't decrement size correctly!", my_stack.size() == 1);
    
    // test top was decremented; top should be 0
    assertTrue("pop() didn't decrement top correctly!", my_stack.size() - 1 == 0);
    
  }
  
  /**
   * Test method for popping negative index.
   */
  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testPopNegativeIndex()
  {
    pushElements();
    my_stack.pop();
    my_stack.pop();
    my_stack.pop();
  }
  
  /**
   * Test method for Peek.
   */
  @Test
  public void testPeek()
  {
    pushElements();
    
    // test if top element is in correct position; top element should be "World"
    assertTrue("peek() didn't return the right element!", "World".equals(my_stack.peek()));
  }
  
  /**
   * Test method for Size.
   */
  @Test
  public void testSize()
  {
    pushElements();
    
    // test if size is correct; size should be 2
    assertTrue("size() returned the wrong size!", my_stack.size() == 2);
  }
  
  /**
   * Test method for isEmpty.
   */
  @Test
  public void testIsEmpty()
  {
    // test if the new stack is empty; boolean should be true
    assertTrue("isEmpty() failed to return true", my_stack.isEmpty());
    
    pushElements();
    
    // test if the stack is not empty; boolean should be false
    assertFalse("isEmpty() failed to return false", my_stack.isEmpty());
    
    my_stack.pop();
    my_stack.pop();
    
    // test if elements were pushed and popped from stack
    // that the stack is empty; boolean should be true
    assertTrue("isEmpty() failed to return true", my_stack.isEmpty());
  }
  
  /**
   * Test method for toString.
   */
  @Test
  public void testToString()
  {
    pushElements();
    
    final String expected = "World\nHello\n";
    // test that the string is correctly returned
    assertTrue("toString() failed to return correct string",
               my_stack.toString().equals(expected));
  }
  
  /**
   * Test method for clear.
   */
  @Test
  public void testClear()
  {
    my_stack.clear();
    
    // test if size decremented back to 0
    assertTrue("clear() failed to decrement size", my_stack.size() == 0);
    
    // test if top decremented back to -1
    assertTrue("clear() failed to decrement top", my_stack.size() - 1 == -1);
  }

  // helper methods
  
  /**
   * Add elements to the stack.
   */
  private void pushElements()
  {
    my_stack.push("Hello");
    my_stack.push("World");
  }
  
}
