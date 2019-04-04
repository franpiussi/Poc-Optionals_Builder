package com.company;

import java.util.List;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;

public class Utils {


   public static String getCityNameFromEvent(List<Event> lista, Integer id){
     return Optional.ofNullable(getEventById(lista,id))
                .map(Event::getLocation)
                .map(Location::getCity)
                .map(City::toString)
                .orElse("Sin Ciudad");
    }

    public static Event getEventById(List<Event> Eventos, Integer id){
        return Eventos.stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .get();
    }// duda en funcion

    public static List<Event> getFirst5perID(List<Event> Events){
        return Events.stream()
                .sorted(Comparator.comparing(event-> event.getName()))
                .limit(5)
                .collect(Collectors.toList());
    }
}
