package org.example;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService{
  @Override
  public int[] flattenArray(int[][] input) {
    if (input == null) {
      return new int[0]; // Return an empty array for null input
    }

    int totalElements = 0;
    for (int[] arr : input) {
      totalElements += arr.length;
    }

    int[] flattenedArray = new int[totalElements];
    int index = 0;

    for (int[] arr : input) {
      for (int num : arr) {
        flattenedArray[index++] = num;
      }
    }

    return flattenedArray;
  }
}
