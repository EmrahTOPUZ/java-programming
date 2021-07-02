package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int [] data = {7, 34 , 67, 234, 432, 567, 876, 542, 567};

        for ( int eachData  : data ){
            System.out.println(eachData);
        }

        for( int n : data){
            System.out.print(n + " ");
        }
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println("last value of data " + data[data.length - 1]);

        for (int idx = data.length - 1; idx >= -1; idx--){
            System.out.print(data[idx] + " ");
        }
    }
}
