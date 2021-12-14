package one.digitalinnovation;

import one.digitalinnovation.model.Obj;

public class Main {

    public static void main(String[] args) {
        BTree<Obj> myTree = new BTree<>();

        myTree.insert(new Obj(13));
        myTree.insert(new Obj(10));
        myTree.insert(new Obj(25));
        myTree.insert(new Obj(2));
        myTree.insert(new Obj(12));
        myTree.insert(new Obj(20));
        myTree.insert(new Obj(31));
        myTree.insert(new Obj(29));

        myTree.showInOrder();
        myTree.showPreOrder();
        myTree.showPostOrder();
    }
}
