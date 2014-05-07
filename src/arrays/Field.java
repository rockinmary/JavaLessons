package arrays;

public class Field {
    private final int FIELD_SIZE = 3;
    private final char DEFAULT_VALUE = ' ';
    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    private void eraseLine(int lineNumber) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][lineNumber] = DEFAULT_VALUE;
        }
    }

    public void eraseField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            eraseLine(i);
        }
    }

    private void showLine(int lineValue) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print("[" + field[i][lineValue] + "]");
        }
    }

    public void showField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
    }
}
