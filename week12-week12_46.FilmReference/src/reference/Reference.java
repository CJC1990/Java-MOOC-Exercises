
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.comparator.personalFilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {
    
    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }
    
    public Film recommendFilm(Person person){
        //If the person has watched all films, return null
        if(ratingRegister.filmsWatched(person).containsAll(ratingRegister.filmRatings().keySet())){
            return null;
        }
        
        //If the person has not watched any films
        if(!ratingRegister.reviewers().contains(person)){
            return recommendFilmNoneWatched();
        }
        
        //Get a list of all the films watched by person
        List<Film> filmsWatchedByPerson = ratingRegister.filmsWatched(person);
        
        //Declare an empty list of films that will change based on the other's viewed list
        List<Film> filmsWatchedByOtherPerson = new ArrayList<Film>();
        
        //Get a list of all other reviwers and remove the current person
        List<Person> otherReviewers = ratingRegister.reviewers();
        otherReviewers.remove(person);
        
        //create a map that maps otherReviewers to their similarity value with the person
        Map<Person, Integer> similarityValues = new HashMap<Person, Integer>();
        
        //Compare that list vs every other reviewers list of watched films, if the films match multiply thier ratings
        for (Person reviewer : otherReviewers) {
            int similarity = 0;
            filmsWatchedByOtherPerson.clear();
            filmsWatchedByOtherPerson.addAll(ratingRegister.filmsWatched(reviewer));
            
            for (Film film : filmsWatchedByPerson) {
                if(filmsWatchedByOtherPerson.contains(film)){
                    //if both people have watched this film...
                    //similarity += personsRatingOfThisFilm * otherPersonsRatingOfThisFilm;
                    similarity += ratingRegister.getRating(person, film).getValue() * ratingRegister.getRating(reviewer, film).getValue();
                }
            }
            
            //add the similarity betweeen the current reviwer and the person to the map
            similarityValues.put(reviewer, similarity);
                
        }//-----END OF ITERATING THRU OTHER REVIEWERS-----
        
        //sort my list of other reviewers based on the similarity value;
        Collections.sort(otherReviewers, new PersonComparator(similarityValues));
            
        //Grab the person they are most similar with
        Person mostSimilar = otherReviewers.get(0);
            
        //Find that persons highest rated film
        return topRatedFilm(mostSimilar, filmsWatchedByPerson);    
    }
    
    private Film topRatedFilm(Person mostSimilarPerson, List<Film> filmsWatchedByPerson){
        Map<Film, Rating> personalRatings = ratingRegister.getPersonalRatings(mostSimilarPerson);
        List<Film> similarPersonsWatchedFilms = new ArrayList<Film>();
        similarPersonsWatchedFilms.addAll(personalRatings.keySet());
        similarPersonsWatchedFilms.removeAll(filmsWatchedByPerson);
        Collections.sort(similarPersonsWatchedFilms, new personalFilmComparator(personalRatings));
        return similarPersonsWatchedFilms.get(0);
    }
    
    public Film recommendFilmNoneWatched(){
        Map<Film, List<Rating>> allFilmRatings = ratingRegister.filmRatings();
        
        List<Film> allFilms = new ArrayList<Film>();
        allFilms.addAll(allFilmRatings.keySet());
        
        Collections.sort(allFilms, new FilmComparator(allFilmRatings));
        
        return allFilms.get(0);
    }
    
    
    
}
