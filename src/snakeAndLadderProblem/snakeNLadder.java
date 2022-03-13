package snakeAndLadderProblem;

public class snakeNLadder {
    public static void main(String[] args) {
        int player = 0;
        int SNAKE = 0;
        int LADDER = 0;
        System.out.println("Single Player at start position 0: " + player);
        int DIES = (int)((Math.random() * 10) % 6) +1;
        System.out.println("Number of Dies:" + DIES);
    }
}
