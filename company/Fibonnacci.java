package company;
import java.util.Scanner;
public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numTerms = sc.nextInt();

        int prevNum = 0;
        int currNum = 1;
        System.out.print(prevNum + " " + currNum + " ");
        for (int i = 2; i < numTerms; i++) {
            int nextNum = prevNum + currNum;
            System.out.print(nextNum + " ");
            prevNum = currNum;
            currNum = nextNum;
        }
    }
}
