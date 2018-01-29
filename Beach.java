package org.prezydium;

import java.util.ArrayList;

public class Beach<T> extends ArrayList {

    public Beach() {


    }

    public void createPlaces() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 200; i++) {


            Place place = new Place(i, x, y, PlaceStatus.FREE);
            this.add(place);
            x++;
            y++;
            if (x >= 19) {
                x = 0;
            }
            if (y >= 9) {
                y = 0;
            }
        }

    }


}
