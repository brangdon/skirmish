import java.util.*;

import static java.util.Arrays.*;

class Node {

    Node left;
    Node right;
    String value;
    boolean visited;

    public Node(Node left, Node right, String val) {
        this.left = left;
        this.right = right;
        this.value = val;
        this.visited = false;

    }

    public void markNode() {
        this.visited = true;
    }
}


public class Main {

    static Queue<Node> bfsQueue = new ArrayDeque<>();

    static void DFS(Node node) {

        if (!node.visited) {
//            bfsQueue.add(node);
            System.out.println(node.value);
            node.markNode();

            if (node.left != null) {
                DFS(node.left);
            }

            if (node.right != null) {
                DFS(node.right);
            }
        }

    }

    static void BFS(Node node) {

        bfsQueue.add(node);

        while (!bfsQueue.isEmpty()) {
            Node n = bfsQueue.poll();
            System.out.println(n.value);
            Node l = n.left;
            Node r = n.right;

            if (l != null) {
                bfsQueue.add(l);
            }

            if (r != null) {
                bfsQueue.add(r);
            }

//            bfsQueue.peek();
        }

    }

    public static void main(String[] args) {

        Node d = new Node(null, null, "D");
        Node f = new Node(null, null, "F");
        Node e = new Node(null, null, "E");
        Node b = new Node(d, null, "B");
        Node c = new Node(e, f, "C");
        Node root = new Node(b, c, "A");

        DFS(root);

        bfsQueue.add(d);
        bfsQueue.add(f);
        bfsQueue.add(e);
        bfsQueue.add(b);
        bfsQueue.add(c);

        bfsQueue.poll();

        System.out.println("DFS =========");
        while (!bfsQueue.isEmpty()) {
            System.out.println(bfsQueue.poll().value);
//            bfsQueue.poll();
        }

        System.out.println("BFS =========");
        BFS(root);
        System.out.println("=========");


    }
}
