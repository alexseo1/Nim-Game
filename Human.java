/*****************************************
 * *
* @Alex Seo
* @date 11/10/2022
*
* This class is a template for a Human Nim player
*
****************************************/ 

import java.util.Scanner;

public class Human{
   
    private int choice;
    private Scanner input;
    
    public Human(){
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move(int marblesLeft){
    
        // your code here
        System.out.println("Enter the number of marbles you would like to remove (between 1 and half of remaining): ");
        choice = input.nextInt();
        if(marblesLeft>1){
            while((choice<1 || choice > marblesLeft/2) && choice != 1){//player has to input number from 1 to half the pile.
                System.out.println("Please follow instructions. Enter valid number.");
                choice = input.nextInt();//gives user chance to reenter number
            }
        }
    }
    
    
    public int getChoice(){
        return choice;
    }
    
    
}
