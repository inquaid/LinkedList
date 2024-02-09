import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sl = new SinglyLinkedList();

        while (true) {
            System.out.println("\nOperations:");
            System.out.println("1. Add First");
            System.out.println("2. Add Middle");
            System.out.println("3. Add Last");
            System.out.println("4. Show List");
            System.out.println("5. Remove First");
            System.out.println("6. Remove Middle");
            System.out.println("7. Remove Last");
            System.out.println("8. Sort List");
            System.out.println("9. Reverse List");
            System.out.println("10. Is Empty?");
            System.out.println("11. Clear List");
            System.out.println("12. Exit");
            System.out.print("Choose an operation: ");

            int operation = sc.nextInt();
            int value, pos;

            switch (operation) {
                case 1:
                    System.out.print("Value to add at the beginning: ");
                    value = sc.nextInt();
                    sl.addFirst(value);
                    break;
                case 2:
                    System.out.print("Enter value and position to add: ");
                    value = sc.nextInt();
                    pos = sc.nextInt();
                    sl.addMiddle(value, pos);
                    break;
                case 3:
                    System.out.print("Value to add at the end: ");
                    value = sc.nextInt();
                    sl.addLast(value);
                    break;
                case 4:
                    System.out.println("List: ");
                    sl.showList();
                    break;
                case 5:
                    System.out.println("Removing first element...");
                    sl.removeFirst();
                    break;
                case 6:
                    System.out.print("Enter position to remove: ");
                    pos = sc.nextInt();
                    sl.removeMiddle(pos);
                    break;
                case 7:
                    System.out.println("Removing last element...");
                    sl.removeLast();
                    break;
                case 8:
                    System.out.println("Sorting list...");
                    sl.sort();
                    break;
                case 9:
                    System.out.println("Reversing list...");
                    sl.reverse();
                    break;
                case 10:
                    if (sl.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("List is not empty.");
                    }
                    break;
                case 11:
                    System.out.println("Clearing list...");
                    sl.clear();
                    System.out.println("List cleared");
                    break;
                case 12:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }
}
