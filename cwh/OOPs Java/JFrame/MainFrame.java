import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public void init(){
        setTitle("Hello");
        setSize(600, 800);
        setBounds(100,100,1000,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        
        
    } 

    public void icon(){
        ImageIcon icon = new ImageIcon("img2.png");
        setIconImage(icon.getImage());
    }
    
    public void container(){
        Container c = getContentPane();
        c.setBackground(Color.BLACK);
    }
}