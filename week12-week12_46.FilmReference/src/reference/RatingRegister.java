
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {
    
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {
        filmRatings = new HashMap<Film,  List<Rating>>();
        personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!filmRatings.containsKey(film)){
            filmRatings.put(film, new ArrayList<Rating>());
        }
        filmRatings.get(film).add(rating);
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!personalRatings.containsKey(person)){
            personalRatings.put(person, new HashMap<Film, Rating>());    
        }
        addRating(film, rating);
        personalRatings.get(person).put(film, rating);
    }
    
    public Rating getRating(Person person, Film film){
          return personalRatings.get(person).get(film) == null ? Rating.NOT_WATCHED : personalRatings.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!personalRatings.containsKey(person)){
            return new HashMap<Film, Rating>();
        }
        return personalRatings.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> people = new ArrayList<Person>();
        people.addAll(personalRatings.keySet());
        return people;
    }
    
    public List<Film> filmsWatched(Person person){
        List<Film> filmsWatched = new ArrayList<Film>();
        filmsWatched.addAll(getPersonalRatings(person).keySet());
        return filmsWatched;
    }
    
    public List<Rating> getRatings(Film film){
        return filmRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return filmRatings;
    }
    
    
    
}
