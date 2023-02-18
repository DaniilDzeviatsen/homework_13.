import java.util.Arrays;

public class IntList {

    private int[] list;

    public IntList() {

    }

    public IntList(int[] list) {
        this.list = Arrays.copyOf(list, list.length);
    }

    public String toString(int[] list) {
        return Arrays.toString(list);
    }

    public int getIndex(int index) {
        return list[index];
    }

    public int size(int[] list) {
        return list.length;
    }

    public int set(int index, int element) {
        int a = list[index];
        list[index] = element;
        return a;
    }

    public void increaseArr(int element) {
        int[] Arr = new int[list.length + 1];

        System.arraycopy(list, 0, Arr, 0, list.length);
        Arr[list.length] = element;
        list = Arr;
    }

    public int decreaseArr(int index) {
        int[] newArr = new int[list.length - 1];
        System.arraycopy(list, 0, newArr, 0, index);
        System.arraycopy(list, index + 1, newArr, index, newArr.length - index);
        list = newArr;
        return list[index];
    }

    public int[] subList(int startIndexInclusive, int endIndexExclusive) {
        int[] intList = new int[endIndexExclusive - startIndexInclusive];
        System.arraycopy(list, startIndexInclusive, intList, 0, endIndexExclusive - startIndexInclusive);
        return intList;
    }

    public int[] sublist(int startIndexInclusive) {
        int[] intList = new int[list.length - startIndexInclusive];
        System.arraycopy(list, startIndexInclusive, intList, 0, list.length - startIndexInclusive);
        return intList;
    }

    public int lastIndexOf(int element) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public void sort() {
        int tempr;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    tempr = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tempr;
                }
            }

        }
    }

    public int[] getList() {
        return list;
    }
}