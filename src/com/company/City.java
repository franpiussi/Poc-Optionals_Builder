package com.company;

public class City {

    private Integer id;
    private String name;

    public City(){
        super();
    }

    public City(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public static class BuilderCity{

        private Integer id;
        private String name;

        public BuilderCity(){
        }

        public BuilderCity id(Integer id){
            this.id=id;
            return this;
        }

        public BuilderCity name(String name){
            this.name=name;
            return this;
        }

        public City build(){
            City c = new City();
            c.id = this.id;
            c.name = this.name;
            return c;
        }


    }

    /*
       Lombok

       @builder
       City {
            id
            name;
        }


     */

}
