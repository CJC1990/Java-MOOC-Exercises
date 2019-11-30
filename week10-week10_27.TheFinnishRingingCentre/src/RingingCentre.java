
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> sitedPlaces;

    public RingingCentre() {
        sitedPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!sitedPlaces.containsKey(bird)) {
            sitedPlaces.put(bird, new ArrayList<String>());
        }
        
        sitedPlaces.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (sitedPlaces.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird + " observations: " + sitedPlaces.get(bird).size());
            for (String place : sitedPlaces.get(bird)) {
                System.out.println(place);
            }
        }
    }
    
    

}
