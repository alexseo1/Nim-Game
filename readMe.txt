The game of Nim

Computer.java
    This class was a template for a Computer Nim player
     First I did if mode==1 to print Easy mode, and mode==2, to print Hard mode.
        Because when playing a game, the user should know which mode is which.
        And if user tries mode other than easy or hard, then I ended the program.
    Then I wrote constructor for the easy mode. 
        Easy mode was just a random number from 1 to half the pile.
        Then the remaining marbles = marbles - the random number.
    Then constructor for hard mode.
        There is a hack to winning the game always.
            You have to take marbles so the remaining pile always equals 63, 31, 15, 7, 3, 2.
            But if computer isnt able to because the player first does, then the computer takes random number from 1 to half the pile.
            But if computer is able to, then it takes enough marbles to make the remainign pile = 63, 31, 15, etc.
            I did power=2 and then power*2 because I didn't know how to do exponent (aha...)


Human.java
    Human.java was fairly simple.
    Human just takes any amount of marbles from 1 to half the pile.
    Made sure player can't take 0 or more than half.

Game.java
    Game.java was split into two conditions. 
    1. if player goes first, and 2. if computer goes first.
    They are both the same code except switched around to match the order of play.
    To make the output program neater and easier to read, I added colons, parentheses, stars, etc.
    To determine the winner, I coded so the last player to have taken from the pile is the loser, since they wouldve taken the last one.
    If computer's turn was last, person wins. and vice versa.
    I did this by equalling a variable to 1 after human has moved, and 2 after computer has moved.
    If the variable at the end equals 1 or the other, then the corresponding player loses.