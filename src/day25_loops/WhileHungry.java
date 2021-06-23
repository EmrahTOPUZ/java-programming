package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungry = true;

        int bananas = 0;
        int countFull = 3;

        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana  \uD83C\uDF4C" +bananas);
            if (bananas == countFull) {
                isHungry = false;
            }
        }
        System.out.println("Eat enough bananas I m full");
    }
}
