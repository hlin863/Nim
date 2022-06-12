import java.util.ArrayList;

public class AI {
    int score; // score of the AI

    public AI() {
        score = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public boolean hasEven(int[] piles){

        int result = 0;

        for (int i = 0; i < piles.length; i++){
            if (piles[i] != 0){
                result += 1;
            }
        }

        if (result % 2 == 0){
            return true;
        } else {
            return false;
        }

    }

    ArrayList<Integer> getAvailable(int[] piles){
        ArrayList<Integer> available = new ArrayList<Integer>();
        for (int i = 0; i < piles.length; i++){
            if (piles[i] != 0){
                available.add(i);
            }
        }
        return available;
    }

    public int[] move(int[] piles){
        // checks whether the number of piles are odd or even

        if (this.hasEven(piles)){
            
            // if the number of piles are even, the AI will take the parts of a pile
            int random = (int) (Math.random() * (piles.length - 1));

            while (piles[random] == 0){
                random = (int) (Math.random() * (piles.length - 1));
            }

            int pieces = (int) (Math.random() * (piles[random] - 1)) + 1;

            piles[random] -= pieces;

        } else {
            // if the number of piles are odd, the AI will take an entire pile
            
            // generate a random number between 0 and the number of piles
            int random = (int) (Math.random() * (piles.length - 1));

            piles[random] = 0;

        }
        
        // return the piles after the move
        return piles;
    }

}
