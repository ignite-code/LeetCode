/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        Node node = new Node(0);
        Node n = node;
        HashMap<Node,Node> map = new HashMap<>();
        while(temp!=null){
            n.next = new Node(temp.val);
            map.put(temp,n.next);
            n = n.next;
            temp = temp.next;
        }
        temp = head;
        n=node.next;
         while (temp != null) {
            n.random = map.get(temp.random);
            n = n.next;
            temp = temp.next;
        }

        return node.next;
    }
}