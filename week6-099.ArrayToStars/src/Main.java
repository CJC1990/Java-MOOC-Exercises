public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }
    
//   I first wrote it as a separate method, but then just did a nested for loop
//    as that is what the lesson was teaching.
//    
//    public static void printNumberOfStars(int number){
//        for(int i = 0; i < number; i++){
//            System.out.print("*");
//        }
//    }

    public static void printArrayAsStars(int[] array) {
        // write code here  
        
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
