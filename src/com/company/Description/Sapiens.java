package com.company.Description;

import com.company.Genres;

import java.util.List;

public class Sapiens implements Genres {
    @Override
    public void update(List<String> genre) {
    }

    @Override
    public String booksOfGenre() {
        return "Description: The common species of Homo existed long before Homo Sapiens. Sapiens are the only species. All Homo were sensible, made and used tools, organized groups.\n";
    }
}
