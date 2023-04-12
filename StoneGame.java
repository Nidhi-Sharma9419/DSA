package Recursionofdynamicquestion;

public class StoneGame {
    public static int solve(int stones[], int i){
        if(i>=stones.length){
            return 0;
        }
        int a,b,c;
        b = Integer.MIN_VALUE;
        c = Integer.MAX_VALUE;
        a = stones[i] - solve(stones, i+1);
        if(i+1<stones.length){

        }
    }
}
