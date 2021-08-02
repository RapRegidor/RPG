package GUI;

import javax.swing.*;

public class Window extends JFrame{

    public Window() {
        this.setTitle("PLAY OMORI. MASTERPIECE. PEAK FICTION. 5/7. $20 on Steam");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new Panel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
