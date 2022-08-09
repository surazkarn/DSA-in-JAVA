//generic trees : node in a generic tree can have any number of childrens
//GT consist of a node 
//node consist of type of data 
//and arraylist of node : bcz current node will contain further node inside it but the number of nodes is not defined so we will take arraylist 

//refrence as children

package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private class Node {

        int data;
        ArrayList<Node> children;
        // arraylist of type node
        // refrence as children

        Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        private Node root;
        private int size;

        GenericTree(){

        }

        // to take input of the generic tree
        private Node takeInput(Scanner s, Node parent, int ithchild) {

        }
    }
}
