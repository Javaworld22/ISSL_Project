
import java.util.ArrayList;
import java.util.List;

public class Question2 {

    protected int decodeIntegerUSB(int x){
        int maskUSB = -65536;
        x = x & maskUSB;
        x = x>>16;
        return x;
    }

    protected int decodeIntegerLSB(int x){
        int maskLSB = 65535;
        x = x & maskLSB;
        // x = x>>16;
        return x;
    }

    protected int encodeInteger(int x, int n){
        n = n<<(1<<(1<<(1<<1)));
        x = x | n;
        return x;
    }

    protected void encodeArray(int []a, int[] b, int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n;i++){
            a[i] = encodeInteger(a[i],b[i]);
            list.add(a[i]);
        }
        System.out.println(list);
    }

    protected void decodeArray(int []a){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int []a1 = new int[a.length];
        int []b1 = new int[a.length];
        for(int i=0;i<a.length;i++){
            a1[i] =  decodeIntegerUSB(a[i]);
            b1[i] = decodeIntegerLSB(a[i]);
            list1.add(a1[i]);
            list2.add(b1[i]);
        }
        System.out.println(list1);
        System.out.println(list2);

    }

    public static void main(String[] args) {
        // write your code here
        Question2 quest = new Question2();
        quest.encodeArray(new int[]{2,4,5}, new int[]{7,3,4},3);
        quest.decodeArray(new int[]{458754,196612,262149});

        //System.out.println(quest.decodeIntegerUSB(131076)+" Upper Digit");
        //System.out.println(quest.decodeIntegerLSB(131076)+" LSB Digit");
    }
}
