public class ISSL_Project {
private  int smallest = 1000000;
private  int largest = 1000000;
private boolean flag = false;
    public int smallestInteger(int[] numbers) throws Exception {
        if(numbers.length > 100000)
            throw new Exception("Number of arrays larger than 100000");
        int j = 0;
        for(int i = 0; i<numbers.length;i++){
           if(smallest > numbers[i]){
               if(numbers[i] < -1000000){
                   throw new Exception("Integer less than -1000000");
               }
               smallest = numbers[i];
           }
           if(largest < numbers[i]){
               if(numbers[i] > 1000000) {
                   throw new Exception("Integer Larger than 1000000");
               }
               largest = numbers[i];
           }
        }
        if(smallest < 0 && largest > 0){
            smallest = 1;
            flag = true;
            while(flag){
               flag = iterateOver(smallest,numbers);
               if(flag) {
                   smallest++;
               }
            }
        }else{
            flag = true;
            while(flag){
                flag = iterateOver(smallest,numbers);
                if(flag) {
                    smallest++;
                }
            }
        }
        return smallest;
    }

    private boolean iterateOver(int value, int[] numbers){
        for(int number: numbers){
            if(value == number)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        ISSL_Project project = new ISSL_Project();
        //System.out.println(8);
        try {
            System.out.println(project.smallestInteger(new int[]{-1,-3}) + " Ans");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}













