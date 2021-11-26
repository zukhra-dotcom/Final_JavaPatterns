package com.company.Description;

import com.company.GenreDecorator;
import com.company.Genres;

public class SecondPrice extends GenreDecorator {
    public SecondPrice(Genres genres) {
        super(genres);
    }

    public String price(){
        return "Price: 7000 tenge";
    }


    @Override
    public String booksOfGenre() {
        return super.booksOfGenre() + price();
    }
}
