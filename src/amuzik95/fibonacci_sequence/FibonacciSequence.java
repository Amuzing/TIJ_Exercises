package amuzik95.fibonacci_sequence;
import java.util.ArrayList;

/**
 * Created by Amuzik on 31.01.2015.
 */
public class FibonacciSequence {
    public static ArrayList<Integer> getFibSeq(int n) {
        ArrayList<Integer> alTemp = new ArrayList<Integer>();
        int pf=1,nf=1,temp;
        alTemp.add(pf);
        alTemp.add(nf);
        n-=2;
        while(n>0) {
            temp=nf;
            nf+=pf;
            pf=temp;
            alTemp.add(nf);
            --n;
        }
        return alTemp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> printed = FibonacciSequence.getFibSeq(5);
        for(Integer i:printed)
            System.out.print(i+" ");
    }
}
