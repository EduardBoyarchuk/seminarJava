package seminars;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SeminarThree {
    int colNumRand = 101;
    ArrayList<Integer> newArrayList = new ArrayList<>();


    public ArrayList<Integer> NewArList(){
        Random random = new Random();


        for ( int i = 0; i < 101; i++){
            newArrayList.add(random.nextInt(colNumRand));
        }
        System.out.println("Количество первоначальное:" + newArrayList.size());
        for(int element: newArrayList){
            System.out.print(element + " ");
        }
        return newArrayList;

    }

    public void OddNum(){
        System.out.println();
        newArrayList.removeIf(n ->(n %2 == 0));
        System.out.println("\nЭто без Четных чисел");
        System.out.println("Количество элементов без четных чисел: " + newArrayList.size());


        for(int elem: newArrayList){
            System.out.print(elem + "  ");
        }
    }
        public void MinMaxElem(){
            int minEl = Collections.min(newArrayList);
            System.out.println("\nМинимальный  " + minEl);
            int maxEl = Collections.max(newArrayList);
            System.out.println("\nМинимальный  " + maxEl);
            int sum = newArrayList.stream().mapToInt(Integer::intValue).sum();
            System.out.println("\nСуммв элементов: " + sum);
            System.out.println("\nСреднее значение: " + sum/2);
    }
}
