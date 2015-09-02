package game;

import java.util.Scanner;

public class Menu {

  public static void main(String[] args){
    Menu m = new Menu();
    m.displayMenu();
    m.promptUserInput();
  }

  public void displayMenu(){
    System.out.println("Welcome to the Nubmer Guessing Game!");
    System.out.println("Type 1 to start a new game");
    System.out.println("Type 2 to start a new game with a user selected max value.");
    System.out.println("Type 3 to display author Info");
    System.out.println("Type 4 to exit");
  }

  public void promptUserInput(){
    System.out.print("Please enter your selection: ");
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    try{
      choice = scan.nextInt();
      if(choice == 1){
        GuessingGameLogic gg = new GuessingGameLogic(scan);
        gg.guessingGame();
      }else if(choice == 2){
    	GuessingGameLogic gg = new GuessingGameLogic(scan);
    	System.out.print("Please enter max value: ");
    	Scanner scanner = new Scanner(System.in); 
    	gg.maxValue = scanner.nextInt();
        System.exit(0);
      } else if(choice == 3){
        System.out.print("Joe Code - Best Programmer Ever");
      } else if(choice == 4){
    	System.exit(0);  
      }else{
        printErrorMessage();
      }
    }catch (IllegalStateException e){
      printErrorMessage();
    }
  }

  public void printErrorMessage(){
    System.err.println("Invalid input. Please start again.");
  }
} 