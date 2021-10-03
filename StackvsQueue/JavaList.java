import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        /* Create and fill Linked List of Integers */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String s = scan.next();
            if (s.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        for (int num: list) {
            System.out.print(num + " ");
        }
    }
}
