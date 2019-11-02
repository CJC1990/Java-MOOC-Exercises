// My code passes, but I didn't use DRY (Don't Repeat Yourself) principles!
// I should have created a method called price() that returned the price of an apartment,
// and then used that method inside my comparing methods.

public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        return Math.abs( (this.pricePerSquareMeter * this.squareMeters) -
                         (otherApartment.pricePerSquareMeter * otherApartment.squareMeters));
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if( (this.pricePerSquareMeter * this.squareMeters) >
            (otherApartment.pricePerSquareMeter * otherApartment.squareMeters)){
            return true;
        }
        return false;
    }
    
}
