package com.company.Description;

import com.company.Genres;

import java.util.List;

public class Space implements Genres {
    @Override
    public String booksOfGenre() {
        return "Description: The book covers a wide range of topics, in Sagan's field of vision are questions from the field of anthropology, cosmology, biology, history, astronomy, from antiquity to the present. Sagan expresses the position on extraterrestrial life that the size of the Universe allows the existence of thousands of extraterrestrial civilizations, but there is no convincing evidence of their visit to our planet.\n";
    }

    @Override
    public void update(List<String> genre) {
    }
}
