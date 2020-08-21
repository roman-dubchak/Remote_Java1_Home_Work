package repo_java1_Home_Work.lesson7_Swing;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Map extends JPanel{
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    private static final String MSG_WIN_HUMAN = "Победил игрок!";
    private static final String MSG_WIN_AI = "Победил компьютер!";
    private static final String MSG_DRAW = "Ничья!";

    private static final Random RANDOM = new Random();

    private int[][] field;
    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;
    private int cellWidth;
    private int cellHeight;

    Map(){
//        setBackground(Color.DARK_GRAY); фон
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render (Graphics g) { // метод рисаование
        int width = getWidth(); // текущая ширина, наследуюеся от JPanel
        int height = getHeight();
        cellWidth = width / fieldSizeX;
        cellHeight = height / fieldSizeY;
        g.setColor(Color.BLACK);
        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, height);
        }

    }

    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        this.fieldSizeY = fieldSizeY;
        this.fieldSizeX = fieldSizeX;
        this.winLength = winLength;
        field = new int[fieldSizeY][fieldSizeX];
    }
}
