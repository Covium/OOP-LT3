package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class DataProcessor {
    public static List<Film> top3Rating(ArrayList<Film> list) {
        List<Film> top3 = list.stream()
                .filter(element -> element.rating < 5)
                .filter(element -> element.rating >= 3)
                .limit(3)
                .collect(Collectors.toList());

        return top3;
    }

    public static Film searchRating(ArrayList<Film> list, int rating) throws NegativeInput {
        if (rating < 0) { throw new NegativeInput("positive number expected"); }

        List<Film> exactRating = list.stream()
                .filter(element -> element.rating == rating).toList();

        return exactRating.get(0);
    }
}
