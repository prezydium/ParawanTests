package com.parawan;

//testclassnotingit

import java.io.*;

public class Apptest {

    public static void main(String[] args) throws IOException {
        Beach beachBrzezno = new Beach(20, 10);
        beachBrzezno.createPlaces();


        PrintWriter pw = new PrintWriter(new FileWriter(new File("brzezno")));

        for (int i = 0; i<beachBrzezno.size(); i++) {

            StringBuilder sb = new StringBuilder();
            Place place = beachBrzezno.get(i);

            sb.append(place.getId() + ";");
            sb.append(place.getX() + ";");
            sb.append(place.getY() + ";");
            sb.append(place.getStatus() + ";");


            pw.println(sb);

        }
        pw.close();



    }
}
