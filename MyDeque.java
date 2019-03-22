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
        f+= data[index] + ", ";
        index++;
        done = true;
      }
      else {
        f += data[index];
        index++;
      }
    }
    if (!done) {
      index = 0;
      while (index <= e) {
        f += data[index] + ", ";
        index++;
      }
    }
    return f + "]";
  }

  public void addFirst(E element){

  }

  public void addLast(E element){
    resize();
    e++;
    if (e == data.length) {
      e = 0;
    }
    data[e] = element;
  }

  public E removeFirst(){ }

  public E removeLast(){ }

  public E getFirst(){ }

  public E getLast(){ }

}
