package com.company;

import java.util.stream.Collector;
import java.util.*;
/*import java.util.Objects.isNull;
import java.util.Objects.nonNull;*/



public class Main {

    public static void main(String[] args) {


          List<Evento> Eventos = Arrays.asList(
                new Evento(2,"Evento 2", new Location(1,"Argentina", new City(2,"La Plata"))),
                new Evento(3,"Evento 3", new Location(1,"Argentina", new City(3,"Mar Chiquita"))),
                new Evento(1,"Evento 1", new Location(1,"Argentina", new City(1,"Mar del Plata"))),
                new Evento(4,"Evento 4", new Location(1,"Argentina", new City(4,"Mar de Cobos"))));



        Evento e = Utils.getEventById(Eventos, 2);
        //String cityName = Utils.getCityNameFromEvent(Eventos, 4);


        /*City c = new City();
        c.name("pepe").id(6).build();)*/

        //isnull(Object);

	    //City city = City.name('dd').id(1).build();
    }
}
