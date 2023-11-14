package p1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,String> names = new TreeMap<>();
        names.put(10, "Alex");
        names.put(1, "Masha");
        names.put(11, "Ivan");
        names.put(5, "Katya");
        for (Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.printf("Key %d Value: %s\s", entry.getKey(), entry.getValue()); // Key 1 Value: Masha Key 5 Value: Katya Key 10 Value: Alex Key 11 Value: Ivan
        }
        Set<Integer> keys = names.keySet(); // получить весь набор ключей
        Collection<String>  value = names.values(); // получить коллекцию по значению
        // получить под коллекции
        Map<Integer, String> hNames = names.headMap(5);  // указать все объекты, которые стоят до 5 {1=Masha}
        Map<Integer, String> tNames = names.tailMap(5); // указать объекты после 5 ( в этом случае 5 будет включено)

        System.out.println(hNames);
        System.out.println(tNames);

        Map.Entry<Integer, String> name = names.lastEntry(); // получение последнего элемента
        System.out.println(name); //11=Ivan
        System.out.println(name.getKey()); // 11
        System.out.println(name.getValue()); // Ivan
        System.out.println(names.get(10));  // Alex - отдаем ключ, получаем значение
        System.out.println(names.containsValue("Alex")); // true
        System.out.println(names.containsKey(2)); // false  - проверка позначению ключа

        System.out.println(names.firstEntry()); //  1=Masha _ получение первого элемента
        System.out.println(names.lastEntry()); //  11=Ivan _ получение второго элемента

        // Создаем коллекцию уникальные ключи
        Map<String, People> peopels = new TreeMap<>();
        peopels.put("FGHJK", new People("Ivan"));
        peopels.put("56iuyt", new People("masha"));

        for (Map.Entry<String, People> peopleEntry: peopels.entrySet()){
            System.out.printf("Key: %s Value: %s\n", peopleEntry.getKey(), peopleEntry.getValue().getName());
            /*   Вывод   Key: 56iuyt Value: masha
                         Key: FGHJK Value: Ivan  */
        }
    }
}