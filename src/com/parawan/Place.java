package com.parawan;

public class Place {

    /*
    indywidualne id oraz współrzędne
     */
    private int id, x, y;
    private PlaceStatus status;

    public Place(int id, int x, int y, PlaceStatus status) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Object getStatus() {
        return status;
    }
    public void showInfo(){
        System.out.println("Id miejsca: " + id + " || " + "" +
                "X: " + x + " || " + "Y: " + y + " || " + "Status: " + status);
    }

    public void setStatus(PlaceStatus status) {
        this.status = status;
    }
}
