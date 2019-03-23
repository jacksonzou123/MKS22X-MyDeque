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
    if (size == data.length) {
      int index = 0;
      boolean done = false;
      E[] current = (E[])new Object[size*2];
      while (start < data.length && !done) {
        if (start == end) {
          done = true;
        }
        current[index] = data[start];
        start++;
        index++;
      }
      if (!done) {
        start = 0;
        while (start <= end) {
          current[index] = data[start];
          index++;
          start++;
        }
      }
      data = current;
    }
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
    resize();
    if (start == 0) {
      start = data.length - 1;
    }
    else {
      start--;
    }
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    resize();
    if (end == data.length - 1) {
      end = 0;
    }
    else {
      end++;
    }
    data[end] = element;
    size++;
  }

  public E removeFirst(){
    E element = data[start];
    data[start] = null;
    if (start == data.length) {
      start = 0;
    }
    else {
      start++;
    }
    size--;
    return element;
  }

  public E removeLast(){
    E element = data[end];
    data[end] = null;
    if (end == 0) {
      end = data.length-1;
    }
    else {
      end--;
    }
    size--;
    return element;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

}
