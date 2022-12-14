package numbers;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        ListIterator<Integer> numberIterator = number.listIterator();
        while (numberIterator.hasNext()) {
            Integer numb = numberIterator.next() + 1;
            System.out.println(numb);
        }
    }
}