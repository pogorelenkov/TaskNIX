public class DemoArr {
    public static void main (String args []) {
        int sample [] = new int [10];

        int x = 1;

        if (x==1) System.out.println("Работает");

        for (int i = 0; i < 10; i ++) {
            sample[i] = i + 10;
            System.out.println ("1 элeменет массива равен: " + sample[i]);
        }
    }
}
