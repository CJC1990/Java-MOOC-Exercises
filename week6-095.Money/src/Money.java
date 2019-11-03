
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added){
        return new Money(this.euros() + added.euros(), this.cents() + added.cents());
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros ||
           this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;    
    }
    
    public Money minus(Money decremented){
        
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;
        
        if(decremented.cents > this.cents){
            newEuros = (this.euros - decremented.euros) - 1;
            newCents = 100 - decremented.cents + this.cents;
        }
        
        
        Money result = new Money(newEuros, newCents);
        if(result.euros <= 0){
            return new Money(0, 0);
        }
        return result;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
