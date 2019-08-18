/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollercoaster;

import java.util.*;
import java.util.concurrent.TimeUnit;


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
        
    }
    
}
