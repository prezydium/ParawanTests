package org.prezydium;

public class Place {

    /*
    indywidualne id oraz współrzędne
     */
    int id, x, y;
    Object status;

    public Place(int id, int x, int y, Object status) {
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
}
