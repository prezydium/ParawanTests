package com.parawan;

//testclassnotingit

import java.io.*;
import java.util.Scanner;

public class Apptest {

    public static void main(String[] args) throws IOException {
        Beach beachBrzezno = new Beach(20, 10);
        beachBrzezno.createPlaces();


        Scanner sc = new Scanner(System.in);
        int x = 0;
        int choosedID = 0;


        while (true) {
            System.out.println("What do you want? 1. Reserve place 2. Cancel reservation 3. Exit program");
            x = sc.nextInt();
            if (x == 1) {
                System.out.println("Choose place to reserve by ID");
                choosedID = sc.nextInt();
                beachBrzezno.get(choosedID -1).setStatus(PlaceStatus.RESERVED);

            } else if (x == 2) {
                System.out.println("Choose place to cancel reservation by ID");
                choosedID = sc.nextInt();
                beachBrzezno.get(choosedID -1).setStatus(PlaceStatus.FREE);

            } else{
                break;
            }
            write(beachBrzezno);
            x = 0;
            choosedID = 0;
        }
    }



    public static void write(Beach beach) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("database");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int z = 0; z < beach.size(); z++) {


            StringBuilder sb = new StringBuilder();
            Place place = (Place) beach.get(z);

            sb.append(place.getId() + ";");
            sb.append(place.getX() + ";");
            sb.append(place.getY() + ";");
            sb.append(place.getStatus() + ";");

            pw.println(sb);
            }
        pw.close();
    }
}
