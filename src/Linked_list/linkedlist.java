package Linked_list;

public class linkedlist {
    private class Node {
        int data;
        Node next;
        public Node() {
        }
        public Node(int item) {
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public boolean isempty() {
        return size == 0;
    }
    public int getfirst() throws Exception {
        if (size == 0)
            throw new Exception("LL is Empty");
        return head.data;
    }
    public int getlast() throws Exception {
        if (size == 0)
            throw new Exception("LL is Empty");
        return tail.data;
    }
    public int getAt(int index) throws Exception {
        if (index < 0 || index >= size)
            throw new Exception("Invalid Index");
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp.data;
    }
    public void addlast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if (size == 0) {
            head = tail = nn;
            size++;
        } else {
            tail.next = nn;
            tail = nn;
            tail.next = null;
            size++;
        }
    }
    public void display() {
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void addfirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }
    private Node getNodeAt(int index) throws Exception {
        if (index < 0 || index >= size)
            throw new Exception("Invalid Index");
        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp;
    }
    public void addAt(int item, int idx) throws Exception {
        Node nn = new Node();
        if (idx == 0)
            addfirst(item);
        else if (idx == size)
            addlast(item);
        else {
            Node nm1 = getNodeAt(idx - 1);
            nn.data = item;
            nn.next = nm1.next;
            nm1.next = nn;
            size++;
        }
    }
    public int removefirst() throws Exception {
        if (size == 0)
            throw new Exception("LL is Empty");
        Node temp = head;
        if (size == 1) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
        return temp.data;
    }
    public int removelast() throws Exception {
        if (size == 0)
            throw new Exception("LL is Empty");
        Node temp = tail;
        if (size == 1) {
            head = tail = null;
            size--;
        } else {
            tail = getNodeAt(size-2);
            tail.next=null;
            size--;
        }
        return temp.data;
    }
    
    public int removeAt( int index) throws Exception {
        if(index<0 && index>size-1)
            throw new Exception("Invalid Index");
        int rem;
         if( index==0)
            rem=removefirst();
        else if(index==size-1)
            rem=removelast();
        else
        { 
            Node temp = getNodeAt(index-1);
                     rem=temp.next.data;
                    temp.next=temp.next.next;
        }
         return rem;
    }
    public void reversedataswap() throws Exception {
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            Node start = getNodeAt(i);
            Node last = getNodeAt(j);
            int temp = start.data;
            start.data = last.data;
            last.data = temp;
        }
    }
    public void reversenextswap() throws Exception {
        Node curr = head.next;
        Node prev = head;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        tail.next = null;
    }
    public Node reversedatarecur() {
        return reversedatarecur2(head, head, 0);
    }
    private Node reversedatarecur2(Node le, Node ri, int count) {
        if (ri == null)
            return le;
        le = reversedatarecur2(le, ri.next, count + 1);
        if (count <= size / 2) {
            int temp = le.data;
            le.data = ri.data;
            ri.data = temp;
        }
        return le.next;
    }
    public void reversenextrecur() {
        Node curr = head.next;
        Node prev = head;
        reversenextrecur2(prev, curr);
        Node temp = head;
        head = tail;
        tail = temp;
        tail.next = null;
    }
    private void reversenextrecur2(Node prev, Node curr) {
        if (curr == null)
            return;
        reversenextrecur2(curr, curr.next);
        curr.next = prev;
    }
    public Node fold() {
        return fold2(head, head, 0);
    }
    private Node fold2(Node le, Node ri, int count) {
        if (ri == null)
            return le;
        le = fold2(le, ri.next, count + 1);
        if (count > size / 2) {
            Node ahead = le.next;
            ri.next = ahead;
            le.next = ri;
        }
        if (count == size / 2) {
            tail = ri;
            tail.next = null;
        }
        return ri.next;
    }
    public int mid() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public int kthtermlast(int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++)
            fast = fast.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public void linkedListIntersection() {
        Node a1 = new Node(10);
        Node a2 = new Node(20);
        Node a3 = new Node(30);
        Node a4 = new Node(40);
        Node a5 = new Node(50);
        Node a6 = new Node(60);
        Node b1 = new Node(70);
        Node b2 = new Node(80);
        Node b3 = new Node(90);
        Node b4 = new Node(100);
        Node b5 = new Node(110);
        Node b6 = new Node(120);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next = b6;
        b6.next = a3;
    }
    
    public int intersectpoint(Node a1, Node b1) {
        Node temp1=a1;
        Node temp2=b1;
        while(temp1!=null && temp2!=null)
        { temp1=temp1.next;
          temp2=temp2.next; 
        }
        if(temp1==null)
            temp1=b1;
        else
            temp2=a1;
        while(temp1!=null && temp2!=null)
        { temp1=temp1.next;
          temp2=temp2.next; 
        }
        if(temp1==null)
            temp1=b1;
        else
            temp2=a1;
        while(temp1!=temp2)
        { temp1=temp1.next;
          temp2=temp2.next;
        }
        return temp1.data;
    }
    
    public void createDummyList() {
        Node a1 = new Node(10);
        Node a2 = new Node(20);
        Node a3 = new Node(30);
        Node a4 = new Node(40);
        Node a5 = new Node(50);
        Node a6 = new Node(60);
        Node a7 = new Node(70);
        Node a8 = new Node(80);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;
        a7.next = a8;
        a8.next = a3;
        head = a1;
    }
    public boolean loopstart() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
    public void kreverse(int k) throws Exception {
        linkedlist prev = null;
        while (this.size != 0) {
            linkedlist curr = new linkedlist();
            for (int i = 0; i < k && size > 0; i++) {
                int temp = removefirst();
                curr.addfirst(temp);
            }
            if (prev == null)
                prev = curr;
            else {
                prev.tail.next = curr.head;
                prev.tail = curr.tail;
                prev.size+=curr.size;
            }
        }
        head = prev.head;
        tail = prev.tail;
        size = prev.size;
    }
    
    public void partition() throws Exception {
        linkedlist nl=new linkedlist();
        int si=this.size;
        for( int i=0;i<si; i++) {
            int item=this.removefirst();
            if(item%2!=0) 
                nl.addlast(item);
            else
                addlast(item);
        }
        if(nl.tail!=null) {
        nl.tail.next=this.head;
        head=nl.head;
        tail=nl.tail;
        size=nl.size;
        }
    }
    
    public void merge_sorted_list(linkedlist other) throws Exception {
        linkedlist nl = new linkedlist();
        while(!this.isempty() && !other.isempty()) {
            int item1=this.removefirst();
            int item2=other.removefirst();
            if(item1<item2) {
                nl.addlast(item1);
                other.addfirst(item2);
            }
            else {
                nl.addlast(item2);
                this.addfirst(item1);
            }
                
        }
        if(!this.isempty()) 
        nl.tail.next=this.head;
        else if(!other.isempty())
            nl.tail.next=other.head;
        head=nl.head;
        tail=nl.tail;
        size=nl.size;
    }
}