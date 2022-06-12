public class GameInterface {

    public static void main(String[] args) {
        // initiate the AI and human Player
        AI ai = new AI();
        Player player = new Player();

        // initialise the game
        Game game = new Game();

        int[] piles = new int[]{3, 4, 5};

        int i = 0;

        int position;
        int number;

        while (!game.gameOver(piles, piles.length)) {
            // display the piles
            
            if (i % 2 == 0) {
                game.displayMessage("Player 1");
                piles = ai.move(piles);
            } else {
                System.out.println("Player 2's turn");
                position = game.getPosition();
                number = game.getNumber();
                piles = player.move(piles, number, position);
            }

            game.displayPiles(piles, piles.length);

            i += 1;
        
        }

        if (i % 2 == 0) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

    }
    
}
