import javax.swing.*;

public class SnakeFrame extends JFrame{

    SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        //is for swing class it applies to frame. Sets bounds and size of window to preferable size defined by system
    }

}