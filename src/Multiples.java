public class Multiples {
    public static void main(String[] args) {
        int threeCounter = 0;
        int fiveCounter = 0;
        for (int i = 3; i < 1000; i += 3) {
            threeCounter += 1;
        }
        for (int i = 5; i < 1000; i += 5) {
            fiveCounter += 1;
        }
        System.out.println(threeCounter + fiveCounter);
    }
}
