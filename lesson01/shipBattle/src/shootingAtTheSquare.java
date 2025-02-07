import java.util.Random;
import java.util.Scanner;

public class shootingAtTheSquare {

    public static void printBoard(char[][] grid) {
        System.out.println("  0   1   2   3   4 ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + grid[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        char[][] grid = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = '-';
            }
        }


        System.out.print("Choose target size (1 for single cell, 3 for area of 3 cells): ");
        int targetSize = scanner.nextInt();


        while (targetSize != 1 && targetSize != 3) {
            System.out.print("Invalid input! Choose 1 for single cell, 3 for area of 3 cells: ");
            targetSize = scanner.nextInt();
        }


        boolean isHorizontal = random.nextBoolean();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5); 


        if (targetSize == 3) {
            if (isHorizontal) {
                if (targetCol > 2) targetCol -= 2;
            } else {
                if (targetRow > 2) targetRow -= 2;
            }
        }


        boolean[] targetHits = new boolean[3];
        System.out.println("All set. Get ready to rumble!");

        boolean gameOver = false;
        while (!gameOver) {
            printBoard(grid);


            int row = -1, col = -1;


            while (row < 0 || row >= 5) {
                System.out.print("Enter row (0-4): ");
                if (scanner.hasNextInt()) {
                    row = scanner.nextInt();
                    if (row < 0 || row >= 5) {
                        System.out.println("Invalid row. Please enter a value between 0 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 4.");
                    scanner.next();
                }
            }


            while (col < 0 || col >= 5) {
                System.out.print("Enter column (0-4): ");
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                    if (col < 0 || col >= 5) {
                        System.out.println("Invalid column. Please enter a value between 0 and 4.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 4.");
                    scanner.next();
                }
            }


            boolean hitTarget = false;
            if (targetSize == 1) {
                if (row == targetRow && col == targetCol) {
                    hitTarget = true;
                    grid[row][col] = 'x';
                    gameOver = true;
                }
            } else if (targetSize == 3) {
                if (isHorizontal) {
                    for (int i = 0; i < 3; i++) {
                        if (row == targetRow && col == targetCol + i && !targetHits[i]) {
                            hitTarget = true;
                            targetHits[i] = true;
                            grid[row][col] = 'x';
                        }
                    }
                } else {
                    for (int i = 0; i < 3; i++) {
                        if (col == targetCol && row == targetRow + i && !targetHits[i]) {
                            hitTarget = true;
                            targetHits[i] = true;
                            grid[row][col] = 'x';
                        }
                    }
                }
            }


            if (!hitTarget) {
                grid[row][col] = '*';
            }

            if (targetSize == 3) {
                gameOver = true;
                for (boolean hit : targetHits) {
                    if (!hit) {
                        gameOver = false;
                        break;
                    }
                }
            }

            if (gameOver) {
                System.out.println("You have won!");
            }
        }

        printBoard(grid);

        scanner.close();
    }
}
