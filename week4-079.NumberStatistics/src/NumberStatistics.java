public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number){
        this.amountOfNumbers = this.getAmountOfNumbers() + 1;
        this.sum = this.getSum() + number;
        
    }
    
    public int amountOfNumbers(){
        return this.getAmountOfNumbers();
    }
    
    public int getAmountOfNumbers(){
        return this.amountOfNumbers;
    }
    
    public int sum(){
        return this.getSum();
    }
    
    public double average(){
        if(this.amountOfNumbers() == 0){
            return 0.0;
        }
        return this.sum() / (double)this.amountOfNumbers();
    }
    
    public int getSum(){
        return this.sum;
    }
}
