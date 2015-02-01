package amuzik95.fibonacci_sequence;
import java.util.ArrayList;

/**
 * Created by Amuzik on 31.01.2015.
 */
public class FibonacciSequence {
    public static int getFibNumber (int n) {
        if(n<2)
            return 1;
        return getFibNumber(n-1) + getFibNumber(n-2);
    }
    public static ArrayList<Integer> getFibSeq(int n) {
        ArrayList<Integer> alTemp = new ArrayList<Integer>();
        for(int i=0; i<n; ++i)
            alTemp.add(getFibNumber(i));
        return alTemp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> printed = FibonacciSequence.getFibSeq(5);
        for(Integer i:printed)
            System.out.print(i+" ");
    }
}
