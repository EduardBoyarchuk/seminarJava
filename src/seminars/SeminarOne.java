package seminars;
import java.util.Random;
public class SeminarOne {
    public static int randBite() {
        Random random = new Random();
        int rand = random.nextInt(2000);
        int numBinary = Integer.SIZE - Integer.numberOfLeadingZeros(rand) - 1;
        return numBinary;
    }

    public  static int multiplesNumArray(int varRandBite) {
        int count = 0;
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            if (i % varRandBite == 0) count++;
        }
        System.out.print("Размер массива для кратных: ");
        System.out.println(count);
        return count;
    }

    public static void showArray(int count, int varRandBite) {
        short[] arr = new short[count];
        int index = 0;
        for (short i = 0; i < Short.MAX_VALUE ; i++) {
            if (i % varRandBite == 0) {
                arr[index] = i;
                index++;
            }
        }
        System.out.print(" Кратные: ");
        int countOne = 0;
        for (short element : arr) {
            System.out.print(element + " ");
            countOne++;
            if (countOne > 20) break;
        }
        System.out.println();
    }

    public static int notMultiplesNumArray(int varRandBite) {
        int count = 0;
        for (int i = 0; i > Short.MIN_VALUE; i--) {
            if (i % varRandBite != 0) count++;
        }
        System.out.print("Размер массива для не кратных: ");
        System.out.println(count);
        return count;
    }

    public static void showArrayNotMultiples(int count, int varRandBite) {
        short[] arr = new short[count];
        int index = 0;
        for (short i = 0; i > Short.MIN_VALUE ; i--) {
            if (i % varRandBite != 0) {
                arr[index] = i;
                index++;
            }
        }
        System.out.print(" НЕ кратные: ");
        int countTwo = 0;
        for (short element : arr) {
            System.out.print(element + " ");
            countTwo++;
            //System.out.print(countTwo);
            if (countTwo > 20) break;

        }
    }

}