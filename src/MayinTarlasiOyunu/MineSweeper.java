package MayinTarlasiOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    int row;
    int column;
    String[][] map;
    String[][] board;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.map = new String[row][column];
        this.board = new String[row][column];
        createMap(this.row, this.column);
    }

    public void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public boolean isWin() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!map[i][j].equals("*")) {
                    if (board[i][j].equals("-")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void createMap(int row, int column) {
        int numberOfMine = row * column / 4;
        Random random = new Random();

        for (String[] temp : this.map) {
            Arrays.fill(temp, "-");
        }
        for (String[] temp : this.board) {
            Arrays.fill(temp, "-");
        }

        for (int i = 0; i < numberOfMine; i++) {
            int minePlaceRow = random.nextInt(row);
            int minePlaceColumn = random.nextInt(column);
            this.map[minePlaceRow][minePlaceColumn] = "*";
        }

        print(map);
        System.out.println("=================================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        print(board);
    }

    public void run() {
        boolean isContinue = true;
        while (isContinue) {
            int row, col;
            System.out.print("Satır Giriniz : ");
            row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = input.nextInt();

            if (row >= 0 && row < this.row && col >= 0 && row < this.column) {
                if (map[row][col] == "*") {
                    System.out.printf("Game Over!");
                    isContinue = false;
                } else {
                    howManyMine(row, col);
                }
                if (isWin() == true) {
                    System.out.println("Oyunu Kazandınız !");
                    isContinue = false;
                }
            } else {
                System.out.println("Girilen değerler sınırları aşmaktadır !");
            }
        }
    }

    public void howManyMine(int row, int col) {
        int temp = 0;

        if (row - 1 >= 0)
            if (this.map[row - 1][col] == "*")
                temp++;
        if (row + 1 < this.map.length)
            if (this.map[row + 1][col] == "*")
                temp++;
        if (col - 1 >= 0)
            if (this.map[row][col - 1] == "*")
                temp++;
        if (col + 1 < this.map.length)
            if (this.map[row][col + 1] == "*")
                temp++;
        if (row - 1 >= 0 && col - 1 >= 0)
            if (this.map[row - 1][col - 1] == "*")
                temp++;
        if (row - 1 >= 0 && col + 1 < this.map.length)
            if (this.map[row - 1][col + 1] == "*")
                temp++;
        if (row + 1 < this.map.length && col - 1 >= 0)
            if (this.map[row + 1][col - 1] == "*")
                temp++;
        if (row + 1 < this.map.length && col + 1 < this.map.length)
            if (this.map[row + 1][col + 1] == "*")
                temp++;
        this.board[row][col] = String.valueOf(temp);
        System.out.println("=====================================");
        print(board);
    }
}
