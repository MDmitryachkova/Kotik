package Kotik;

import java.io.Console;
import java.io.IOException;

public class Kotik {
    public int hunger=3;
    public String food;

    public void liveAnotherDay() throws IOException {
        int restHours = 24;
        while (restHours > 0) {
            doHourActivity();
            restHours--;
        }
    }
 
    private void doHourActivity() throws IOException {
        if (hunger<=0){
            System.out.println("Kotik want eat!");
            char userInput =(char)System.in.read();
            if (userInput == 'Y') {
                eat();
            }
            return;
        }
        int randomNumber = (int) Math.floor(Math.random() * 6);
        switch (randomNumber) {
            case 0:
                play();
                break;
            case 1:
                sleep();
                break;
            case 2:
                attack();
                break;
            case 3:
                chaseMouse();
                break;
            case 4:
                meow();
                break;
            case 5:
                lookInTheCorner();
                break;
        }
    }
    public void play() {
        System.out.println("Kotik play");
        hunger--;
    }

    public void sleep() {
        System.out.println("Kotik zzzz");
        hunger--;
    }

    public void chaseMouse() {
        System.out.println("Kotik have mouse");
        hunger--;
    }

    public void meow() {
        System.out.println("Kotik meow");
        hunger--;
    }

    public void attack() {
        System.out.println("Kotik kus'");
        hunger--;
    }

    public void lookInTheCorner() {
        System.out.println("Kotik sees ghost'");
        hunger--;

    }

    public void eat(int foodUnits){
            hunger+=foodUnits;
    }
    public void eat(int foodUnits,String foodType){
        hunger+=foodUnits;
        food=foodType;
    }
    public void eat(){
        eat(3,"chicken");
    }
}


