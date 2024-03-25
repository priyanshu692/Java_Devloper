package company;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numDisks = 3;
        char fromPeg = 'A';
        char toPeg = 'C';
        char tempPeg = 'B';

        solveHanoi(numDisks, fromPeg, toPeg, tempPeg);
    }

    public static void solveHanoi(int numDisks, char fromPeg, char toPeg, char tempPeg) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            return;
        }

        solveHanoi(numDisks - 1, fromPeg, tempPeg, toPeg);
        System.out.println("Move disk " + numDisks + " from peg " + fromPeg + " to peg " + toPeg);
        solveHanoi(numDisks - 1, tempPeg, toPeg, fromPeg);

    }
}
