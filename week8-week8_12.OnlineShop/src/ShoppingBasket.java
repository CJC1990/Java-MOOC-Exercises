
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
    
    //private List<Purchase> purchases;
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        //purchases = new ArrayList<Purchase>();
        purchases = new HashMap<String,Purchase>();
    }
    
//    public void add(String product, int price){
//        for (Purchase purchase : purchases) {
//            if(purchase.getProduct().equals("product")){
//                purchase.increaseAmount();
//                return;
//            }
//        }
//        purchases.add(new Purchase(product, 1, price));
//        
//    }
//    
//    public int price(){
//        int totalPrice = 0;
//        for (Purchase purchase : purchases) {
//            totalPrice += purchase.price();
//        }
//        return totalPrice;
//    }
    
    
    // --- HASHMAP --- //
    
    public int price(){
        int totalPrice = 0;
        for (Purchase purchase : purchases.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void add(String product, int price){
        if(purchases.containsKey(product)){
            purchases.get(product).increaseAmount();
        }else{
        purchases.put(product, new Purchase(product, 1, price));
        }
    }
    
    public void print(){
        for (Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }
    
    
    
    
}
