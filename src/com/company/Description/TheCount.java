package com.company.Description;

import com.company.Genres;

import java.util.List;

public class TheCount implements Genres {
    @Override
    public void update(List<String> genre) {
    }

    @Override
    public String booksOfGenre() {
        return "Description: The story takes place in France, Italy, and islands in the Mediterranean during the historical events of 1815–1839: the era of the Bourbon Restoration through the reign of Louis-Philippe of France. \n";
    }
}
