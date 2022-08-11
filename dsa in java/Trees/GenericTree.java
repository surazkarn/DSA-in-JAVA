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
            this.data = data;
            this.children = new ArrayList<>();
        }

        private Node root;
        private int size;

        GenericTree(){

            Scanner s=new Scanner(System.in);
            this.root=takeInput(s,null, 0);

            

        }

        // to take input of the generic tree
        private Node takeInput(Scanner s, Node parent, int ithchild) {

        }
    }
}
