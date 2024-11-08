

import java.util.stream.LongStream;
public class Main {
 public static long getArithmeticProgressionSum(int a, int b) {
return LongStream.rangeClosed(a, b-1).sum();
}


    public static void main(String[] args) {
    int a = 10000000;
    int b = 1000000000;
    long sum = getArithmeticProgressionSum(a, b);
    System.out.println("Ответ: " + sum);
    }
}