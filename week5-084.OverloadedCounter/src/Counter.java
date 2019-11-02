
public class Counter {

    private int counter;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.counter;
    }
    
    // The given Model Solution to this exercise is probably better than my own answer.
    // However, mine still passes 100%.
    
    public void increase(){
        this.counter++;
    }
    
    public void decrease(){
        if(check && this.value() == 0){
            return;
        }
        this.counter--;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount < 0){
            return;
        }
        for(int i=0; i<increaseAmount; i++){
            this.increase();
        }
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount < 0){
            return;
        }
        for(int i=0; i<decreaseAmount; i++){
            this.decrease();
        }
    }
}
