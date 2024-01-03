package org.example;

public class Board {
    private char[][] cells;

    public Board() {
        cells = new char[3][3];
    }

    public void place(int x, int y, char marker) {
        cells[x][y] = marker;
    }

    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] == '\u0000'; // Check if cell is empty
    }

    public boolean hasWinner() {
        // Check for a winner (implementation not provided in this example)
        // You need to implement the logic to check for a win condition.
        return false;
    }

    public void print() {
        System.out.println("▁▁▁▁▁▁");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("▔▔▔▔");
    }
}
