public class BubbleSort02 {
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap arr[j] and arr[j+1]
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
    }
    // IF no two elements were swapped by inner loop, then break
    if (swapped == false)
        break;
    
    }
    
    }
    static void printArray(int arr[], int size) {
    
        int i;
        for (i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 1, 9, 8, 2, 4,7 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

}

