/*****************************************
 *
*
* @Alex Seo
* @date 11/10/2022
*
* This class is a template for a computer Nim player
*
******************************************/

import java.util.Random;

public class Computer{
    
    private int mode;
    private int choice;
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    

    public void start(){
        if(mode==1){
            System.out.println("You have selected EASY mode.");
        }else if(mode==2){
            System.out.println("You have selected HARD mode.");
        }else{
            System.out.println("This mode does not exist.");
            System.exit(0);//if user tries doing other mode, end program.
        }
    }


    public void move(int marblesLeft){
        if(mode ==1){//if easy mode..
            choice = (int) ((Math.random() * (marblesLeft/2))+1);
            marblesLeft = marblesLeft - choice;
            }else if(mode ==2){//if hard mode
                if(marblesLeft ==2 || marblesLeft ==3 || marblesLeft == 7 || marblesLeft == 15 || marblesLeft == 31 || marblesLeft ==63){
                    choice = (int) ((Math.random() * (marblesLeft/2))+1);
                    marblesLeft = marblesLeft - choice;//random choice if marble number = said numbers.
                }
            else{//guaranteed way of winning if marble number does not equal said numbers.
            int power = 2;
            while(power<marblesLeft){
                power = power*2;
            }
                power = power/2;
                int num = power-1;
                choice = marblesLeft - num;//choice the computer makes is number to make the pile equal 63, 31, etc..
            }
        }
    }
    public int getChoice(){
        return choice;
    }
}


