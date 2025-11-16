/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xiaowei
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random rand = new Random();
        int hoursStudied, hoursSlept, breaks; 
       
        //Prompt user
        while (true){
            System.out.print("Enter hours studied: ");
            hoursStudied = k.nextInt();
            if (hoursStudied >= 0 && hoursStudied <= 24){
                break;} //exits the loop when valid input is entered
            else{
                System.out.println("Error! The hours studied must be between 0 to 24 hours!");
        }
        }
  
        while (true){
            System.out.print("Enter hours slept: ");
            hoursSlept = k.nextInt();
            if (hoursSlept >= 0 && hoursSlept <= 24){
                break;}
            else{
                System.out.println("Error! The hours slept must be between 0 to 24 hours!");
        }
        }
        
        while (true){
            System.out.print("Enter breaks taken: ");
            breaks = k.nextInt();
            if (breaks >= 0 && breaks <= 10){
                break;}
            else{
                System.out.println("Error! Please enter a realistic value!");
        }
        }

        //Calculation
        int score = (hoursStudied*10)+(hoursSlept*2)-(breaks*2);
        System.out.println("Your productivity score is "+score);
        if (score>60){
            System.out.println("Excellent! Keep up the great work!");
        }
        else if (score>=30 && score<=60){
            System.out.println("Good effort, but balance your breaks!");
        }
        else {
            System.out.println("Try to plan your day better!");
        }
        
        //Tip of the day
        int tips = rand.nextInt(5); //up to 5 random tips
        switch (tips){
            case 0 : System.out.println("Tip of the Day: Revise your notes before sleeping.");
            break;
            case 1 : System.out.println("Tip of the Day: Take short breaks to refresh yourself.");
            break;
            case 2 : System.out.println("Tip of the Day: Create your own timetable to work effectively.");
            break;
            case 3 : System.out.println("Tip of the Day: Drink more water to stay hydrated and healthy.");
            break;
            case 4 : System.out.println("Tip of the Day: Keep distractions away and stay focus.");
        }
        k.close();
    }
}


    

