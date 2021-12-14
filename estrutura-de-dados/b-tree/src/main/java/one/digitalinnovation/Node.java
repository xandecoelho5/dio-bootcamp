package one.digitalinnovation;

public class Node<T extends Comparable<T>> {

    private T content;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node() {
    }

    public Node(T content) {
        this.content = content;
        this.leftNode = this.rightNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}
