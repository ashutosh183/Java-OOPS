class Movie{
    String name;
    int year;
    String genere;

    Movie(){

    }
    Movie(String name, int year, String genere){
        this.name = name;
        this.year = year;
        this.genere = genere;
    }

    Movie(String name){
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Movie a = new Movie();
        Movie b = new Movie("Naruto", 1999, "Ninjas and Shinobis");
        Movie c = new Movie("One Piece");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}