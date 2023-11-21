package pr2;

public class exercise1 {
        private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        public void sumWithFor() {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Сумма чисел массива (for): " + sum);
        }

        public void sumWithWhile() {
            int sum = 0;
            int i = 0;
            while (i < arr.length) {
                sum += arr[i];
                i++;
            }
            System.out.println("Сумма чисел массива (while): " + sum);
        }

        public void sumWithDoWhile() {
            int sum = 0;
            int i = 0;
            do {
                sum += arr[i];
                i++;
            } while (i < arr.length);
            System.out.println("Сумма чисел массива (do-while): " + sum);
        }

        public static void main(String[] args) {
            exercise1 arraySum = new exercise1();
            arraySum.sumWithFor();
            arraySum.sumWithWhile();
            arraySum.sumWithDoWhile();
        }

}
