package repo_java1_Home_Work.lesson7_Swing;
import javax.swing.*;
import java.awt.*;

public class Map extends JPanel{
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    Map(){
        setBackground(Color.DARK_GRAY);
    }
    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode: %d, size: %d, len: %d\n", mode, fieldSizeX, winLength); //заглушка, понять, что метод вызвался
    }
}
