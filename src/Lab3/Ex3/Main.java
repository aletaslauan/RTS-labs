package Lab3.Ex3;

public class Main {
    public static long sum = 0;
    public static void main(String[] args) {
        JoinTestThread w1 = new JoinTestThread("Thread 1", null, 2);
        JoinTestThread w2 = new JoinTestThread("Thread 2", w1, 4);
        w1.start();
        w2.start();
    }
}
