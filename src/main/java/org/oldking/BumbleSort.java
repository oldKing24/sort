package org.oldking;

/**
 * @Author: Wangzhiyong
 */
public class BumbleSort {
  public static void main(String[] args) {
    int[] arr = {
        1, 4, 9, 3, 2, 7, 5, 8 };
    BumbleSort selectSort = new BumbleSort();
    selectSort.bumbleSort(arr);
    for (int j : arr) {
      System.out.println(j);
    }
  }

  private void bumbleSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    int length = arr.length;
    // 0-N 选出一个最大值，放在N-1的位置
    // 0-（N-1） 选出一个最大值，放在N-2的位置
    // ...
    // 0-1 选出一个最大值，放在1的位置
    for (int i = length - 1; i > 0; i--) {
      // 在范围内，如果存在比最后位置的大，则交换位置
      for (int j = 0; j < i; j++) {
        if (arr[i] < arr[j]) {
          transfer(arr, i, j);
        }
      }
    }

  }

  private void transfer(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
