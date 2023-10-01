package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFlattenerTest {
  private ArrayFlattener arrayFlattener;

  @BeforeEach
  public void setUp() {
    arrayFlattener = new ArrayFlattener();
  }

  @Test
  public void testFlattenArrayWithValidInput() {
    int[][] input = {{1, 3}, {0}, {4, 5, 9}};
    int[] expected = {1, 3, 0, 4, 5, 9};
    int[] result = arrayFlattener.flattenArray(input);
    assertArrayEquals(expected, result);
  }

  @Test
  public void testFlattenArrayWithNullInput() {
    int[][] input = null;
    int[] expected = {};
    int[] result = arrayFlattener.flattenArray(input);
    assertArrayEquals(expected, result);
  }
}
