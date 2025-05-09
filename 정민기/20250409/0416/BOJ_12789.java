import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        Stack<Integer> stack = new Stack<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
                count++;
            }

            if (num != count + 1) {
                stack.push(num);
            } else {
                count++;
            }

        }

        while (!stack.isEmpty() && (stack.peek() == count+1)) {
            stack.pop();
            count++;
        }

        if (N == count) {
            System.out.println("Nice");

        } else {
            System.out.println("Sad");
        }
    }
}