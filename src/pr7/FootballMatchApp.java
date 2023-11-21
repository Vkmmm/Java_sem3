package pr7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class FootballMatchApp extends JFrame {
    private int milanGoals = 0;
    private int madridGoals = 0;
    private JLabel resultLabel;
    private JLabel LastScorer;
    private Label Winner;
    private String lastPressed;
    public FootballMatchApp() {
        super("Football Match");
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 x 0");
        LastScorer = new JLabel("Last Scorer: N/A ");
        Winner = new Label("Winner: DRAW" );
        setLayout(new FlowLayout());
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(LastScorer);
        add(Winner);
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanGoals++;
                lastPressed = "AC Milan";
                updateResultLabel();
                updateResultScorer();
                updateResultWinner();

            }
        });
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridGoals++;
                lastPressed = "Real Madrid";
                updateResultLabel();
                updateResultScorer();
                updateResultWinner();

            }
        });

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateResultLabel() {
        String resultText = "Result: " + milanGoals + " x " + madridGoals;
        resultLabel.setText(resultText);
    }
    private void updateResultScorer()
    {
        String ScorerText;
        if (Objects.equals(lastPressed, "AC Milan"))
            ScorerText = "Last Scorer: AC Milan";
        else
            ScorerText = "Last Scorer: Real Madrid";
        LastScorer.setText(ScorerText);
    }
    private void updateResultWinner()
    {
        String WinnerText;
        if (milanGoals > madridGoals)
            WinnerText = "Winner: AC Milan";
        else if (milanGoals < madridGoals)
            WinnerText = "Winner: Real Madrid";
        else WinnerText = "Winner: DRAW";
        Winner.setText(WinnerText);
    }

    public static void main(String[] args) {
        new FootballMatchApp();
    }
}