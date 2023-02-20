package org.example;

import java.util.Comparator;

public class ComparingSquads implements Comparator<Squad> {
    @Override
    public int compare(Squad squad1, Squad squad2) {
        if(squad1.getSquadNo()>squad2.getSquadNo()){
            return 1;
        }
        else if (squad1.getSquadNo()<squad2.getSquadNo()){
            return -1;
        }
        return 0;
    }
}
