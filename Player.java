public class Player {
    
    int score; // score of the player

    public Player() {
        score = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
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

}
