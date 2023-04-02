package Lab3.Ex3;

class JoinTestThread extends Thread{
    Thread t;
    int numb;
    int result;
    JoinTestThread(String n, Thread t, int numb){
        this.numb = numb;
        this.setName(n);
        this.t=t;
    }
    public void run() {
        String n = null;
        System.out.println("Thread "+ n +" has entered the run() method");
        try {
            if (t != null) t.join();
            System.out.println("Thread "+ n +" executing operation.");

            for(int i=1;i<=numb;i++){
                if(numb % i ==0)
                    result+=i;
            }
            Thread.sleep(3000);
            System.out.println("Thread "+ n +" has terminated operation.");
        }
        catch(Exception e){e.printStackTrace();}
    }
}
