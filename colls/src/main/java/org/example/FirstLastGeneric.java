package org.example;

import java.util.Collection;
import java.util.Iterator;

public class FirstLastGeneric<T> implements FirstLast {

  Collection<T> coll;

  public FirstLastGeneric(Collection<T> collParam) {
    this.coll = collParam;
  }

  @Override

  public T getFirst() {
    Iterator<T> iter = coll.iterator();
    T first = null;
    if (iter.hasNext()) {
      first = iter.next();
    }
    return first;
  }

  @Override
  public T getLast() {
    Iterator<T> iter = coll.iterator();
    T first = null;
    while (iter.hasNext()) {
      first = iter.next();
    }
    return first;
  }
}
