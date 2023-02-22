import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class HomewWork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int listLength = sc.nextInt();
        int[] list = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            System.out.println("Enter " + i + " element");
            list[i] = sc.nextInt();
        }
        IntList intList = new IntList(list);
        System.out.println(Arrays.toString(list));
        System.out.println("Enter task number");
        int taskNum = sc.nextInt();
        switch (taskNum) {
            case 1 -> System.out.println(intList);
            case 2 -> {
                System.out.println("Enter index of element you want to get");
                int index = sc.nextInt();
                System.out.println("Your element value is " + intList.getElement(index));
            }
            case 3 -> {
                System.out.println("Enter index you want to change value of");
                int index = sc.nextInt();
                System.out.println("Enter value you want to input instead");
                int element = sc.nextInt();
                System.out.println(intList.set(index, element));
            }
            case 4 -> {
                System.out.println("Your list size is " + intList.size());
            }
            case 5 -> {
                System.out.println("Enter value of the element you want to input");
                int element = sc.nextInt();
                intList.add(element);
                System.out.println("Your current list is " + intList);
            }
            case 6 -> {
                System.out.println("Enter index you want to exclude");
                int index = sc.nextInt();
                intList.remove(index);
                System.out.println("Your current list is " + intList);
            }
            case 7 -> {
                System.out.println("Enter startIndexInclusive");
                int startIndexInclusive = sc.nextInt();
                System.out.println("Enter endIndexExclusive");
                int endIndexExclusive = sc.nextInt();
                System.out.println(intList.subList(startIndexInclusive, endIndexExclusive));
            }
            case 8 -> {
                System.out.println("Enter startIndexInclusive");
                int startIndexInclusive = sc.nextInt();
                System.out.println(intList.sublist(startIndexInclusive));
            }
            case 9 -> {
                System.out.println("Enter element value");
                int element = sc.nextInt();
                System.out.print("Last index of " + element + " - ");
                System.out.println(intList.lastIndexOf(element));
            }
            case 10 -> {
                intList.sort();
                System.out.println("Sorted array- " + intList);
            }
        }
    }

}
