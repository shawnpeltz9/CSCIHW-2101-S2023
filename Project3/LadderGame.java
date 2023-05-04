package Project3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LadderGame {
    
    private int[][] ladder;
    private ArrayList<Integer> userSelections;
    private static int lives;
    
    public LadderGame(int panels, int lives) {
        this.ladder = new int[panels][2];
        this.userSelections = new ArrayList<>();
        LadderGame.lives = lives;
        generateLadder();
    }


    // Get total lives method
    public int getLives() {
        return lives;
    }
    
    // Lose a life method
    public void death() {
        lives--;
    }
    
    // Random ladder placement method
    private void generateLadder() {
        Random rand = new Random();
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = rand.nextInt(2); // 0 represents regular , 1 represents tempered
            }
        }
    }
    
    // Ladder row method
    private void printRow(int row) {
        System.out.print("|");
        for (int j = 0; j < ladder[row].length; j++) {
            if (ladder[row][j] == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            System.out.print("|");
        }
    }
    
    // Print ladder method
    public void printCurrentLadder(int curRow) {
        System.out.println("Current Ladder:");
        for (int i = 0; i < ladder.length; i++) {
            if (i == curRow) {
                System.out.print(">");
            } else {
                System.out.print(" ");
            }
            printRow(i);
            System.out.println();
        }
    }
    
    // Print the right ladder method
    public void printAnswerLadder() {
        System.out.println("Answer Ladder:");
        for (int i = 0; i < ladder.length; i++) {
            printRow(i);
            System.out.println();
        }
    }
    
    // Blank ladder method
    public void printBlankLadder() {
        System.out.println("Blank Ladder:");
        for (int i = 0; i < ladder.length; i++) {
            System.out.println("| |");
        }
    }
    
    // User selection method
    public void getUserSelection() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a panel number: ");
        int userSelection = input.nextInt();
        userSelections.add(userSelection);
    }

    // Start playing the game method
    public void play() {
        int currentRow = 0;
        while (currentRow < ladder.length) {
            printCurrentLadder(currentRow);
            getUserSelection();
            if (userSelections.get(userSelections.size() - 1) == ladder[currentRow][0]) {
                currentRow++;
            } else {
                death();
                if (lives == 0) {
                    System.out.println("You have lost all your lives. Game over.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations! You have reached the top of the ladder!");
    }
    public static void main(String[] args) {
        LadderGame game = new LadderGame(5, 3);
        game.printAnswerLadder();
        game.printBlankLadder();
        int currentRow = 0;
        while (currentRow < game.ladder.length) {
            game.printCurrentLadder(currentRow);
            game.getUserSelection();
            int userSelection = game.userSelections.get(game.userSelections.size() - 1);
            int answer = game.ladder[currentRow][userSelection];
            if (answer == 0) {
                game.death();
                if (game.getLives() == 0) {
                    System.out.println("You Lost!");
                    System.out.println();
                    return;
                }
            } else {
                currentRow++;
            }
        }
        System.out.println("You Won! Congrats!");
        System.out.println();
    }    
}







}
