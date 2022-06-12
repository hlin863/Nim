public class Game {
    
    public void displayMessage(String playerName){
        System.out.println(playerName + "'s turn.");
    }

    public int getPosition(){
        return Integer.parseInt(System.console().readLine());
    }

    public int getNumber(){
        return Integer.parseInt(System.console().readLine());
    }

    public int calculateNimScore(int[] piles, int n){
        int nimSore = piles[0];
        for (int i = 1; i < n; i++){
            nimSore ^= piles[i];
        }
        return nimSore;
    }

    public boolean gameOver(int[] piles, int n){
        for (int i = 0; i < n; i++){
            if (piles[i] != 0){
                return false;
            }
        }
        return true;
    }

    public void displayPiles(int[] piles, int n){
        for (int i = 0; i < n; i++){
            System.out.print(piles[i] + " ");
        }
        System.out.println();
    }

}
