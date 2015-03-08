package LabTwo;

import java.util.Random;

public class Dice {
       //Number for dice
	   private int num = 0;
       public Dice(int number){this.num = number;}
       public int getValue(){return this.num;}
       public void roll(int random){
    	   Random rand = new Random(random);
    	   this.num = rand.nextInt();
       }
}
