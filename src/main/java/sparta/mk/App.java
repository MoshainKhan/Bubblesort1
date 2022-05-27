package sparta.mk;



import java.util.Arrays;
class App {

    // perform the bubble sort
    static void bubbleSort(int array[]) {
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int max = 0; max < size - i - 1; max++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (array[max] > array[max + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[max];
                    array[max] = array[max + 1];
                    array[max + 1] = temp;
                }
    }

    public static void main(String args[]) {

        int[] data = { 10,0,26,45,-8,81 };

        // call method using class name
        bubbleSort(data);

        System.out.println("Array is in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}