/*****************************************
*
* @Alex Seo
* @date 11/10/2022
*
* This class is a template for a Nim game
*
******************************************/

import java.util.*;

public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;


    public Game(int level){
        humanPlayer = new Human();
        computerPlayer = new Computer(level);
        marbles = (int) (Math.random() * (100 - 10)) + 10;//set the initial number of marbles in pile
        computerPlayer.start();


    }
    public void play(){
        Random r = new Random();
        int turn = 0;
        int firstMove = r.nextInt(2);

        if(firstMove == 0){//condition for if the player moves first
            while(marbles > 0){
                System.out.println("**Your Turn**");
                System.out.println("Marbles left in pile:" + "(" + marbles + ")");
                humanPlayer.move(marbles);
                marbles = marbles - humanPlayer.getChoice();
                turn=1;//turn=1 when human moves last
                if(marbles>0){
                    System.out.println("**Computer's Turn**");
                    System.out.println("Marbles left in pile:" + "(" + marbles + ")");
                    computerPlayer.move(marbles);
                    System.out.println("Number of marbles the computer took: " + "(" + computerPlayer.getChoice() + ")");
                    marbles = marbles - computerPlayer.getChoice();
                    System.out.println("Number of marbles left in pile: " + "(" + marbles + ")");
                    turn=0;//turn=0 when computer turns last
                }
            }

        }if(firstMove ==1){//condition if computer moves first
            while(marbles > 0){
                System.out.println("**Computer's Turn**");
                System.out.println("Marbles left in pile:" + "(" + marbles + ")");
                computerPlayer.move(marbles);
                System.out.println("Number of marbles the computer took: " + "(" + computerPlayer.getChoice() + ")");
                marbles = marbles - computerPlayer.getChoice();
                System.out.println("Number of marbles left in pile: " + "(" + marbles + ")");
                turn=0;//turn=0 when computer moves last
                if(marbles>0){
                    System.out.println("**Your Turn**");
                    System.out.println("Marbles left in pile:" + "(" + marbles + ")");
                    humanPlayer.move(marbles);
                    marbles = marbles - humanPlayer.getChoice();
                    turn=1;//turn=1 when human moves last
                }
            }
        }
        if(turn == 0){
            System.out.println("You Win!");//computer moved last so computer loses, player wins
        }else if(turn ==1){
            System.out.println("You Lose :(");//player moved last so player loses, computer wins
        }
    }

}

