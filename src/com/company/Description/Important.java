package com.company.Description;

import com.company.Genres;

import java.util.List;

public class Important implements Genres {
    @Override
    public void update(List<String> genre) {
    }

    @Override
    public String booksOfGenre() {
        return "Description: This book is about a decade that determines the fate of a person. Investments made during this period in their own development in all areas of life will bring the maximum return.\n";
    }
}
