package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //create in String pool
        String word2 = "java"; //reused from theString pool
        String word3 = new String("java"); //create in Heap, outside String pool
        String word4 = new String("java"); // create new object in HEAP, outside String pool

        System.out.println(word1 == word2); // point the same abject in the pool
        System.out.println(word1 == word3); // point the different object in the heap and pool
        System.out.println(word3 == word4); // point to the different in heap

        System.out.println(word1.equals(word2)); // equal comparing the values
        System.out.println(word1.equals(word3)); // equal comparing the values
        System.out.println(word3.equals(word4)); // equal comparing the values

        //ALWAYS USE STRING COMPARISON


    }
}
