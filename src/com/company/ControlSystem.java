package com.company;

import java.util.ArrayList;
import java.util.List;

public class ControlSystem implements Notification {
    private List<String> genreList = new ArrayList<>();
    private List<Genres> genres = new ArrayList<>();

    public void addGenre(String genre){
        this.genreList.add(genre);
        notifyAllCustomers();
    }

    public void removeGenre(String genre){
        this.genreList.remove(genre);
        notifyAllCustomers();
    }

    @Override
    public void Genres(Genres genres) {
        this.genres.add(genres);
    }

    @Override
    public void notifyAllCustomers() {
        for (Genres genres: genres) {
            genres.update(this.genreList);
        }
    }
}
