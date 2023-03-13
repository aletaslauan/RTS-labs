package Lab2;

public class Main {

    private static final int noOfThreads=7;

    private static final int processorLoad=1000000;

    public static void main(String args[]){

        Window win=new Window(noOfThreads);
        Fir fir;
        for(int i =0; i <noOfThreads; i++){
            fir = new Fir(i,processorLoad,i+2);
            fir.addObserver(win);
            fir.thread.start();

        }

    }

}
