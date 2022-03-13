package snakeAndLadderProblem;

public class snakeNLadder {
    public static void main(String[] args) {
        int player = 1; int SNAKE = 0; int LADDER = 2;
        System.out.println("Single Player at start position 0: " + player);

        int DIES = (int)((Math.random() * 10) % 6) +1;
        System.out.println("Number of Dies:" + DIES);

        int check = (int)(Math.random() * 3 + 1);
        if (check == SNAKE) {
            player = player - DIES;
            System.out.println("Player stays in the same position :" + player);
        }
            else if (check == LADDER) {
            player = player + DIES;
            System.out.println("Player Moves ahead :"+ player);
        }
        else
            System.out.println("Player moves Behind");
    }
}

