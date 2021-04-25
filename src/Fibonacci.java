
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private int a = 0;
    private int b = 1;
    private int c = 0;
    private List<Integer> fibonacci = new ArrayList<>();
    protected List<Integer> printFibonacci(int values){
        if(values > 0){
            c = b + a;
            a = b;
            b = c;
            // System.out.println(" "+c);
            fibonacci.add(c);
            printFibonacci(values-1);
        }
        return fibonacci;
    }

    protected void setFibonacii(int value1,int value2){
        fibonacci.add(value1);
        fibonacci.add(value2);
    }

    public static void main(String []args){
        int count = 20;
        Fibonacci fib = new Fibonacci();
        fib.setFibonacii(0,1);
        System.out.println(fib.printFibonacci(count-2));
    }
}
