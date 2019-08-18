/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollercoaster;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class RollerCoaster {

   
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Please Board The Demonator");
        for (int i = 0; i < 3; i++)
            TimeUnit.SECONDS.sleep(3);
        for (int passengers = 0; passengers <= 8; passengers++)
        if (passengers < 1)
            System.out.println("Waiting for more riders");
        else if (passengers == 8)
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
        System.out.println("click");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("clack");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("click");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("clack");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("click");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("(ride waits suspensfully at the top)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(roller coaster drops)");
        System.out.println("aaaaaaaaaahhhhhhhhhhh");
       //start user input
            Scanner myObj = new
       Scanner(System.in);
            System.out.println("Left or Right");
            String path = myObj.nextLine();
        if (path != "Left" + "Right");
            System.out.println("Path is Unavailable");
               if(path == "Left")
        {
            System.out.println("fire shoots out");
            //scary music
        }
        if(path == "Right")
        {
            System.out.println("You thought you picked right...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("but you picked WROOOOOONG!!!");
            System.out.println("DUN");
            System.out.println("DUN");
            System.out.println("DUUUUUUUN");
            //peaceful music for 2 seconds, then scary music
        }
        System.out.println("You are now entering the mouth of the demon."); //try the o thing
        
        
        Scanner input1 = new Scanner(System.in);

            System.out.println("Ahead, you see two loops creeping up on the horizon...");
            System.out.println("Take your pick. One loop or two loops?");

            String loop = input1.nextLine();
        
    }
    
}
