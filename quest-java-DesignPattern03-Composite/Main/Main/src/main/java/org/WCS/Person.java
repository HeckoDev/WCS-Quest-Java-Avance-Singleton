package org.WCS;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Person> descendants;

    public Person(String name) {
        this.name = name;
        this.descendants = new ArrayList<>();
    }

    public void addDescendant(Person child) {
        descendants.add(child);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);

        if (!descendants.isEmpty()) {
            stringBuilder.append(" (");
            for (int i = 0; i < descendants.size(); i++) {
                stringBuilder.append(descendants.get(i).name);
                if (i < descendants.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(")");
        }

        return stringBuilder.toString();
    }
}
