package game_2d;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class GamePanel extends JPanel{

final int originalTileSize=16;
final int scale=3;
final int tileSize=originalTileSize*scale; //48x48 tile
final int maxScreenCol=16;
final int maxScreenRow=12;
final int screenWidth=tileSize*maxScreenCol; //768 pixels
final int screenHeight=tileSize*maxScreenRow; //576 pixels      

public GamePanel() {
    this.setPreferredSize(new Dimension(screenWidth,screenHeight));
    this.setBackground(Color.black);
    this.setDoubleBuffered(true);
} 
}

    

