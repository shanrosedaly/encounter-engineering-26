/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollercoaster;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Rollercoaster {

   
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Please Board The Demonator");
        TimeUnit.SECONDS.sleep(6);
            System.out.println("Welcome to the Demonator");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Keep Your Arms And Legs Inside The Vehicle At All Times, The Ride Will Begin Shortly");
        TimeUnit.SECONDS.sleep(2);
        int first = 3;
        int second = 2;
        int third = 1;
        System.out.println(first);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(second);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(third);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("GO!");
        System.out.println("(ride begins to climb)");
        TimeUnit.SECONDS.sleep(2);
        
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
            System.out.println("click");
            TimeUnit.SECONDS.sleep(1);
            }else {
            System.out.println("clack");
            TimeUnit.SECONDS.sleep(1);
            }
        }
        
        System.out.println("(ride waits suspensfully at the top)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(roller coaster drops)");
        System.out.println("aaaaaaaaaahhhhhhhhhhh");
       
            //start user input
            Scanner myObj = new Scanner(System.in);
            System.out.println("left or right");
            String path = myObj.nextLine();
        
        /*if(!"left".equals(path) & !"right".equals(path)) {
            System.out.println("choice not defined");
            TimeUnit.SECONDS.sleep(2);
        }*/
            
        if("left".equals(path))
        {
            System.out.println("You are greeted by forboding smoke whirling from below");
            TimeUnit.SECONDS.sleep(2);
            //scary music
            System.out.println("Was this a wise choice?");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Are you really ready to die?!");
            TimeUnit.SECONDS.sleep(2);
        } else{
            System.out.println("You thought you picked right...");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("but you picked WROOOOOONG!!!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("DUN");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("DUN");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("DUUUUUUUN");
            TimeUnit.SECONDS.sleep(3);
            //peaceful music for 2 seconds, then scary music
        }
        System.out.println("Heavens above! You are approaching the mouth of a giant demon!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You are now entering the mouth of the demon..."); //try the o thing
        TimeUnit.SECONDS.sleep(2);
        
        
            Scanner input1 = new Scanner(System.in);

            System.out.println("As you make it through, you see two loops creeping up on the horizon...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Take your pick. One loop or two loops?");

            String loopDecision = input1.nextLine();
        
        /*if (!"one loop".equals(loopDecision) & !"two loops".equals(loopDecision)) {
            System.out.println("choice not defined");
            TimeUnit.SECONDS.sleep(2);
        }*/
        if ("two loops".equals(loopDecision)) {
            System.out.println("What a brave, dark soul you have!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You whiz through two trecharous loops lined with RITUAL TORCHEEEEEHS!");
            TimeUnit.SECONDS.sleep(3);
        } else {
            System.out.println("Uh oh.. it looks like the controls are under the influence of a voodoo spell.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You are forced to whiz through two trecharous loops lined with RITUAL TORCHEEEEHS!");
            TimeUnit.SECONDS.sleep(3);
        }
            Scanner input2 = new Scanner(System.in);

            System.out.println("Just when you thought the torment was over...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("you approach an inline twist and begin to twist 360 degrees over and over");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("You realize there is a ghost whizzing about");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("...and it wants to steal your soul..");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("What is your ghost busting weapon of choice?");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Rosemary, vaccuum, or rosary?");
            TimeUnit.SECONDS.sleep(2);

            String ghostDecision = input2.nextLine();
    
        /*if(!"rosemary".equals(ghostDecision) & !"vaccuum".equals(ghostDecision) & !"rosary".equals(ghostDecision)) {
            System.out.println("choice not defined");
            TimeUnit.SECONDS.sleep(2);
        }*/
            
        if ("rosemary".equals(ghostDecision)) {
            System.out.println("THE GHOST HAS GOTTEN STRONGER AND MORE DEMONIC AND SWIRLS AROUND YOU FRANTICALLY");
            TimeUnit.SECONDS.sleep(4);
        } else if("vaccuum".equals(ghostDecision)) {
            System.out.println("Shhllllllp; the ghost has been slurped up by the vaccuum.");
            TimeUnit.SECONDS.sleep(3);
        } else {
            System.out.println("The ghost laughs histerically at you!");
            TimeUnit.SECONDS.sleep(2);
        }
        
        System.out.println("Miraculously, you escape getting possessed");
        TimeUnit.SECONDS.sleep(2);
        
            Scanner input3 = new Scanner(System.in);

            System.out.println("But wait!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You begin to hear horrifying barks");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You turn around and see that wolves are approaching from behind!");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("You have another choice to make");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Do you choose the death drop, in which you will lose the wolves, but climb up to a petrifying 300ft. drop?");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Or do you choose suicide lane, in which the swiftly approaching wolves will be able to follow you down the shorter drop?");
            TimeUnit.SECONDS.sleep(5);
            
            String wolvesDecision = input3.next();
         
 
        if ("death drop".equals(wolvesDecision)) { //NOT WORKING
            System.out.println("Fortunately, the wolves do not dare to climb to the death drop.");
            TimeUnit.SECONDS.sleep(4);
            System.out.println("However..");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("You are now stuck with this horrible fate");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("ride begins to climb");
            TimeUnit.SECONDS.sleep(4);
            System.out.println("slowly,you get to the top of the climb");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("the car begins to tip over the edge...");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("ZOOOOOOM, you fly down the near 90 degree slope of the track");
            TimeUnit.SECONDS.sleep(4);
            //screams
            System.out.println("you slide onto level ground and see roaring fire whooshing from volcanoes");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Soon, the roller coaster approaches its end to meet other riders");
            TimeUnit.SECONDS.sleep(5);   
        } else {
            System.out.println("You chose to avoid the death drop, but the wolves are still approaching");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("their barks are getting louder and more terrifying");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Suddenly you feel one of them jolt your cart..");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("...but they begin to back off for what's ahead");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("you rush onto level ground and see roaring fire whooshing from volcanoes");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Soon, the roller coaster approaches its end to meet other riders");
            TimeUnit.SECONDS.sleep(5);  
            System.out.println("Thank you for riding the Demonator!");
            
        } 
        
    //add decision to ride again
    
    Scanner UserRideDecision = new Scanner(System.in);
    String answer = UserRideDecision.next();
    System.out.print("Would you like to ride the Demonator again? (yes/no)");
    String var= UserRideDecision.next();
    if(var.equalsIgnoreCase("Yes")){// Matches "Yes" or "yes"
      main(null); // if input is Yes then call main again. 
   } 

    }       
    
} 
