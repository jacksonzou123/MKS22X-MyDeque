public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0;
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 0;
    size = 0;
  }

  public int size(){
    return size;
  }

  private void resize(){

  }

  public String toString(){
    String f = "[";
    int index = start;
    boolean done = false;
    while (index < data.length && !done) {
      if (index == end) {
        done = true;
      }
      if (data[index] != null) {
        f += data[index] + " ";
      }
      index++;
    }
    if (!done) {
      index = 0;
      while (index <= end) {
        f += data[index] + " ";
        index++;
      }
    }
    return f.substring(0,f.length()-1) + "]";
  }

  public void addFirst(E element){

  }

  public void addLast(E element){
    resize();
    if (end == data.length) {
      end = 0;
    }
    data[end] = element;
    end++;
    size++;
  }

  public E removeFirst(){
    return data[0];
  }

  public E removeLast(){
    return data[0];
  }

  public E getFirst(){
    return data[0];
  }

  public E getLast(){
    return data[0];
  }

}
