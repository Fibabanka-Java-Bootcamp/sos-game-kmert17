package org.kodluyoruz;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // SOS
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
        System.out.println("Choose position you play. First choose row, second choose column!");
        do {
            row = scan.nextInt();
            column = scan.nextInt();
        } while(gameBoard[row][column]=='X'||gameBoard[row][column]=='O');

        gameBoard[row][column] = 'X';
        drawGameBoard(n, gameBoard);





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
