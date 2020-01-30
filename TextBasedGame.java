
// AHS

import java.util.*;
import java.io.*;

public class TextBasedGame {

    public static void main(String[] args) {
        Scanner scan1 =  new Scanner(System.in);
        String GM = null;


        String PName = null;
        System.out.println("Welcome! \n\n What's your name ?");

        PName = scan1.nextLine();
        Player p1 = new Player(PName);
        System.out.println("Hello   " + PName + " Are you ready to start Playing?");
        System.out.println("easy: 1 \nmedium: 2 \nhard: 3 ");

        // setting the difficulty
        Scanner GameMode = new Scanner(System.in);
        GM = GameMode.nextLine();

        if(GM.equals("1")) {
            p1.PlayerHealth(50);
            p1.PlayerDmg(25);
        }
        else if (GM.equals("2")) {
            p1.PlayerHealth(40);
            p1.PlayerDmg(20);
        }
        else if(GM.equals("3") ){
            p1.PlayerHealth(30);
            p1.PlayerDmg(15);
        }
        else {
            p1.PlayerHealth(20);
            p1.PlayerDmg(10);
        }
        // Create health pot variables

        int healthPotHealing = 30;
        int healthPotDrop = 50;
        int helthPotNum = 1;

        // Main game loop
        boolean running = true;
        do {
            while(p1.GetHealth()> 0) {
                // Dialog to start every fresh round
                System.out.println("\t" +PName +"'s HP" + p1.GetHealth());
                System.out.println("\t\nWhat would you  like to do ? ");
                System.out.println("\t1. Explore !");
                System.out.println("\t2. Heal !");
                System.out.println("\t3. Exit !");

                try {
                    Thread.sleep(1500);
            }catch(Exception e){
                    e.printStackTrace();
                }
                String input1 = scan1.nextLine();
                if (input1.equals("1")) {
                    System.out.println("1");
                }
                else if( input1.equals("2")) {
                    if(helthPotNum >0){
                        System.out.println("\tYou drink a health potion, healing you for "+ healthPotHealing+ " HP !");
                        p1.GainHealth(healthPotHealing);
                        System.out.println("\tyou now have  " + p1.GetHealth() + " HP!");
                        helthPotNum -- ;
                        System.out.println("\tyou now have " + helthPotNum + " health potions remaining! \n");

                    }
                    else{
                        System.out.println("\tyou don't have any more health potions, slay enemies to have a chance at getting more health potions");
                    }
                    System.out.println("2");
                }
                else if(input1.equals("3")) {
                    System.out.println("3");
                    p1.PlayerHealth(0);
                    System.out.println("\tYou exit the Dungeon and finish your adventure. Thx 4 playing!");
                    running = false;
                }


        }
        }while(running);

        System.out.println("THX!");


        }

    }

