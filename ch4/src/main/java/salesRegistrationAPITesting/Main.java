package salesRegistrationAPITesting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //4.1
    public static Integer plainSum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    //4.2
    public static int recSum(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            int lastElementInx = list.size() - 1;
            var innerList = new ArrayList<Integer>();
            for (int i = 0; i < lastElementInx; i++) {
                innerList.add(list.get(i));
            }
            return list.get(lastElementInx) + recSum(innerList);
        }
    }

    public static Integer findBiggest(List<Integer> list) {
        Integer smallest = list.get(0);
        int smallest_index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > smallest) {
                smallest_index = i;
                smallest = list.get(i);
            }
        }
        return smallest_index;
    }

    //4.3
    public static int findBiggestRec(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else if (list.size() == 1) {
            return 0;
        } else if (list.size() == 2) {
            int biggestIndex = (list.get(0) > list.get(1)) ? 0 : 1;
            return biggestIndex;
        } else {
            int lastElementInx = list.size() - 1;
            int biggest = list.get(lastElementInx);
            var innerList = new ArrayList<Integer>();
            for (int i = 0; i < lastElementInx; i++) {
                innerList.add(list.get(i));
            }
            var indexOfSecondBiggest = findBiggestRec(innerList);
            var secondBiggest = list.get(indexOfSecondBiggest);
            return (biggest > secondBiggest) ? lastElementInx : indexOfSecondBiggest;
        }


    }

    public static void main(String[] args) {
        List<Integer> listZero = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(1);
        listTwo.add(1);
        List<Integer> listSeven = new ArrayList<>();
        listSeven.add(1);
        listSeven.add(1);
        listSeven.add(1);
        listSeven.add(1);
        listSeven.add(1);
        listSeven.add(1);
        listSeven.add(1);
        int sumZero = 0;
        int sumRecZero = 0;
        sumZero = plainSum(listZero);
        sumRecZero = recSum(listZero);
        System.out.println("sumZero = " + sumZero);
        System.out.println("sumRecZero = " + sumRecZero);

        int sumTwo = 0;
        int sumRecTwo = 0;
        sumTwo = plainSum(listTwo);
        sumRecTwo = recSum(listTwo);
        System.out.println("sumTwo = " + sumTwo);
        System.out.println("sumRecTwo = " + sumRecTwo);

        int sumSeven = 0;
        int sumRecSeven = 0;
        sumSeven = plainSum(listSeven);
        sumRecSeven = recSum(listSeven);
        System.out.println("sumSeven = " + sumSeven);
        System.out.println("sumRecSeven = " + sumRecSeven);

        List<Integer> listThree = new ArrayList<>();
        listThree.add(3);
        listThree.add(33);
        listThree.add(333);
        listThree.add(3333);
        listThree.add(33333);
        System.out.println("findBiggest(listThree) = " + findBiggest(listThree));
        System.out.println("findBiggestRec(listThree) = " + findBiggestRec(listThree));
    }
}