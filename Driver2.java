public class Driver2{
  public static void main(String[] args) {
    MyDeque<String> test = new MyDeque<>();
    System.out.println(test);
    System.out.println(test.index());
    test.addLast("yes");
    System.out.println(test);
    System.out.println(test.index());
  }
}
