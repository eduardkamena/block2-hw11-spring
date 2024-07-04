package pro.sky.spring.util;

import java.util.ArrayList;
import java.util.List;

public class ItemsDatabase extends ItemsConstructor {

    public ItemsDatabase(int id, String name, int price) {
        super(id, name, price);
    }

    public final static List<ItemsConstructor> items = new ArrayList<>(List.of(
            new ItemsConstructor(1, "Яблоки", 120),
            new ItemsConstructor(2, "Апельсины", 80),
            new ItemsConstructor(3, "Мандарины", 90),
            new ItemsConstructor(4, "Виноград", 100),
            new ItemsConstructor(5, "Черешня", 125),
            new ItemsConstructor(6, "Вишня", 135),
            new ItemsConstructor(7, "Бананы", 155),
            new ItemsConstructor(8, "Персики", 142),
            new ItemsConstructor(9, "Груши", 112),
            new ItemsConstructor(10, "Ананас", 123)
    ));

}
