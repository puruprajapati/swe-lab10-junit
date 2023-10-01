package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
  private ArrayReversor arrayReversor;

  @Mock
  private ArrayFlattenerService arrayFlattenerService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    arrayReversor = new ArrayReversor(arrayFlattenerService);
  }

  @Test
  public void testReverseArrayWithValidInput() {
    int[][] input = {{1, 3}, {0}, {4, 5, 9}};
    int[] expected = {9, 5, 4, 0, 3, 1};

    // Mock the behavior of the ArrayFlattenerService
    when(arrayFlattenerService.flattenArray(input)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});

    int[] result = arrayReversor.reverseArray(input);

    assertArrayEquals(expected, result);
    verify(arrayFlattenerService).flattenArray(input); // Verify that the service was invoked
  }

  @Test
  public void testReverseArrayWithNullInput() {
    int[][] input = null;
    int[] expected = {};

    int[] result = arrayReversor.reverseArray(input);

    assertArrayEquals(expected, result);
    verifyNoInteractions(arrayFlattenerService); // Verify that the service was not invoked
  }
}
