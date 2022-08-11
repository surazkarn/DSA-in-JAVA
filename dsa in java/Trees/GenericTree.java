//generic trees : 
//node can have any number of childrens

package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    // GT consist of a node
    private class Node {

        // node consist of integer type of data
        int data;

        ArrayList<Node> children;
        // arraylist of type node : bcz current node will contain further node
        // with it
        // but the number of nodes is not defined so we will take arraylist
        // and refrence as children

        // Node constructor
        Node(int data) {
            // initialize data and children
            // passed data and constructor

            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private Node root;
    private int size;

    GenericTree() {

        Scanner s = new Scanner(System.in);
        // parent of root node is nothing null
        this.root = takeInput(s, null, 0);
    }

    // to take input of the generic tree
    private Node takeInput(Scanner s, Node parent, int ithchild) {
        // recursive function

        if (parent == null) {
            System.out.println("enter the data for root node");
        } else {
            System.out.println("enter data for the " + ithchild + "th child of" + parent.data);
        }

        // take input for root node
        int nodedata = s.nextInt();
        Node node = new Node(nodedata);
        this.size++;

        System.out.println("enter the number of childerens for " + node.data);
        int children = s.nextInt();

        // will be executed according the value of chikldren
        for (int i = 0; i < children; i++) {
            Node child = this.takeInput(s, parent, i);
            node.children.add(child);

        }
        return node;
    }

    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        // node data
        String str = node.data + "=>";
        for (int i = 0; i < node.children.size(); i++) {
            // add children data of current node
            str = str + node.children.get(i).data + ", ";
        }
        str = str + "END";
        // display the string for current node
        System.out.println(str);
        // display for all nodes
        for (int i = 0; i < node.children.size(); i++) {
            this.display(node.children.get(i));
        }

    }
}
