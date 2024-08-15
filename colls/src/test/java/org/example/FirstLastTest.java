package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.when;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.Test;

class FirstLastTest {

  FirstLast firstLast = mock(FirstLast.class);

  @Test
  void getFirst() {
    when(firstLast.getFirst()).thenReturn("first");
    assertEquals("first", firstLast.getFirst());
  }

  @Test
  void getLast() {
    when(firstLast.getLast()).thenReturn("1001");
    assertEquals("1001", firstLast.getLast());
  }
}