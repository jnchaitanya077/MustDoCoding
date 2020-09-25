
public class Solution {

    public Node merge(Node l1, Node l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        Node current = new Node(0);
        Node temp = current;

        while (l1 != null && l2 != null) {
            //if l1 val is less than l2 add l1 val to current.next
            //and move l1 to next node
            if (l1.val < l2.val) {
                Node n = new Node(l1.val);
                temp.next = n;
                l1 = l1.next;
            } 
            //if l2 val is less than l1 add l2 val to current.next
            //and move l2 to next node
            else {
                Node n = new Node(l2.val);
                temp.next = l2;
                l2 = l2.next;
            }
            //finally move current to next position
            current = current.next;
        }
        // any node l1 or l2 finishes before l2 or l1 then add the lst node 
        // to the current;
        if (l1 != null) {
            Node n = new Node(l1.val);
            current.next = n;
        }
        if (l2 != null) {
            Node n = new Node(l2.val);
            current.next = n;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Node l1 = new Node(4);
        Node l2 = new Node(3);

        Node temp = s.merge(l1, l2);
        while (temp.next != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
}