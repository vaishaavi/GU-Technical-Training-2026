public class reverse {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
            this.data = data1;
            this.next= next1;
        }
        Node(int data1){
            this.data = data1;
        }
    }
    static Node makeLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 0; i < arr.length; i++) {
            temp.next= new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    static void printLL(Node head){
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node reverse(Node head){
        Node temp = head;
        Node prev=null;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,6,12,0,34};
        Node head=makeLL(arr);
        Node newHead=reverse(head);
        printLL(newHead);
    }
}
