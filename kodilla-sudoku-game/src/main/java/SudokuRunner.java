

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();

        System.out.println(SudokuGame.MENU);

        while (!gameFinished){
            theGame.printSudokuBoard();
            System.out.println (SudokuGame.SET_INPUT_INFORMATION);
            String userInput = scanner.nextLine();
            userInput=userInput.toUpperCase();
            if (userInput.equals("SUDOKU")){
            	System.out.println("Sudoku is being completed...");
                boolean sudokuSolved = theGame.resolveSudoku(theGame.getSB());
                if(sudokuSolved){
                    theGame.printSudokuBoard();
                    System.out.println ("SUDOKU completed :). Press any key to try again or type \"EXIT\" to exit the game.");
                    userInput = scanner.nextLine();
                    userInput=userInput.toUpperCase();
                    if(!userInput.equals("EXIT")) {
                        theGame = new SudokuGame();
                        continue;
                    }else {
                        gameFinished=true;
                        System.out.println("Bye.");
                    }
                }
            } else if (userInput.equals("EXIT")){
                gameFinished=true;
                System.out.println("Bye");
            } else {
                try {
                    theGame.setTheElement(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect data! Please specify numbers in the format '1,3,4' or type SUDOKU to complete the board. In order to exit the game please write EXIT.");
                }
            }
        }

        scanner.close();
    }
}