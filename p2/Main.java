package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Collections.addAll(names, "Alex", "Ivan", "Masha", "Katya");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next()); // next() указывавет на последний элемент в коллекции
        }

        listIterator.set("Tanya");  // "Katya" замена на "Tanya"
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());  // напечатать элемент в обратном порядке
        }
    }
}
