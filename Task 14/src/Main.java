public class Main {
    public static void main(String[] args) {
        int numbersArray[] = getNumbers();

        int minNumber = findMinNumber(numbersArray);
        System.out.println("min: " + minNumber);

        int maxNumber = findMaxNumber(numbersArray);
        System.out.println("max: " + maxNumber);

        compareNumbers(minNumber, maxNumber);
    }

    private static int[] getNumbers() {
        int array[] = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 41) - 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        return array;
    }

    private static int findMinNumber(int[] numbersArray) {
        int min = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] < min) {
                min = numbersArray[i];
            }
        }

        return min;
    }

    private static int findMaxNumber(int[] numbersArray) {
        int max = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] > max) {
                max = numbersArray[i];
            }
        }

        return max;
    }

    private static void compareNumbers(int minNumber, int maxNumber) {
        int absMinNumber = Math.abs(minNumber);
        int absMaxNumber = Math.abs(maxNumber);

        if (absMinNumber > absMaxNumber) {
            System.out.println("Модуль большего числа: " + absMinNumber);
        } else if (absMinNumber < absMaxNumber) {
            System.out.println("Модуль большего числа: " + absMaxNumber);
        } else {
            System.out.println("Модули равны");

        }
    }
}
