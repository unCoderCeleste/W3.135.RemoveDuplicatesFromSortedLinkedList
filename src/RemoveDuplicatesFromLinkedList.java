
/*
135. Write a Java program to remove duplicates from a sorted linked list.
Original List with duplicate elements:
12->12->13->14->15->15->16->17->17
After removing duplicates from the said list:
12->13->14->15->16->17
*/
import java.util.LinkedList;
import java.util.Scanner;
public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        System.out.println("REMOVE DUPLICATES FROM SORTED LINKED LIST");

        LinkedOps lo = new LinkedOps();
        lo.createLinkedList();
        lo.rimuoviElementiRipetuti();
    }
}
