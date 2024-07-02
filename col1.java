
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class col1 {

    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(101);
        al1.add(102);
        al1.add(103);
        al1.add(104);
        al1.add(105);
        al1.add(106);
        System.out.println("al1:-" + al1);
        System.err.println("-------------------------");
        for (int i = 0; i <= al1.size() - 1; i++) {
            System.err.println("Index :- " + i + "Value:- " + al1.get(i));
        }

        System.err.println("------------------------------------------");

        Iterator iterator = al1.iterator();
        while (iterator.hasNext()) {
            System.err.println(iterator.next() + " ");
        }

        System.err.println("----------------------------------");

        ListIterator listIterator = al1.listIterator();
        while (listIterator.hasNext()) {
            System.err.println(listIterator.next() + " ");
        }

        System.err.println("-------------------In Reverse Order-----");

        while (listIterator.hasPrevious()) {
            System.err.println(listIterator.previous() + " ");
        }

        System.err.println("--------------clone of ArrayList----------------");

        ArrayList ALc = (ArrayList) al1.clone();
        System.err.println("Original ArrayList " + al1);
        System.err.println("Cloned ArrayList " + ALc);
    }
}
