package thirtyday.challenge.solutions;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/
 */
public class MinStack {

  /**
   * Inner class to represent a node in the stack
   */
  class Node {

    public int minValue;
    public int value;

    public Node next;

    public Node(int value, int minValue){
      this.minValue = minValue;
      this.value = value;
    }
  }

  public Node top;

  public MinStack() {
  }

  public void push(int x){
    if(top == null){
      top = new Node(x,x);
    } else {
      Node node = new Node(x, Math.min(x, top.minValue));
      node.next = top;
      top = node;
    }
  }


  public void pop() {
    if(top != null) {
      Node nextNode = top.next;
      top.next = null;
      top = nextNode;
      if(top != null) {
        top.minValue = getMinValue(top);
      }

    } else {
      return;
    }
  }

  public int top() {
    if(top == null) {
      return  -1;
    } else {
      return top.value;
    }
  }

  public int getMin() {
    if(top != null) {
      return top.minValue;
    } else {
      return  -1;
    }
  }

  private int getMinValue(Node node) {
    if(node != null) {

      int minValue = node.minValue;

      while(node != null) {
        if (minValue > node.minValue) {
          minValue = node.minValue;
        }
        node = node.next;
      }

      return minValue;
    } else{
      return  Integer.MIN_VALUE;
    }
  }


  public static void main(String[] args) {
    MinStack stack = new MinStack();
    stack.push(1);//2147483646
    stack.push(1);
    stack.push(2);//2147483647
    stack.top();
    stack.pop();
    stack.getMin();
    stack.pop();
    stack.getMin();
    stack.pop();
    stack.push(2);//2147483647
    stack.top();
    stack.getMin();
    stack.push(-3);//2147483648
    stack.top();
    stack.getMin();
    stack.pop();
    System.out.println(stack.getMin());
  }

}
