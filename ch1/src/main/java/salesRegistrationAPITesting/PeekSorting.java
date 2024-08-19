package salesRegistrationAPITesting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PeekSorting {
    public Integer findSmallest(List<Integer> arr) {
        Integer smallest = arr.get(0);
        int smallest_index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest_index = i;
                smallest = arr.get(i);
            }
        }
        return smallest_index;
    }

    public List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        for (Integer i : arr) {//int i = 0; i < arr.size(); i++ - позволит добавить только половину чисел, т.к. size() будет возвращать все меньшее кол-во
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }
        return newArr;
    }

    public static void main(String[] args) {
        var sorting = new PeekSorting();
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(2);
        list.add(2222222);
        list.add(999999999);
        list.add(888888888);
        list.add(999999999);
        list.add(888888888);
        list.add(999999999);
        list.add(888888888);
        list.add(999999999);
        list.add(888888888);
        list.add(22);
        list.add(222);
        list.add(999999999);
        list.add(888888888);
        list.add(222222);
        list.add(22222222);
        list.add(2222);
        list.add(22222);
        list.add(333333333);
        list.add(222222222);
        System.out.println("Before sorting - list.size() = " + list.size());

        var sortedList = sorting.selectionSort(list);
        System.out.println("after sorting - list.size() = " + list.size());
        System.out.println("after sorting - sortedList.size() = " + sortedList.size());
        for (Integer i : sortedList) {
            System.out.println(i);
        }
    }
}
