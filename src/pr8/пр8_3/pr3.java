package pr8.пр8_3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.util.Objects;


public class pr3 extends JFrame {

    private final JLabel imgLabel;
    private int imgNum = 1;

    private pr3(){
        this.setSize(600, 500);
        imgLabel = new JLabel("", new ImageIcon(Objects.requireNonNull(getClass().getResource("frame-01.gif"))), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(100, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        String imgName = "frame-" + String.format("%02d", imgNum) + ".gif";
        imgLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource(imgName))));
        imgNum++;
        if (imgNum == 16) {
            imgNum = 1;
        }

    }

    public static void main(String[] args) {
        pr3 mf = new pr3();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}
