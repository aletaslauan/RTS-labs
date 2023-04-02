package Lab3.Ex2;

import java.util.ArrayList;

public class Buffer{
    ArrayList<Double> content = new ArrayList<Double>();
    synchronized void put(double d){
        content.add(new Double(d));
        notify();
    }
    synchronized double get(){
        double d=-1;
        try{
            if(content.size()==0) wait();
            d = (content.get(0)).doubleValue();
            content.remove(0);
        }catch(Exception e){e.printStackTrace();}
        return d;
    }
}

class Producer implements Runnable{
    private Buffer bf;
    private Thread thread;
    Producer(Buffer bf){this.bf=bf;}
    public void start(){
        if (thread==null){
            thread = new Thread(this);
            thread.start();
        }
    }
    public void run(){
        while (true){
            bf.put(Math.random());
            System.out.println("Producer "+thread.getName()+
                    " gave a task.");
            try{
                Thread.sleep(1000);
            }catch(Exception e){e.printStackTrace();}
        }
    }
}
//--------------------------------------------------------------------
class Consumer extends Thread{
    private Buffer bf;
    Consumer(Buffer bf){this.bf=bf;}
    public void run() {
        while (true){
            System.out.println("Consumer "+this.getName()+
                    " received >> "+bf.get());
        }
    }
}

