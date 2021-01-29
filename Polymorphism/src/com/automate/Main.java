package com.automate;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "no plot";
    }
}
class Jaws extends Movie{
    public Jaws( ) {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Eats All Humans";
    }
}

class Saw extends Movie{
    public Saw() {
        super("Saw");
    }

    @Override
    public String plot() {
        return "Psycho Kills Humans";
    }
}
class Avengers extends Movie{
    public Avengers() {
        super("Avengers");
    }

    @Override
    public String plot() {
        return "Saves Earth from invasion";
    }
}




public class Main {

    public static void main(String[] args) {
	// write your code here
        Movie movie= randomMovie();
        System.out.println("movie plot \t"+movie.plot());
    }

    public static  Movie randomMovie(){
        int randomMovieGenerator=(int)Math.floor(Math.random()*4)+1;
        switch (randomMovieGenerator){
            case 1: return new Jaws();
            case 2: return new Saw();
            case 3:return new Avengers();

        }
        return null;
    }
}
