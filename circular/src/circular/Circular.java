/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

/**
 *
 * @author fa23-bse-110
 */
public class Circular {

    /**
     * @param args the command line arguments
     */
    
    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    
    public Circular() {
        
      head = new Node(0); 
        tail = head;
        head.next = head; 
    }
    
     public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode; 
        tail = newNode; 
        tail.next = head; 
        
        System.out.println("Appended " + value);
    }
  public void DeleteFromStart(){
     if (head.next == head){
        System.out.println("Cannot delete: List is empty.");
        return;
 }
       Node deletedNode = head.next;
       
       if (deletedNode == tail) {
        tail = head;
    }
       
        head.next = deletedNode.next;
        
        System.out.println("\n Deleted " + deletedNode.data + " from the start.");
  }
   public void display() {
        if (head.next == head) {
            System.out.println("List: (empty)");
            return;
        }

        System.out.print("List: ");
        Node current = head.next;

        while (current != head) {
            System.out.print(current.data);
            if (current.next != head) {
                System.out.print(" -> "  );
            }
            current = current.next;
            
        }
        
        
        
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

       
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head; 
        tail = temp; 
         System.out.println("\n Deleted  from the end.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Circular list = new Circular();
        
        list.append(10);
        list.append(20);
        list.append(30);
        list.display();
        list.DeleteFromStart();
        list.display();
        list.deleteFromEnd();
        list.display();
        list.DeleteFromStart();
                list.display();

        
        
    }
    
}
