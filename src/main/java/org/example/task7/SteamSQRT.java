package org.example.task7;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class SteamSQRT {
//    Напишите метод, который преобразует список целых чисел в список их квадратов, используя Stream API.
    public ArrayList<Integer> SQRTStream(ArrayList<Integer> incoming) {
        return incoming.stream().map(c -> c * c).collect(Collectors.toCollection(ArrayList::new));
    }

}
