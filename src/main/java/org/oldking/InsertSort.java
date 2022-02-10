package org.oldking;

/**
 * @Author: Wangzhiyong
 */
public class InsertSort {
  public static void main(String[] args) {
    int[] arr = {
        1, 4, 9, 3, 2, 7, 5, 8 };
    InsertSort selectSort = new InsertSort();
    selectSort.insertSort(arr);
    for (int j : arr) {
      System.out.println(j);
    }
  }

  private void insertSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    int length = arr.length;
    // 0-1
    // 0-2
    // 0-3
    // ...
    // 0-(N-1)
    for (int i = 0; i < length; i++) {
      // 若要插入的值比前一个值小，则交换位置
      for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        transfer(arr, j - 1, j);
      }
    }
  }

  private void transfer(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
