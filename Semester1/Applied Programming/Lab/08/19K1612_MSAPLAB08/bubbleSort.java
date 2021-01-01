public class BubbleSort01 {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
        if (arr[j] > arr[j+1])
        {
        // swap arr[j+1] and arr[i]
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        }
        }
        /* Prints the array */
        void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort01 ob = new BubbleSort01();
        int arr[] = {5, 3, 1, 9, 8, 2, 4,7};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
