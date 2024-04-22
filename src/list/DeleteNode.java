package list;
import java.util.LinkedList;

public class DeleteNode {

    public void deleteNode(LinkedList node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
