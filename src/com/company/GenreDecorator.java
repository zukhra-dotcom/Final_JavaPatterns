package com.company;

import java.util.List;

public class GenreDecorator implements Genres{

    private Genres genres;

    public GenreDecorator(Genres genres) {
        this.genres = genres;
    }

    @Override
    public void update(List<String> genre) {
    }

    @Override
    public String booksOfGenre() {
        return genres.booksOfGenre();
    }
}
