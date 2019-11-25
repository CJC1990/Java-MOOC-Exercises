package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.*;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
    List<Thing> things = new ArrayList<Thing>();
    things.add(new Item("passport", 8));
    things.add(new Item("toothbrash", 4));
    things.add(new Item("book", 1));
    things.add(new Item("book", 5));
    things.add(new Item("circular saw", 2));

    // we create a packer which uses boxes whose valume is 10
    Packer packer = new Packer(10);

    // we ask our packer to pack things into boxes
    List<Box> boxes = packer.packThings( things );

    System.out.println("number of boxes: "+boxes.size());

    for (Box box : boxes) {
        System.out.println("  things in the box: "+box.getVolume()+" dm^3");
    }
    }
}
