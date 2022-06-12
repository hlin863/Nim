public class Nim {
    
    public int calculateNimScore(int[] piles, int n){
        int nimSore = piles[0];
        for (int i = 1; i < n; i++){
            nimSore ^= piles[i];
        }
        return nimSore;
    }

    public int[] move(int[] piles, int n, int m){
        if (n > piles[m]){
            piles[m] = 0;
            return piles;
        } else{
            piles[m] -= n;
            return piles;
        }
    }

    public void displayPiles(int[] piles, int n){
        for (int i = 0; i < n; i++){
            System.out.print(piles[i] + " ");
        }
        System.out.println();
    }

    public boolean gameOver(int[] piles, int n){
        for (int i = 0; i < n; i++){
            if (piles[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*  
         * Initialise a game board containing 3 coins in the first row
         *  4 coins in the second row
         *  5 coins in the third row
         */
        int[] piles = new int[]{3, 4, 5}; 
        Nim nim = new Nim();
        System.out.println("Nim score: " + nim.calculateNimScore(piles, piles.length));

        int score1 = -1;
        int score2 = -1;

        int i = 0;

        int n, m;

        while (!nim.gameOver(piles, piles.length)){

            if (i % 2 == 0){
                System.out.println("Player 1's turn");
                // let player enter int n and m.
                n = Integer.parseInt(System.console().readLine());
                m = Integer.parseInt(System.console().readLine());
                score1 = nim.calculateNimScore(nim.move(piles, 1, 0), piles.length);
            } else {
                System.out.println("Player 2's turn");
                n = Integer.parseInt(System.console().readLine());
                m = Integer.parseInt(System.console().readLine());
                score2 = nim.calculateNimScore(nim.move(piles, 1, 0), piles.length);
            }

            piles = nim.move(piles, n, m);

            // display the piles
            nim.displayPiles(piles, 3);

            i += 1;
        }

        if (score1 == 0){
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

}
