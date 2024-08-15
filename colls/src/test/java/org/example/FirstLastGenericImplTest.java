package org.example;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class FirstLastGenericImplTest {

  final Queue<Integer> intsQueue = new LinkedList<Integer>(
      asList(3, 34, 23, 4, 1, 6456, 455, 56, 78, 12));
  final List<Double> doublesList = new ArrayList<>(
      asList(3.0, 34.23, 23.21, 4.12, 1.09, 6456.0, 455.33, 56.54, 78.82,
          12.21));
  Set<String> stringSet = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER) {{
    addAll(asList("b", "bb", "xz", "y", "C", "abc", "mm", "l", "zzz", "12"));
  }};

  @Test
  void getFirstQueue() {
    FirstLastGeneric<Integer> flg = new FirstLastGeneric<>(intsQueue);
    assertEquals(3, flg.getFirst());
  }

  @Test
  void getLastQueue() {
    FirstLastGeneric<Integer> flg = new FirstLastGeneric<>(intsQueue);
    assertEquals(12, flg.getLast());
  }

  @Test
  void getFirstList() {
    FirstLastGeneric<Double> flg = new FirstLastGeneric<>(doublesList);
    assertEquals(3.0, flg.getFirst());
  }

  @Test
  void getLastList() {
    FirstLastGeneric<Double> flg = new FirstLastGeneric<>(doublesList);
    assertEquals(12.21, flg.getLast());
  }

  @Test
  void getFirstSet() {
    FirstLastGeneric<String> flg = new FirstLastGeneric<>(stringSet);
    assertEquals("12", flg.getFirst());
  }

  @Test
  void getLastSet() {
    FirstLastGeneric<String> flg = new FirstLastGeneric<>(stringSet);
    assertEquals("zzz", flg.getLast());
  }

}