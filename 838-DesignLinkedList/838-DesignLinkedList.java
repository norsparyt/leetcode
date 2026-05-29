// Last updated: 30/05/2026, 00:04:33
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
     int size;
    public MyLinkedList() {
        head = null;
        size=0;
    }

    public int get(int index) {
        if (index >= size) return -1;
        Node curr = head;
        for (int i = 0; i < index; i++) 
            curr = curr.next;
        return curr.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if(head==null){
            head=node;
        }
        else{
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        
            Node curr = head;
            int i = 0;
            while (i < index - 1) {
                curr = curr.next;
                i++;
            }
            node.next = curr.next;
            curr.next = node;
            size++;
        
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return; //important equality check
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node curr = head;
        int i = 0;
        while (i < index - 1) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */