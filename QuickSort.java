// |t|    <=t    |    ?    |    >= t    |
//  l           i           j          u

public class Quicksort {
  public void quicksortLinkedList(int[] x, int lowerEnd, int upperEnd) {
    // Boundary case
    if (lowerEnd >= UpperEnd) {
      return;
    }
    
    // Goal: partition array around a particular value,
    // which is eventually placed in its correct position pivot
    pivot = x[lowerEnd];
    int i = lowerEnd;
    int j = upperEnd + 1;
    
    while (1 == 1) {
      while (i <= upperEnd && x[i] <= t) {
        i++;
      }
      while (j >= i && x[j] > t ) {
        j--;
      }
      if (i > j) {
        break;
      }
      swap(x, i, j);
    }
    swap(x, l, j);
    
    // Recursively sort the two partitions
    quicksortLinkedList(lowerEnd, pivot - 1);
    quicksortLinkedList(pivot, upperEnd);
  }

  public void swap(int[] x, int a, int b) {
    int temp = x[a];
    x[a] = x[b];
    x[b] = temp;
  }
}
