package org.kodluyoruz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Sos
        int counter = 0;
        int n = 0;
        int player = 0;
        int computer = 0;
        int row = 0;
        int column = 0;
        String turn = "player";
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        do {
            System.out.println("Enter n(3-7) that you prefer for game board(nxn): ");
            n = scan.nextInt();
        } while(n<3 || n>7);
        char[][] gameBoard = new char[n][n];
        gameBoard = createGameBoard(n, gameBoard);
        drawGameBoard(n, gameBoard);
        System.out.println();
        System.out.println("Player: " + player + " Computer: " + computer);
        // Skoru yaz
        // S seç
        while(true) {
            System.out.println("Choose position you play. First choose row, second choose column!");
            do {
                row = scan.nextInt();
                column = scan.nextInt();
            } while(gameBoard[row-1][column-1]=='X'||gameBoard[row-1][column-1]=='O');

            gameBoard[row - 1][column - 1] = 'X';
            drawGameBoard(n, gameBoard);
            counter++;

            // kontrol et ve eğer sos yaptıysan 1 arttır kendininkini.
            System.out.println("Player: " + player + " Computer: " + computer);
            if(counter==n*n) {
                break;
            }
            // O seçsin
            do {
                row = rand.nextInt(n) + 1;
                column = rand.nextInt(n) + 1;
            } while(gameBoard[row-1][column-1]=='X'||gameBoard[row-1][column-1]=='O');

            gameBoard[row - 1][column - 1] = 'O';
            drawGameBoard(n, gameBoard);
            // kontrol et ve eğer sos yaptıysa 1 arttır onunkini.
            counter++;
            System.out.println("Player: " + player + " Computer: " + computer);

            if(counter==n*n) {
                break;
            }
        }
        // eğer oyun bittiyse kazananı belirle




    }

    public static char[][] createGameBoard(int n, char[][] gameBoard) {

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                gameBoard[i][j] = ' ';
            }
        }
        return gameBoard;
    }

    public static void drawGameBoard(int n, char gameBoard[][]) {
        for(int i=0; i<n; i++) {
            System.out.println();
            for(int j=0; j<n; j++) {
                if(j==n-1) {
                    System.out.print(gameBoard[i][j]);
                } else {
                    System.out.print(gameBoard[i][j] + "|");
                }

            }
            System.out.println();
            for(int j=0; j<n; j++) {
                if(j==n-1) {
                    System.out.print("-");
                } else {
                    System.out.print("-+");
                }
            }
        }
    }


}
