
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        return prices.get(product) == null ? -99 : prices.get(product);
        
    }
    
    public int stock(String product){
        return this.stock.get(product) == null ? 0 : this.stock.get(product);
        
    }
    
    public boolean take(String product){
        if(stock(product) > 0){
            stock.put(product, stock(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return stock.keySet();
    }
    
    
    
}
