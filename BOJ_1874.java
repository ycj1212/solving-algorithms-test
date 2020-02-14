import java.util.*;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int testcase;
        int n = 1;
        int temp;
        //String result = "";
        //StringBuilder sb = new StringBuilder();
        ArrayList<String> str = new ArrayList<String>();

        testcase = sc.nextInt();

        for (int i=0; i<testcase; i++) {
            temp = sc.nextInt();

            while (n <= temp) {
                stack.push(n);
                //result += "+";
                //sb.append("+\n");
                str.add("+");
                n++;
            }

            do {
                //result += "-";
                //sb.append("-\n");
                str.add("-");
                if (stack.isEmpty()) {
                    //result = "NO";
                    //sb.replace(0, sb.length(), "NO");
                    System.out.println("NO");
                    return;
                }
            } while (temp != stack.pop());
        }
        
        /*
        if (!result.equals("NO")) {
            for (int i=0; i<result.length(); i++) {
                System.out.println(result.charAt(i)+"");
            }
        }
        else {
            System.out.println(result);
        }
        */

        for(int i=0; i<str.size(); i++) {
            System.out.println(str.get(i));
        }

        //System.out.print(sb.toString());

        sc.close();
    } 
}