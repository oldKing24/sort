package org.oldking;

/**
 * @Author: Wangzhiyong
 */
public class SelectSort {
  public static void main(String[] args) {
    int[] arr = {
        1, 4, 9, 3, 2, 7, 5, 8 };
    SelectSort selectSort = new SelectSort();
    selectSort.selectSort(arr);
    for (int j : arr) {
      System.out.println(j);
    }
  }

  private void selectSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    int length = arr.length;
    // 0-n
    // 1-n
    // 2-n
    // ...
    // (n-1)-n
    for (int i = 0; i < length; i++) {
      // 当i=0时,遍历length-0的数据，j=0、1、2、3...length-0，当arr[0]>arr[j]时,交换0与j的位置
      // 当i=1时,遍历length-1的数据，j=0、1、2、3...length-1，当arr[1]>arr[j]时,交换0与j的位置
      // ...
      // 当i=length-1时,遍历length-(length-1))的数据，j=0、1、2、3...length-1，当arr[0]>arr[j]时,交换0与j的位置
      int minIndex = i;// 最小值的下标
      for (int j = i + 1; j < length; j++) {
        minIndex = arr[minIndex] > arr[j] ? j : minIndex;
      }
      transfer(arr, i, minIndex);
    }
  }

  private void transfer(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
