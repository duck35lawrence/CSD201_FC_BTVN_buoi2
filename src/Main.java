
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.addLast(30);
//        singlyLinkedList.addFirst(20);
//        singlyLinkedList.addFirst(10);
//        
//        int index = 2;
//        if(singlyLinkedList.getNodeByPosition(index) != null){
//            System.out.println(singlyLinkedList.getNodeByPosition(index).data);
//        }else{
//            System.out.println("Nothing to print");
//        }
//        
//        singlyLinkedList.printListNode();

        // Stack
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped from stack: " + stack.pop().data);

        // Queue
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued from queue: " + queue.dequeue().data);

    }
}
