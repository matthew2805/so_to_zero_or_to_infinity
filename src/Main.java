import java.util.Scanner;

public class Main {
    public static long factorial(int i){
        if ( i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
    public static long sumFactorial(int lim) {
        long sum =0L;
        for (int i = 1;i<lim+1;i++){
            sum+=factorial(i);
        }
        return sum;
    }
    public static double un(int n ) {
        return (1.0/factorial(n)) * sumFactorial(n);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        while((n = in.nextInt())<0){
            System.out.println("введите число больше нуля");
        }
        System.out.println(un(n));


    }
}