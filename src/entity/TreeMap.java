package entity;

public class TreeMap<E extends Comparable<E>> extends AbstractTree<E> {
    public boolean search(E e) {
        TreeNode<E> curent = this.root;
        while (curent!=null) {
            if (e.compareTo(curent.element) > 0) {
                curent = curent.right;
            } else if (e.compareTo(curent.element) < 0) {
                curent = curent.left;
            } else {
                return true;
            }
        }
        return false;
    }

    class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }
    }

    private TreeNode<E> root;
    private int size = 0;

    public TreeMap() {
    }

    ;

    @Override
    public boolean insert(E e) {
        if (this.root == null) {
            this.root = new TreeNode<>(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> curent = this.root;
            while (curent != null) {
                if (e.compareTo(curent.element) > 0) {
                    parent = curent;
                    curent = curent.right;
                } else if (e.compareTo(curent.element) < 0) {
                    parent = curent;
                    curent = curent.left;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) > 0) {
                parent.right = new TreeNode<>(e);
            } else {
                parent.left = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void inovo() {
        inovo(this.root);
    }

    private void inovo(TreeNode<E> root){
        if(root==null){
            return;
        }
        System.out.println("Element :" +root.element);
        inovo(root.left);
        inovo(root.right);
    }
}