package com.company;

import java.util.stream.Collector;
import java.util.*;
/*import java.util.Objects.isNull;
import java.util.Objects.nonNull;*/



public class Main {

    public static void main(String[] args) {


        List<Event> Events = Arrays.asList(
                new Event(2,"Evento 2", new Location(1,"Argentina", new City(2,"La Plata"))),
                new Event(3,"Evento 3", new Location(1,"Argentina", new City(3,"Mar Chiquita"))),
                new Event(1,"Evento 1", new Location(1,"Argentina", new City(1,"Mar del Plata"))),
                new Event(4,"Evento 4", new Location(1,"Argentina", null )));



        Event EventById = Utils.getEventById(Events, 2);
        System.out.println(EventById);

        String cityName = Utils.getCityNameFromEvent(Events, 4);
        System.out.println(cityName);

        List<Event> First5Events = Utils.getFirst5perID(Events);
        System.out.println(First5Events);


        /*City c = new City();
        c.name("pepe").id(6).build();)*/

        //isnull(Object);

        //City city = City.name('dd').id(1).build();
    }
}
