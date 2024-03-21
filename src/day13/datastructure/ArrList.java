package day13.datastructure;

import java.util.NoSuchElementException;

public class ArrList<E>{
  private E[] a;
  private int size;
  public ArrList(){
    a = (E[])new Object[2]; // 최초로 10개의 원소를 가지는 배열 생성
    size = 0;
  }
  // get, add, remove 메서드를 선언
  public E get(int index){
    if(size == 0)
      throw new NoSuchElementException();
    return a[index];
  }

  public void add(E v){
    if(a.length == size) {
      resize(a.length * 2);
    }
    a[size] = v;
    size++;
  }

  public E removeLast() {
    if(size == a.length/4) {
      resize(a.length / 2);
    }
    E ret = a[size - 1];
    a[size - 1] = null;
    size--;
    return ret;
  }
  private void resize(int newSize) {
    Object[] t = new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = (E[]) t;
  }

  public int size() {
    return size;
  }
}
