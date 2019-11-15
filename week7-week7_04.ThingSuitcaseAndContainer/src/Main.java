
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
            Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        Thing brick;
        Suitcase suitcase;
        for(int i=0; i<100; i++){
          brick = new Thing("brick", 1 + i);
          suitcase = new Suitcase(1+i);
          suitcase.addThing(brick);
          container.addSuitcase(suitcase);
          
        }
    }
    

}
