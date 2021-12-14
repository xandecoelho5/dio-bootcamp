package one.digitalinnovation;

public class BTree<T extends Comparable<T>> {

    private Node<T> root;

    public BTree() {
        this.root = null;
    }

    public void insert(T content) {
        Node<T> newNode = new Node<>(content);
        root = insert(root, newNode);
    }

    private Node<T> insert(Node<T> currentNode, Node<T> newNode) {
        if (currentNode == null) {
            return newNode;
        } else if (newNode.getContent().compareTo(currentNode.getContent()) < 0) {
            currentNode.setLeftNode(insert(currentNode.getLeftNode(), newNode));
        } else {
            currentNode.setRightNode(insert(currentNode.getRightNode(), newNode));
        }
        return currentNode;
    }

    public void showInOrder() {
        System.out.println("\nShowing InOrder");
        showInOrder(this.root);
    }

    private void showInOrder(Node<T> current) {
        if (current != null) {
            showInOrder(current.getLeftNode());
            System.out.print(current.getContent() + ", ");
            showInOrder(current.getRightNode());
        }
    }

    public void showPostOrder() {
        System.out.println("\nShowing PostOrder");
        showPostOrder(this.root);
    }

    private void showPostOrder(Node<T> current) {
        if (current != null) {
            showPostOrder(current.getLeftNode());
            showPostOrder(current.getRightNode());
            System.out.print(current.getContent() + ", ");
        }
    }

    public void showPreOrder() {
        System.out.println("\nShowing PreOrder");
        showPreOrder(this.root);
    }

    private void showPreOrder(Node<T> current) {
        if (current != null) {
            System.out.print(current.getContent() + ", ");
            showPreOrder(current.getLeftNode());
            showPreOrder(current.getRightNode());
        }
    }

    public void remove(T content) {
        try {
            Node<T> current = this.root;
            Node<T> parent = null;
            Node<T> child = null;
            Node<T> temp = null;

            while (current != null && !current.getContent().equals(content)) {
                parent = current;
                if (content.compareTo(current.getContent()) < 0) {
                    current = current.getLeftNode();
                } else {
                    current = current.getRightNode();
                }
            }

            if (current == null) {
                System.out.println("Content not found. Try block.");
            }

            if (parent == null) {
                if (current.getRightNode() == null) {
                    this.root = current.getLeftNode();
                } else if (current.getLeftNode() == null) {
                    this.root = current.getRightNode();
                } else {
                    for (temp = current, child = current.getLeftNode(); child.getRightNode() != null; temp = child, child = child.getLeftNode()) {
                        if (child != current.getLeftNode()) {
                            temp.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            } else if (current.getRightNode() == null) {
                if (parent.getLeftNode() == current) {
                    parent.setLeftNode(current.getLeftNode());
                } else {
                    parent.setRightNode(current.getLeftNode());
                }
            } else if (current.getLeftNode() == null) {
                if (parent.getLeftNode() == current) {
                    parent.setLeftNode(current.getRightNode());
                } else {
                    parent.setRightNode(current.getRightNode());
                }
            } else {
                for (temp = current, child = current.getLeftNode(); child.getRightNode() != null; temp = child, child = child.getRightNode()) {
                    if (child != current.getLeftNode()) {
                        temp.setRightNode(child.getLeftNode());
                        child.setLeftNode(current.getLeftNode());
                    }
                    child.setRightNode(current.getRightNode());
                    if (parent.getLeftNode() == current) {
                        parent.setLeftNode(child);
                    } else {
                        parent.setRightNode(child);
                    }
                }
            }

        } catch (NullPointerException error) {
            System.out.println("Content not found. Catch block.");
        }
    }
}
