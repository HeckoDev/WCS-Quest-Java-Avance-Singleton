package org.WCS;

import java.util.*;

public class Family {
    public static void main(String[] args) {
        Person grandparent1 = new Person("Grandparent1");
        Person grandparent2 = new Person("Grandparent2");
        Person parent1 = new Person("Parent 1");
        Person parent2 = new Person("Parent 2");
        Person child1 = new Person("Child 1");
        Person child2 = new Person("Child 2");
        Person child3 = new Person("Child 3");

        grandparent1.addDescendant(parent1);
        grandparent1.addDescendant(child1);
        grandparent1.addDescendant(child2);

        grandparent2.addDescendant(parent1);
        parent1.addDescendant(child1);
        parent1.addDescendant(child2);
        parent2.addDescendant(child3);

        System.out.println(grandparent1);
        System.out.println(parent1);
        System.out.println(parent2);


    }
}
