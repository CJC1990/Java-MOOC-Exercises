
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private Map<String, Set<String>> numbers;
    private Map<String, Set<String>> addresses;

    public Phonebook() {
        numbers = new HashMap<String, Set<String>>();
        addresses = new HashMap<String, Set<String>>();
    }
    
    public Map<String, Set<String>> getNumbersMap(){
        return numbers;
    }
    
    public Map<String, Set<String>> getAddressMap(){
        return addresses;
    }

    public void addNumber(String name, String number) {
        if (!numbers.containsKey(name)) {
            numbers.put(name, new HashSet<String>());
        }
        numbers.get(name).add(number);
    }

    public void addAddress(String name, String address) {
        if (!addresses.containsKey(name)) {
            addresses.put(name, new HashSet<String>());
        }
        addresses.get(name).add(address);
    }

    public Set<String> searchForNumbers(String name) {
        return numbers.get(name);
    }

    public String searchForNameByNumber(String number) {
        for (String key : numbers.keySet()) {
            Set<String> phoneNumbers = numbers.get(key);
            for (String phoneNumber : phoneNumbers) {
                if (phoneNumber.equals(number)) {
                    return key;
                }
            }
        }
        return null;
    }

    public String searchForNameByAddress(String address) {
        for (String key : addresses.keySet()) {
            Set<String> allAddresses = addresses.get(key);
            for (String currentAddress : allAddresses) {
                if (currentAddress.equals(address)) {
                    return key;
                }
            }
        }
        return null;
    }

    public Set<String> searchForAddress(String name) {
        return addresses.get(name);
    }

    public void delete(String deletedPerson) {
        numbers.remove(deletedPerson);
        addresses.remove(deletedPerson);
    }

    public List<String> filteredList(String filter) {

        List<String> filteredNames = new ArrayList<String>();

        for (String name : numbers.keySet()) {
            if (name.contains(filter)) {
                filteredNames.add(name);
            }
        }
        for (String name : addresses.keySet()) {
            if (name.contains(filter)) {
                filteredNames.add(name);
            }
        }
        
        for (Set<String> setOfAddresses : addresses.values()) {
            for (String address : setOfAddresses) {
                if (address.contains(filter)) {
                    String name = searchForNameByAddress(address);
                    filteredNames.add(name);
                }
            }
        }

        return filteredNames;

    }

}
