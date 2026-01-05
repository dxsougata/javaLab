public class q09 {
    static class Movies{
        String name;
        double ratings;
        Movies(String name,double ratings){
            this.name = name;
            this.ratings = ratings;
        }

        public String toString(){
            return "Movie : "+name+" ratings : "+ratings;
        }

    }
    public static void main(String[] args) {
        Movies []movies = new Movies[5];

        movies[0] = new Movies("A", 5.5);
        movies[1] = new Movies("B", 9.5);
        movies[2] = new Movies("C", 8.5);
        movies[3] = new Movies("D", 7.5);
        movies[4] = new Movies("E", 8.6);

        for(Movies mov : movies){
            if(mov.ratings>8.5){
                System.out.println(mov);
            }
        }

        System.out.println("Sougata Kundu , 24155737");
    }
    
}
