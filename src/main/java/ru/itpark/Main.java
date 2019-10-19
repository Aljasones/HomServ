package ru.itpark;


import ru.itpark.model.Airplane;
import ru.itpark.service.AvitoService;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Collection<Airplane> departure = new LinkedList<>();

        departure.add(new Airplane("su1157"));
        departure.add(new Airplane("su1257"));
        departure.add(new Airplane("su2257"));

        Airplane src = new Airplane("su1157");
        Airplane target = new Airplane("su1157");

        System.out.println(src == target);  // неправильно
        System.out.println(src.equals(target)); // неправильно

        boolean contains = departure.contains("su1157");


    AvitoService avitoService = new AvitoService();
    avitoService.searchByUndergroundStation("Яшлек", "Северный вокзал");
}}
