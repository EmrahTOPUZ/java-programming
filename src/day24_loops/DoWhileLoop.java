package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {

        int count = 0;
        do {
            System.out.println("keep counting " +count);
            count+=100;
            Thread.sleep(100);
        }
        while(count <= 1000);


    }
}
