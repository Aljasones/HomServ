package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AvitoService {
    private Collection<House> items = new LinkedList<>();

    public void add(House item) {
        items.add(item);
    }

    public List<House> searchByUndergroundStation(String... stations) { //передача произвольного количества аргументов
        if (stations.length == 0) {
          throw new IllegalArgumentException();
        }
        List<House> result = new ArrayList<>();
        for (House item : items) {
            for (String station : stations){
                if (item.getUndergroundStation().equals(station)){
                    result.add(item);
                    break;
                }
            }

        }
        return result;

    }
}
