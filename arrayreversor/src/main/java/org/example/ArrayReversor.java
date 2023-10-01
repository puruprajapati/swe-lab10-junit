package org.example;

public class ArrayReversor {
  private ArrayFlattenerService arrayFlattenerService;

  public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
    this.arrayFlattenerService = arrayFlattenerService;
  }

  public int[] reverseArray(int[][] input) {
    if (input == null) {
      return new int[0]; // Return an empty array for null input
    }

    int[] flattenedArray = arrayFlattenerService.flattenArray(input);
    int[] reversedArray = new int[flattenedArray.length];

    for (int i = 0; i < flattenedArray.length; i++) {
      reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
    }

    return reversedArray;
  }
}
