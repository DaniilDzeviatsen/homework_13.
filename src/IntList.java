import java.util.Arrays;

public class IntList {

    private int[] list;

    public IntList() {

    }

    public IntList(int[] list) {

        this.list = Arrays.copyOf(list, list.length);
    }

    public String toString() {
        return Arrays.toString(list);
    }

    public int getElement(int index) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return list[index];
    }

    public int size() {
        return list.length;
    }

    public int set(int index, int element) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int a = list[index];
        list[index] = element;
        return a;
    }

    public void add(int element) {
        int[] Arr = new int[list.length + 1];
        System.arraycopy(list, 0, Arr, 0, list.length);
        Arr[list.length] = element;
        list = Arr;
    }

    public int remove(int index) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int excluded = list[index];
        int[] newArr = new int[list.length - 1];
        System.arraycopy(list, 0, newArr, 0, index);

        System.arraycopy(list, index + 1, newArr, index, newArr.length - index);
        list = newArr;

        return excluded;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || startIndexInclusive > endIndexExclusive || endIndexExclusive > list.length - 1) {
            throw new IllegalArgumentException("Indexes are out of bounds or incorrect");
        }
        int[] shortlist = new int[endIndexExclusive - startIndexInclusive];
        System.arraycopy(list, startIndexInclusive, shortlist, 0, endIndexExclusive - startIndexInclusive);

        return new IntList(shortlist);
    }

    public IntList sublist(int startIndexInclusive) {
        if (startIndexInclusive < 0 || startIndexInclusive > list.length - 1) {
            throw new IllegalArgumentException("Indexes are out of bounds or incorrect");
        }
        int[] shortlist = new int[list.length - startIndexInclusive];
        System.arraycopy(list, startIndexInclusive, shortlist, 0, list.length - startIndexInclusive);
        return new IntList(shortlist);
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