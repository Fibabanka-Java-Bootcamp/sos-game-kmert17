package org.kodluyoruz;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //SOS
        int counter = 0;
        int n = 0;
        int player = 0;
        int computer = 0;
        int row = 0;
        int column = 0;
        String turn = "player";
        int determineS_OR_O;
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
        determineS_OR_O = rand.nextInt();
        if(determineS_OR_O%2==0) {
            System.out.println("You're S!");
            if(n==3) {
                while(true) {
                    System.out.println("Choose position you play. First choose row, second choose column!");
                    do {
                        row = scan.nextInt();
                        column = scan.nextInt();
                        //row = rand.nextInt(n) + 1;
                        //column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'S';
                    drawGameBoard(n, gameBoard);
                    if(row==1 && column==1) {
                        if(gameBoard[2][0]=='S'&&gameBoard[1][0]=='O') {
                            player++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[0][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==1 && column==3) {
                        if(gameBoard[0][0]=='S'&&gameBoard[0][1]=='O') {
                            player++;
                        }
                        if(gameBoard[2][0]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[1][2]=='O') {
                            player++;
                        }
                    }
                    else if(row==3 && column==1) {
                        if(gameBoard[0][0]=='S'&&gameBoard[1][0]=='O') {
                            player++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[2][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==3 && column==3) {
                        if(gameBoard[0][0]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[1][2]=='O') {
                            player++;
                        }
                        if(gameBoard[2][0]=='S'&&gameBoard[2][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==1 && column==2) {
                        if(gameBoard[2][1]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==2 && column==1) {
                        if(gameBoard[1][2]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==3 && column==2) {
                        if(gameBoard[0][1]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                    }
                    else if(row==2 && column==3) {
                        if(gameBoard[1][0]=='S'&&gameBoard[1][1]=='O') {
                            player++;
                        }
                    }

                    counter++;

                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);
                    if(counter==n*n) {
                        break;
                    }

                    do {
                        row = rand.nextInt(n) + 1;
                        column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'O';
                    drawGameBoard(n, gameBoard);

                    if(row==2 && column ==1) {
                        if(gameBoard[0][0]=='S'&&gameBoard[2][0]=='S') {
                            computer++;
                        }
                    } else if(row==3 && column ==2) {
                        if(gameBoard[2][0]=='S'&&gameBoard[2][2]=='S') {
                            computer++;
                        }
                    } else if(row==2 && column ==3) {
                        if(gameBoard[0][2]=='S'&&gameBoard[2][2]=='S') {
                            computer++;
                        }
                    } else if(row==1 && column ==2) {
                        if(gameBoard[0][0]=='S'&&gameBoard[0][2]=='S') {
                            computer++;
                        }
                    } else if(row==2 && column ==2) {
                        if(gameBoard[0][0]=='S'&&gameBoard[2][2]=='S') {
                            computer++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[2][0]=='S') {
                            computer++;
                        }
                        if(gameBoard[0][1]=='S'&&gameBoard[2][1]=='S') {
                            computer++;
                        }
                        if(gameBoard[1][0]=='S'&&gameBoard[1][2]=='S') {
                            computer++;
                        }

                    }

                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);

                    if(counter==n*n) {
                        break;
                    }
                }
            } else {
                while(true) {
                    System.out.println("Choose position you play. First choose row, second choose column!");
                    do {
                        row = scan.nextInt();
                        column = scan.nextInt();
                        //row = rand.nextInt(n) + 1;
                        //column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'S';
                    drawGameBoard(n, gameBoard);
                    if(row<=2 && column<=2) {
                        if(gameBoard[row + 1][column + 1] == 'S' && gameBoard[row][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column - 1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column + 1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            player++;
                        }
                    } if(row>n-2 && column>n-2) {
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                    } if(row<=2 && column>n-2) {
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                    } if(row>n-2 && column<=2) {
                        if(gameBoard[row - 3][column + 1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column - 1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column + 1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            player++;
                        }
                    } else if(row <= 2 && column > 2 && column <= n-2) {
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            player++;
                        }
                    } else if(row > n-2 && column > 2 && column <= n-2) {
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            player++;
                        }
                    } else if(column > n-2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            player++;
                        }
                    } else if(column <= 2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row-2][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row-1][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            player++;
                        }
                    } else if(column >2 && column<=n-2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            player++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            player++;
                        }
                    }
                    counter++;

                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);
                    if(counter==n*n) {
                        break;
                    }

                    do {
                        row = rand.nextInt(n) + 1;
                        column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'O';
                    drawGameBoard(n, gameBoard);
                    if(row==1 && column>1 && column<n) {
                        if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            computer++;
                        }
                    } else if(row==n && column>1 && column<n) {
                        if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            computer++;
                        }
                    } else if(column == 1 && row>1 && row<n) {
                        if(gameBoard[row][column-1] == 'S' && gameBoard[row - 2][column-1] == 'S') {
                            computer++;
                        }
                    }  else if(column == n && row>1 && row<n) {
                        if(gameBoard[row][column-1] == 'S' && gameBoard[row - 2][column-1] == 'S') {
                            computer++;
                        }
                    } else if(row > 1 && row < n && column > 1 && column < n){
                        if(gameBoard[row-2][column-2] == 'S' && gameBoard[row][column] == 'S') {
                            computer++;
                        } if(gameBoard[row-2][column] == 'S' && gameBoard[row][column-2] == 'S') {
                            computer++;
                        } if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            computer++;
                        } if(gameBoard[row][column-1] == 'S' && gameBoard[row -2][column-1] == 'S') {
                            computer++;
                        }
                    }

                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);

                    if(counter==n*n) {
                        break;
                    }
                }
            }
        } else {

            System.out.println("You're O!");
            if(n==3) {
                while(true) {
                    System.out.println("Choose position you play. First choose row, second choose column!");
                    do {
                        row = scan.nextInt();
                        column = scan.nextInt();
                        //row = rand.nextInt(n) + 1;
                        //column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'O';
                    drawGameBoard(n, gameBoard);
                    if(row==2 && column ==1) {
                        if(gameBoard[0][0]=='S'&&gameBoard[2][0]=='S') {
                            player++;
                        }
                    } else if(row==3 && column ==2) {
                        if(gameBoard[2][0]=='S'&&gameBoard[2][2]=='S') {
                            player++;
                        }
                    } else if(row==2 && column ==3) {
                        if(gameBoard[0][2]=='S'&&gameBoard[2][2]=='S') {
                            player++;
                        }
                    } else if(row==1 && column ==2) {
                        if(gameBoard[0][0]=='S'&&gameBoard[0][2]=='S') {
                            player++;
                        }
                    } else if(row==2 && column ==2) {
                        if(gameBoard[0][0]=='S'&&gameBoard[2][2]=='S') {
                            player++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[2][0]=='S') {
                            player++;
                        }
                        if(gameBoard[0][1]=='S'&&gameBoard[2][1]=='S') {
                            player++;
                        }
                        if(gameBoard[1][0]=='S'&&gameBoard[1][2]=='S') {
                            player++;
                        }

                    }
                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);
                    if(counter==n*n) {
                        break;
                    }

                    do {
                        row = rand.nextInt(n) + 1;
                        column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');



                    gameBoard[row - 1][column - 1] = 'S';
                    drawGameBoard(n, gameBoard);

                    if(row==1 && column==1) {
                        if(gameBoard[2][0]=='S'&&gameBoard[1][0]=='O') {
                            computer++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[0][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==1 && column==3) {
                        if(gameBoard[0][0]=='S'&&gameBoard[0][1]=='O') {
                            computer++;
                        }
                        if(gameBoard[2][0]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[1][2]=='O') {
                            computer++;
                        }
                    }
                    else if(row==3 && column==1) {
                        if(gameBoard[0][0]=='S'&&gameBoard[1][0]=='O') {
                            computer++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                        if(gameBoard[2][2]=='S'&&gameBoard[2][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==3 && column==3) {
                        if(gameBoard[0][0]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                        if(gameBoard[0][2]=='S'&&gameBoard[1][2]=='O') {
                            computer++;
                        }
                        if(gameBoard[2][0]=='S'&&gameBoard[2][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==1 && column==2) {
                        if(gameBoard[2][1]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==2 && column==1) {
                        if(gameBoard[1][2]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==3 && column==2) {
                        if(gameBoard[0][1]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                    }
                    else if(row==2 && column==3) {
                        if(gameBoard[1][0]=='S'&&gameBoard[1][1]=='O') {
                            computer++;
                        }
                    }
                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);

                    if(counter==n*n) {
                        break;
                    }
                }
            } else {
                while(true) {
                    System.out.println("Choose position you play. First choose row, second choose column!");
                    do {
                        row = scan.nextInt();
                        column = scan.nextInt();
                        //row = rand.nextInt(n) + 1;
                        //column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');

                    gameBoard[row - 1][column - 1] = 'O';
                    drawGameBoard(n, gameBoard);
                    if(row==1 && column>1 && column<n) {
                        if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            player++;
                        }
                    } else if(row==n && column>1 && column<n) {
                        if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            player++;
                        }
                    } else if(column == 1 && row>1 && row<n) {
                        if(gameBoard[row][column-1] == 'S' && gameBoard[row - 2][column-1] == 'S') {
                            player++;
                        }
                    }  else if(column == n && row>1 && row<n) {
                        if(gameBoard[row][column-1] == 'S' && gameBoard[row - 2][column-1] == 'S') {
                            player++;
                        }
                    } else if(row > 1 && row < n && column > 1 && column < n){
                        if(gameBoard[row-2][column-2] == 'S' && gameBoard[row][column] == 'S') {
                            player++;
                        } if(gameBoard[row-2][column] == 'S' && gameBoard[row][column-2] == 'S') {
                            player++;
                        } if(gameBoard[row - 1][column] == 'S' && gameBoard[row - 1][column-2] == 'S') {
                            player++;
                        } if(gameBoard[row][column-1] == 'S' && gameBoard[row -2][column-1] == 'S') {
                            player++;
                        }
                    }

                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);
                    if(counter==n*n) {
                        break;
                    }

                    do {
                        row = rand.nextInt(n) + 1;
                        column = rand.nextInt(n) + 1;
                    } while(gameBoard[row-1][column-1]=='S'||gameBoard[row-1][column-1]=='O');



                    gameBoard[row - 1][column - 1] = 'S';
                    drawGameBoard(n, gameBoard);
                    if(row<=2 && column<=2) {
                        if(gameBoard[row + 1][column + 1] == 'S' && gameBoard[row][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column - 1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column + 1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            computer++;
                        }
                    } if(row>n-2 && column>n-2) {
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                    } if(row<=2 && column>n-2) {
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                    } if(row>n-2 && column<=2) {
                        if(gameBoard[row - 3][column + 1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column - 1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column + 1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            computer++;
                        }
                    } else if(row <= 2 && column > 2 && column <= n-2) {
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            computer++;
                        }
                    } else if(row > n-2 && column > 2 && column <= n-2) {
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            computer++;
                        }
                    } else if(column > n-2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            computer++;
                        }
                    } else if(column <= 2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row-2][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row-1][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            computer++;
                        }
                    } else if(column >2 && column<=n-2 && row > 2 && row <= n-2) {
                        if(gameBoard[row - 3][column-3] == 'S' && gameBoard[row - 2][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column-1] == 'S' && gameBoard[row - 2][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 3][column+1] == 'S' && gameBoard[row - 2][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column-3] == 'S' && gameBoard[row - 1][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row - 1][column+1] == 'S' && gameBoard[row - 1][column] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-3] == 'S' && gameBoard[row][column-2] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column-1] == 'S' && gameBoard[row][column-1] == 'O') {
                            computer++;
                        }
                        if(gameBoard[row + 1][column+1] == 'S' && gameBoard[row][column] == 'O') {
                            computer++;
                        }
                    }

                    counter++;
                    System.out.println();
                    System.out.println("Player: " + player + " Computer: " + computer);

                    if(counter==n*n) {
                        break;
                    }
                }
            }



        }

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
        System.out.print("   ");
        for(int i=0; i<n; i++) {
            System.out.print((i+1)+" ");
        }

        for(int i=0; i<n; i++) {

            System.out.println();
            System.out.print((i+1) + "  ");
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
                } else if(j==0){
                    System.out.print("   -+");
                } else {
                    System.out.print("-+");
                }
            }
        }
    }
}

