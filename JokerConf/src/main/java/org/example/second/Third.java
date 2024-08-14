package org.example.second;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

//what will write next code?
/*
answer:
maybe write: Size: 3|A|null|C|
maybe write: Size: 2|A|null|C|
because: Therefore a key will automatically be removed only after the weak references to it, both inside and outside of the map, have been cleared by the garbage collector. But gc may not delete weakRef. -> size() == 3, but there only 2 'live' keys.
 */
public class Third {


    public static void main(String[] args) throws InterruptedException {
        WeakHashMap<Key, String> cache = new WeakHashMap<>(3);
        Key k1 = new Key(1);
        cache.put(k1, "A");
        Key k2 = new Key(2);
        cache.put(k2, "B");
        Key k3 = new Key(3);
        cache.put(k3, "C");
        k2 = null;
        System.out.println("Before gc:");
        System.out.print("Size: " + cache.size() + "|");
        System.out.print(cache.get(k1) + "|");
        System.out.print(cache.get(k2) + "|");
        System.out.print(cache.get(k3) + "|");
        Runtime.getRuntime().gc();
        TimeUnit.SECONDS.sleep(1);
        System.gc();
        System.out.println();
        System.out.println("After gc:");
        System.out.print("Size: " + cache.size() + "|");
        System.out.print(cache.get(k1) + "|");
        System.out.print(cache.get(k2) + "|");
        System.out.print(cache.get(k3) + "|");


    }

    private static class Key {
        private int i;

        public Key(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "i=" + i +
                    '}';
        }
    }
}
