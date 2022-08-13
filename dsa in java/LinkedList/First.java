package LinkedList;

public class First {

    // inner class
    // node class ko new karneyki authority sirf linked list k pass honichaiye
    // thats y inner and private , koi vi bahar ki class update karsakey

    private class Node {
        // why private?
        // two properties of Node
        int data;
        Node next;

        // we should know the starting
        // head is refrence to the first node
        // head, tail and size is the property of linked list
        private node head;
        private node tail;
        private int size;
        // why private?

        // traversing the linked list

        public void display() {
            Node tempNode = this.head;
            // refrence to class data member
            while (tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }

    }

}
