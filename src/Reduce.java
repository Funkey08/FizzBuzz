public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int num = 100;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            counter++;
        }
        System.out.println(counter);
    }
}
