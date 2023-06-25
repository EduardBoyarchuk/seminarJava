package seminars;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SeminarSix {
    public static void main(String[] args) {
        Set<Integer> tel = new Set();
        System.out.println(tel.add(222));
        System.out.println("Proverka povtoreniya");
        System.out.println(tel.add(222));
        System.out.println("Dobavlenie");
        System.out.println(tel.add(123));
        System.out.println("Udalenie po kluchu");
        System.out.println(tel.remove(123));
        System.out.println("Kolichestvo elementov");
        System.out.println(tel.size());
        System.out.println("Proverka na pustotu");
        System.out.println(tel.isEmpty());
        System.out.println("Iteraciya");
        tel.add(333);
        tel.add(444);
        Iterator<Integer> iter = tel.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        System.out.println("Ochichaem Map");
        tel.clear();
        System.out.println("Proverka na pustotu");
        System.out.println(tel.isEmpty());
        System.out.println("Metod toString");
        tel.add(333);
        tel.add(444);
        tel.add(111);
        tel.add(222);
        String str = tel.toString();
        System.out.println(str);
        System.out.println("-----------------------------");
        int element = tel.get(5);
        System.out.println(element);

    }
}

class Set<E> {
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();


    public boolean add(E tel) {
        return set.put(tel, VALL) == null;
    }

    public boolean remove(E tel) {
        return set.remove(tel) == VALL;
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public Iterator<E> iterator() {
        return set.keySet().iterator();
    }

    public void clear(){
        set.clear();
    }

    //@Override
    public String toString() {
        return "toString{" + set.keySet() +
                '}';
    }
    public E get(int index) {
        if (index < 0 || index >= set.size()) {
            System.out.println("ВЫ ОШИБЛИСЬ С ИНДЕКСАМИ");
        }
        int i = 0;
        for (E element : set.keySet()) {
            if (i == index) {
                return element;
            }
            i++;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + set.size());
    }
}