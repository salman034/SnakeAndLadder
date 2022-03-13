package snakeAndLadderProblem;

public class snakeNLadder {
    public static void main(String[] args) {
        int player = 1; int SNAKE = 0; int LADDER = 2;
        while (player < 100) {
            int DIES = (int)((Math.random() * 10) % 6) +1;
            System.out.println("Start position: " + DIES);

            int check = (int)(Math.random() * 3 + 1);
            if(check == LADDER) {
                player = player + DIES;
                System.out.println("Player position :" + player);
            }
                else if (check == SNAKE)
                    player = player - DIES;

                    if(player < 0)
                        player = 0;
                    else {
                        player = player + DIES;
                    }
            System.out.println("Position of Player: " + player);
        }
    }
}

