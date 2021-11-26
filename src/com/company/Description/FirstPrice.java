package com.company.Description;

import com.company.GenreDecorator;
import com.company.Genres;

import java.util.List;

public class FirstPrice extends GenreDecorator {
    public FirstPrice(Genres genres) {
        super(genres);
    }

    public String price(){
        return "Price: 5000 tenge";
    }

    @Override
    public String booksOfGenre() {
        return super.booksOfGenre() + price();
    }
}
