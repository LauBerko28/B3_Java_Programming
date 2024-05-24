package day28_arrayList;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("keyboard");
        list.add("mouse");
        System.out.println(list); // [computer, screen, keyboard, mouse]

        String str = list.remove(0); // [screen, keyboard, mouse] --> when i remove by index it returns me a string
        System.out.println(list.remove(0)); //  [keyboard, mouse]]

        System.out.println(list); //  [keyboard, mouse]]

       boolean b = list.remove("mouse"); // it'll remove the first match --> when im removing by the element it'll return true or false if it found a matching case or not

        System.out.println(list); // [keyboard]

        System.out.println(list.remove("mouse")); // will return false because there is not a matching case
        System.out.println(list);// [keyboard]


    }
}
