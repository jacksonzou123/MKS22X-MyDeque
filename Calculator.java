import java.util.*;

public class Calculator{
  public static double eval(String s) {
    String[] ary = s.split(" ");
    //System.out.println(Arrays.toString(ary));
    MyDeque<String> stack = new MyDeque<String>(ary.length);
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].equals("+")) {
        double num1 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        double num2 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        stack.addLast(String.valueOf(num1+num2));
      }
      else if (ary[i].equals("-")) {
        double num1 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        double num2 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        stack.addLast(String.valueOf(num2-num1));
      }
      else if (ary[i].equals("*")) {
        double num1 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        double num2 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        stack.addLast(String.valueOf(num1*num2));
      }
      else if (ary[i].equals("/")) {
        double num1 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        double num2 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        stack.addLast(String.valueOf(num2/num1));
      }
      else if (ary[i].equals("%")) {
        double num1 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        double num2 = Double.parseDouble(stack.getLast());
        stack.removeLast();
        stack.addLast(String.valueOf(num2%num1));
      }
      else {
        stack.addLast(ary[i]);
      }
    }
    return Double.parseDouble(stack.getLast());
  }

  public static void main(String[] args) {
    System.out.println(eval("1 2 3 4 5 + * - -"));
  }
}
