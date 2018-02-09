package com.parawan;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ReservationTable {

    private Map<Hour , Reservation> reservations = new TreeMap<Hour , Reservation>();
    private int hour, placeId;
    private String name;

    public Map<Hour, Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Map<Hour, Reservation> reservations) {
        this.reservations = reservations;
    }

    private Scanner sc = new Scanner(System.in);

    public ReservationTable reserve (){
        System.out.println("enter place ID");
        placeId = sc.nextInt();
        System.out.println("enter hour");
        hour = sc.nextInt();
        //insert check here
        System.out.println("enter name");
        System.out.println("\n");
        name = sc.nextLine();
        if  (checkReservation()) {
            System.out.println("already booked");
        }else{
            reservations.put(Hour.values()[hour], new Reservation(placeId, name));
            System.out.println("reserved place" + placeId + " for " + Hour.values()[hour]);
        }
    return this;
    }

    private boolean checkReservation(){
      return  (reservations.containsKey(Hour.values()[hour])&&(reservations.get(Hour.values()[hour]).containsKey(placeId)));
    }
    public void showReservations(){

    }

}
