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

    public static Film searchRating(ArrayList<Film> list, int price) throws NegativeInput {
        if (price < 0) { throw new NegativeInput("positive number expected"); }

        List<Film> exactPrice = list.stream()
                .filter(element -> element.rating == price).toList();

        return exactPrice.get(0);
    }
}
