import java.util.*;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;

        T = Integer.parseInt(sc.nextLine());

        while (T-- > 0) {
            Stack<Character> stack = new Stack<Character>();
            String PS;
            int PS_size;
            boolean VPS_check = true;

            PS = sc.nextLine();
            PS_size = PS.length();

            if (2 <= PS_size && PS_size <= 50) {
                char temp;
                for (int i=0; i<PS_size; i++) {
                    temp = PS.charAt(i);
                    if (temp == '(') {
                        stack.push(temp);
                    }
                    else if (temp == ')') {
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                        else {
                            VPS_check = false;
                            break;
                        }
                    }
                }

                if (!stack.isEmpty()) {
                    VPS_check = false;
                } 

                if (VPS_check == true) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}