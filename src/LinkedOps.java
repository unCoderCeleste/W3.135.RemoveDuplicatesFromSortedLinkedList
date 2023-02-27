import java.util.LinkedList;
import java.util.Scanner;

public class LinkedOps {
    private int i = 0;
    private Integer num;
    private Scanner scr = new Scanner(System.in);
    private LinkedList<Integer> ll = new LinkedList<Integer>();

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
        for (int prim = 0; prim < ll.size(); prim++) {
            for (int resto=0; resto<ll.size(); resto++) {
                if (prim<resto && ll.get(prim)==ll.get(resto)) {
                    ll.remove(resto);
                }
            }
        }
        System.out.println(ll);
    }
}