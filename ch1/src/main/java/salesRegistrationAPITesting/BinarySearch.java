package salesRegistrationAPITesting;

import java.util.List;

public class BinarySearch {
    //27 str
    public static Integer binary_search(List<Integer> list, Integer item) {
        int low = 0, high = list.size() - 1;
        Integer mid, guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = list.get(mid);
            if (guess == (item)) {//if (guess == (item)) не будет работать для item > 127, т.к. у JVM есть внутренний пул Integer-ов от -127 до 127 и когда мы передаем данные из этого пула - == для нас срабатывает, т.к. в пуле есть эти объекты и они имеют одинаковые ссылки, как только мы создаем Item>127 - то это будут уже разные объекты в Heap.
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(binary_search(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 127), 127));
        Integer I = new Integer(1);
        Integer II = new Integer(1);
        int i = 1;
        int ii = 1;
        System.out.println("I==II = " + (I == II));
        System.out.println("I.equals(II) = " + (I.equals(II)));
        System.out.println("i==ii = " + (i == ii));
        System.out.println("i.equals(ii) = compilationError");
        System.out.println("I==i = " + (I == i));//приведение работает для Integer==int
        System.out.println("I.equals(i) = " + (I.equals(i)));

    }
}
