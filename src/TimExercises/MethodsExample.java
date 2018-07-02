package TimExercises;

public class MethodsExample {

    public static void main(String[] args){

        calculatedScore(true,10000,8,200);
        calculatedScore(true,800,5,100);


    }

    public static  int calculatedScore(boolean gameOver, int score, int levelCompleted,int bonus){


        if (gameOver==true){

            int finalScore = score + (levelCompleted * bonus);

            System.out.println(" The final score is " +finalScore);
            return finalScore;
        }

            return -1;

    }

}//class
