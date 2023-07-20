import java.util.Scanner;

public class BuyAndSellStocks1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println(stock(array,n));
    }
    static int stock(int[] array,int n){
        if(n<2){
            return 0;
        }else {
            int min = array[0];
            int max = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (max < array[i] - min) {
                    max = array[i] - min;
                }
            }
            return max;
        }
    }
}
