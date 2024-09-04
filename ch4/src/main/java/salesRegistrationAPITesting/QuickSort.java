package salesRegistrationAPITesting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> quickSort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            int pivot = array.get(0);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            for (int i = 1; i < array.size(); i++) {
                var tmp = array.get(i);
                if (array.get(i) >= pivot) {
                    greater.add(tmp);
                } else {
                    less.add(tmp);
                }
            }
            //less
            less = quickSort(less);
            greater = quickSort(greater);
            List<Integer> returnable = new ArrayList<>();
            returnable.addAll(less);
            returnable.add(pivot);
            returnable.addAll(greater);
            return returnable;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56101);
        list.add(55531);
        list.add(10045);
        list.add(83776);
        list.add(59857);
        list.add(60056);
        list.add(45435);
        list.add(18246);
        list.add(60423);
        list.add(78939);
        list.add(40852);
        list.add(38250876);
        list.add(67855);
        list.add(51965);
        list.add(21529);
        list.add(3429);
        list.add(2805);
        QuickSort quickSort = new QuickSort();
        var nn = quickSort.quickSort(list);
        for (var i : nn) {
            System.out.println(i);
        }

    }
}
