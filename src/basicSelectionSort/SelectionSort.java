package basicSelectionSort;

public class SelectionSort {
public void selectionSort(int[] arr) {
if (arr == null || arr.length <= 1) {
return;
}
for (int i = 0; i < arr.length - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < arr.length; j++) {
if (arr[j] < arr[minIndex]) {
minIndex = j;
}
}
if (minIndex != i) {
swap(arr, i, minIndex);
}
}
}
private void swap(int[] arr, int i, int j) {
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}


