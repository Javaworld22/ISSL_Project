
import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    private int number;
    private List<Integer> prime = new ArrayList<>();

    protected  void PrintPrimeNumbers(int value) throws Exception {
        if(value > 100)
            throw new Exception("Number must be less than or equal to 100");
        for(int i = value; i >= 1; i-- ){ // zero and one are not included in prime numbers
            int counter = 0;
            for(number = i;number >= 1;number--){
                if(i%number == 0){ // This modulus checks if this number is divisible by any other number except 0 and itself
                    counter = counter + 1;
                }
            }
            if(counter == 2){
                prime.add(i);// Here adds it as a prime number since its divisible by 0 and itself
            }
        }
        System.out.println("Prime numbers are "+prime);
    }

    public static void main(String[] args) {
        PrimeNumbers prime = new PrimeNumbers();
        try {
            prime.PrintPrimeNumbers(99);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
