public class LinkedList{
    static class node{
        int data;
        node next;
        node(int value){
            data= value;
            next= null;
        }
    }
    static node head;

    //display list
    static void printList(){
        node P = head;
        System.out.println("\n[");

        //start from beginning
        while(P!=null){
            System.out.println(" " + P.data+ " ");
            P = P.next;
        }
        System.out.println(" ]");
    }

    //Insert At the beginning
    static void insertatbegin(int data){
        //create a link
        node lk = new node(data);
        //point it to old first node
        lk.next = head;
        //point first to new first node
        head = lk;
    }

    //Insert at the end
    static void insertatend(int data){
        //create a link
        node lk = new node(data);
        node linkedlist = head;
        //point it to old first node
        while(linkedlist.next != null)
        linkedlist = linkedlist.next;
        //point first to new first node
        linkedlist.next = lk;
    }

    //Insert at the given position
    static void insertafternode(node list, int data){
        node lk = new node(data);
        lk.next = list.next;
        list.next =lk;
    }

    //Deletion at Beginning
    static void deleteatbegin(){
        head = head.next;
    }

    //Deletion at Ending
    static void deleteatend(){
        node linkedlist = head;
        while (linkedlist.next.next != null)
            linkedlist = linkedlist.next;
            linkedlist.next =null;
    }

    //Deletion any node
    static void deletenode(int key){
        node temp = head;
        node prev = null;
        if (temp !=null && temp.data ==key ){
            head = temp.next;
            return;
        }

        //Find the key to be deleted
        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        //if the key is not present
        if (temp == null) return;
        //remove the node
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        insertatbegin(80);
        insertatend(14);
        insertatend(20);
        insertatend(45);
        insertatend(60);
        insertafternode(head.next,50);
        insertafternode(head.next.next,63);

        System.out.println("Linked List: ");
        printList();

        deleteatbegin();
        deleteatend();
        deletenode(14);
        System.out.println("\n Linked list after deletion : ");
        printList();
    }
}