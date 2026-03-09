package lab2.mvc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Window extends JFrame implements Observer {

    private ArrayList<JProgressBar> bars = new ArrayList<>();

    public Window(int nrThreads) {
        setTitle("Thread Progress - MVC");
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(nrThreads);
        setVisible(true);
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setStringPainted(true);
            pb.setBounds(50, (i + 1) * 50, 350, 25);
            add(pb);
            bars.add(pb);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        Fir fir = (Fir) o;
        bars.get(fir.getId()).setValue(fir.getProgress());
    }
}