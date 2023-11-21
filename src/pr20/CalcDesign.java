package pr20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcDesign extends JFrame {
    public static void createGUI(CalcModel model) {
        JFrame jFrame = new JFrame("MyCalculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JLabel calcResult = new JLabel("", SwingConstants.RIGHT);
        calcResult.setBounds(0, 0, 400, 60);
        calcResult.setFont(new Font("Times", Font.BOLD, 32));
        jFrame.setSize(418, 360);
        JButton[][] buttons = new JButton[4][4];
        String[] buttonLabels = {
                "7", "4", "1", "0",
                "8", "5", "2", ".",
                "9", "6", "3", "+",
                "/", "*", "-", "="
        };
        int buttonIndex = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j] = new JButton(buttonLabels[buttonIndex]);
                buttons[i][j].setBounds(100 * i, 60 * (j + 1), 100, 60);
                int i0 = i;
                int j0 = j;

                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        calcResult.setText(CalculatorController.buttonMethod(model, buttons[i0][j0].getText(), calcResult.getText()));
                    }
                });

                buttonIndex++;
            }
        }
        jFrame.setLocationRelativeTo(null);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                jFrame.add(buttons[i][j]);
            }
        }
        jFrame.add(calcResult);
        jFrame.setVisible(true);
    }
    public static void Result(CalcDesign model) {
        System.out.println(model);
    }
}
