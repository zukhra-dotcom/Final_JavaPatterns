package com.company;

import java.util.List;

public class DataGenre implements Genres{
    private String genreName;

    public DataGenre(String name){
        this.genreName = genreName;
    }

    @Override
    public void update(List<String> genre) {
        System.out.println("Dear, " + "Tleuzhan Mukataev\n" + genre +"\n");
    }

    @Override
    public String booksOfGenre() {
        return null;
    }
}
