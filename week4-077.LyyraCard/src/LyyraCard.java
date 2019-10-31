public class LyyraCard {
    
    // --Object Variables--
    private double balance;
    
    // --Constructor--
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    // --Methods--
    
    public double getBalance(){
        return this.balance;
    }
    
    public void loadMoney(double amount){
        
        if(amount >= 0){
           this.balance = this.getBalance() + amount; 
        }
        
        
        if(this.getBalance() > 150){
            this.balance = 150;
        }
    }
    
    
    public void payEconomical(){
        if(this.getBalance() >= 2.5){
            this.balance -= 2.5;
        }
    }
    
    public void payGourmet(){
        if(this.getBalance() >= 4){
            this.balance -= 4;
        }
    }
    
    public String toString(){
        return "The card has " + getBalance() + " euros";
    }
 
}
