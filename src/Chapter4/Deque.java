package Chapter4;

import java.awt.*;

/**
 * Class for Deque (double ended queue)
 */
public class Deque {

  private int size;
  private int front;
  private long[] container;

  public Deque() {
    size = 0;
    front = 0;
    container = new long[10];
  }


  public boolean isEmpty() {
    return size == 0;
  }

  public void insert(long value) {
    container[size++] = value;
  }

  public int size() {
    return size;
  }

  public long remove() {
    size--;
    return container[front++];
  }


}
