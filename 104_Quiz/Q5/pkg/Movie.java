package pkg;

public class Movie{
   //Global Variables
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    //Constructors
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public double getRating(){
        return rating;
    }
    
    public int getNumRatings(){
        return numRatings;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    
    public void setRating(double rating){
        this.rating = rating;
    }
    
    public void setNumRatings(int numRatings){
        this.numRatings = numRatings;
    }
    
    public void setRevenue(int revenue){
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+getMovieName()+"\nRating: "+getRating()+"\nNumber of Ratings: "+getNumRatings()+"\nRevenue: "+getRevenue()+"\n");
    }
    
    public void addRating(double rating){
        numRatings++;
        this.rating = rating + (rating/numRatings);
    }
    
    public boolean compareRatings(Movie movieName){
        if(getRating() > getRating()){
            return true;
        }
        else{
            return false;
        }
    }
    public int revenueToString(){
        return getRevenue();
    }
    
}

