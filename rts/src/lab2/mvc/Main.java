package lab2.mvc;

public class Main {
    private static final int NO_OF_THREADS  = 6;
    private static final int PROCESSOR_LOAD = 1000000;

    public static void main(String[] args) {
        Window view = new Window(NO_OF_THREADS);
        for (int i = 0; i < NO_OF_THREADS; i++) {
            Fir fir = new Fir(i, i + 2, PROCESSOR_LOAD);
            fir.addObserver(view);
            fir.start();
        }
    }
}