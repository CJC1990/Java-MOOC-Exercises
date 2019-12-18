
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class personalFilmComparator implements Comparator<Film> {
    
    private Map<Film, Rating> rating;

    public personalFilmComparator(Map<Film, Rating> rating) {
        this.rating = rating;
    }
    
    @Override
    public int compare(Film o1, Film o2) {
        return rating.get(o2).getValue() - rating.get(o1).getValue();
    }
    
}
