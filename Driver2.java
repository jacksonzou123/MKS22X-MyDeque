public class Driver2{
  public static void main(String[] args) {
    MyDeque<String> test = new MyDeque<>();
    System.out.println(test);
    System.out.println(test.index());
    test.addLast("one");
    System.out.println(test);
    System.out.println(test.index());
    test.addLast("two");
    test.addLast("three");
    test.addLast("four");
    test.addLast("five");
    test.addLast("six");
    System.out.println(test);
    System.out.println(test.index());
    test.addFirst("seven");
    test.addFirst("eight");
    System.out.println(test);
    System.out.println(test.index());
    System.out.println(test.array());
    test.removeLast();
    test.removeFirst();
    System.out.println(test);
    System.out.println(test.index());
    System.out.println(test.array());
    test.addFirst("eight");
    test.addFirst("eight");
    test.addFirst("eighfef");
    test.addFirst("eighfet");
    test.addFirst("eight");
    test.addLast("two");
    test.addLast("three");
    test.addLast("four");
    test.addLast("five");
    test.addLast("six");
    System.out.println(test);
    System.out.println(test.index());
    System.out.println(test.array());

  }
}
