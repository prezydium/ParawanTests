package com.parawan;

import java.util.HashMap;
import java.util.Map;

public class Reservation extends HashMap<Integer, String>{

    private Integer placeId;
    private String name;

    public int getPlaceId() {
        return placeId;
    }

    public Reservation(int placeId, String name) {
        this.placeId = placeId;
        this.name = name;
    }

    public Reservation() {

    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReserved(int id, Map map){
         return map.containsKey(id);
    }
}
