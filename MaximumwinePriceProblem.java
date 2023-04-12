package Recursionofdynamicquestion;

public class MaximumwinePriceProblem {
    public static int solve(int[] winePrice, int left, int right, int year) {
        if (left > right) return 0;
        //int year = winePrice.length - (right - left);
        int leftCost = winePrice[left] * year + solve(winePrice, left + 1, right,year+1);
        int rightCost = winePrice[right]*year + solve(winePrice, left, right-1,year+1);
        return Math.max(leftCost, rightCost);

    }

    public static int maxPrice(int[] winePrice){
        return MaximumwinePriceProblem.solve(winePrice,0,winePrice.length -1,1);

    }

    public static void main(String[] args){
        int[] winePrice = new int[]{2,3,5,1,4};
        System.out.println(MaximumwinePriceProblem.maxPrice(winePrice));
    }
}
