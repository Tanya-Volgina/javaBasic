public class task3 {
    public static void main(String[] args) {
        int[] array = {-3, 205, 111, 2, 100};

        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[0] + array[array.length/2];
        }

        System.out.println(sum);
    }
}


