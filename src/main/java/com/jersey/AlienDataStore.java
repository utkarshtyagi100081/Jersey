package com.jersey;

import java.util.ArrayList;
import java.util.List;

public class AlienDataStore {
    List<Alien> aliens;

    public AlienDataStore() {
        aliens = new ArrayList<Alien>();
        Alien a1 = new Alien();
        a1.setName("utkarsh");
        a1.setId(101);
        Alien a2 = new Alien();
        a2.setName("vipul");
        a2.setId(102);
        aliens.add(a1);
        aliens.add(a2);

    }

    public List<Alien> getAliens() {
        return aliens;
    }

    // getting a specification object response
    public Alien getAlien(int id) {
        for (Alien a : aliens) {
            if (a.getId() == id)
                return a;
        }
        return null;
    }

    public void createAlien(Alien a) {
        aliens.add(a);
    }

    public Alien deleteAlien(int id) {
        for (Alien a : aliens) {
            if (a.getId() == id) {
                aliens.remove(aliens.indexOf(a));
                return a;
            }
        }
        return null;
    }
}
