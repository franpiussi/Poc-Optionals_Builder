package com.company;

import java.util.stream.Collector;
import static java.util.Comparator.comparingDouble;
import java.util.*;


public class Utils {


   /*public static String getCityNameFromEvent(List<Evento> lista, Integer id){
        Optionals.ofnullable(getEventbyId(_lista,_id))
                .map(::getLocation())
                .map(::getCity())
                .map(::getName())
                .orelse('Sin Ciudad');
    }*/

    public static Evento getEventById(List<Evento> Eventos, Integer id){
        return Eventos.stream()
                .filter(e -> id.equals(e.getId()))
                .findFirst()
                .get();
    }// duda en funcion

    public static List<Evento> getFirst5perID(List<Evento> Eventos){
        return Eventos.stream()
                .sort(comparingDouble(e::getId()))
                .limit(5)
                .collect(Collector.toList());
    }

    public static List<Evento> getOrganized(List<Evento> Eventos){
        return Eventos.sort(comparingDouble(e::getId());
    }
}
