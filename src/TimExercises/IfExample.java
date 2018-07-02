package TimExercises;

public class IfExample {

    public static void main(String[] args){

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <5000 && score>1000) {
//
//            System.out.println("This is your score " +score);
//        } else if (score <1000) {
//
//            System.out.println("This is 1000 block");
//        }
//
//        else {
//
//            System.out.println("Sorry not a valid score");
//        }

          if (gameOver==true){

              int finalScore = score + (levelCompleted * bonus);

              System.out.println(" The final score is " +finalScore);
          }

        boolean gameOver1 = true;
        int score1 = 10000;
        int levelCompleted1 = 8;
        int bonus1 = 200;

        if (gameOver==true){

            int finalScore1 = score1 + (levelCompleted1 * bonus1);

            System.out.println(" The final score is " +finalScore1);
        }
    }
}


