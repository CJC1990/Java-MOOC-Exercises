
package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        int film1Value = 0;
        int film2Value = 0;
        
        for (Rating film2Rating : ratings.get(o2)) {
            film2Value += film2Rating.getValue();
        }
        for (Rating film1Rating : ratings.get(o1)) {
            film1Value += film1Rating.getValue();
        }
        
        return film2Value - film1Value;
    }
    
}
