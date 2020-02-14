import java.util.*;

public class BOJ_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;

        T = Integer.parseInt(sc.nextLine());

        while(T-- > 0) {
            String str = sc.nextLine();
            String[] str_arr = str.split(" ");

            for(int i=0; i<str_arr.length; i++) {
                for(int j=str_arr[i].length()-1; j>=0 ;j--) {
                    System.out.print(str_arr[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}