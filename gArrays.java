public class gArrays {

    // Arrays: A collection of elements of the same data type stored in contiguous
    // memory locations.

    static void printArrays(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }

    static void print2DArrays(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // 1D Array Declaration and Initialization (Inline)
        // Syntax: dataType[] referenceVariable = {value1, value2, value3, ...};
        // Elements are stored in the heap memory, but the reference variable (arr) is
        // in the stack.
        int arr[] = { 1, 2, 3, 4, 5 };
        printArrays(arr, 5);

        // 1D Array Declaration and Initialization (Using new keyword)
        // Syntax: dataType[] referenceVariable = new dataType[size];
        // Default values are initialized to 0.
        // Memory
        // Elements are explicitly allocated memory in the heap, and the reference
        // variable (arr2) is in the stack.
        int arr2[] = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
        printArrays(arr2, 5);

        // 2D Array Declaration and Initialization (Inline)
        // Syntax - dataType[][] referenceVariable = { { value1, value2, value3 }, {
        // value1, value2, value3 }, { value1, value2, value3 } };
        // Elements are stored in the heap, and reference variable (arr3) is in the
        // stack.
        int arr3[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print2DArrays(arr3, 3, 3);

        // 2D Array Declaration and Initialization (Using new keyword)
        // Syntax: dataType[][] referenceVariable = new dataType[rows][columns];
        // Memory for the outer array (arr4) is allocated in the heap, and each inner
        // array is also allocated separately in the heap.
        int arr4[][] = new int[3][3];
        arr4[0][0] = 1;
        arr4[0][1] = 2;
        arr4[0][2] = 3;
        arr4[1][0] = 4;
        arr4[1][1] = 5;
        arr4[1][2] = 6;
        arr4[2][0] = 7;
        arr4[2][1] = 8;
        arr4[2][2] = 9;
        print2DArrays(arr4, 3, 3);

    }

}
