/**
 * Created by Nazli on 2015-06-19.
 */
import java.util.*;

public class UF {
    int[] arrayOfNumber;
    int p;
    int q;

    public boolean connected (int p, int q){

    }
    public void union (int p, int q){

    }
    public UF(int[] numbers){

        for (int i : numbers){
            arrayOfNumber[i] = i;
        }
        while (arrayOfNumber!= null) {
            union(arrayOfNumber[p], arrayOfNumber[q]);
            boolean result = connected(arrayOfNumber[p], arrayOfNumber[q]);
        }
        union(p, q);
        connected(p, q);

    }
}

