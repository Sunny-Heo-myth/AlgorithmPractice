package basic.sorting;

import static basic.sorting.Utils.swap;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array.length - 1; j >= array.length - i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    public static void bookBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    public static void backBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    public static void improvedBubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int exchangedCount = 0;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    exchangedCount++;
                }
            }
            if (exchangedCount == 0) {
                break;
            }
        }
    }

    public static void improved2BubbleSort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int lastIndex = array.length - 1;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    lastIndex = j;
                }
            }
            i = lastIndex;
        }
    }


}
