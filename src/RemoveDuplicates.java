import java.util.LinkedList;
import java.util.Scanner;
public class RemoveDuplicates {
    private int i = 0;
    private Integer num;
    private Scanner scr = new Scanner(System.in);
    private LinkedList<Integer> ll = new LinkedList<>();
    public void createLinkedList() {
        System.out.println("Creiamo la LinkedList: ");
        do {
            System.out.print("Elemento " + i + " ('-1' per finire): ");
            num = scr.nextInt();
            if (num != -1) {
                ll.add(num);
                i++;
            }
        } while (num != -1);
        System.out.println(ll);
    }
    public void rimuoviElementiRipetuti() {
        System.out.println("Rimuoviamo ripetuti");
        LinkedList<Integer> ll2 = new LinkedList<>();
        for (int prim = 0; prim < ll.size(); prim++) {
            if (!ll2.contains(ll.get(prim))) {
                ll2.add(ll.get(prim));
            }
        }
        ll = ll2;
        System.out.println(ll);
    }
}