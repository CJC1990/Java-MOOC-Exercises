package moving.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {

        //Create the boxList that this method will return
        List<Box> boxList = new ArrayList<Box>();

        //Create a new box to put the given list of things into
        Box box = new Box(boxesVolume);

        //For each thing in the given thing list, add that thing to the box, if it fails, create a new box and put the thing in the new box
        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxList.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }
        }

        boxList.add(box);
        return boxList;

    }

}
