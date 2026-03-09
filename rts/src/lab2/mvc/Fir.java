package lab2.mvc;

import lombok.Getter;

import java.util.Observable;

public class Fir extends Observable implements Runnable {

    @Getter
    private int id;
    @Getter
    private int progress;
    private int processorLoad;
    private Thread t;

    public Fir(int id, int priority, int processorLoad) {
        this.id = id;
        this.processorLoad = processorLoad;
        t = new Thread(this);
        t.setPriority(priority);
    }

    public void start() {
        t.start();
    }

    @Override
    public void run() {
        int c = 0;
        while (c < 1000) {
            for (int j = 0; j < processorLoad; j++) { j++; j--; }
            c++;
            this.progress = c;
            setChanged();
            notifyObservers();
        }
    }

}