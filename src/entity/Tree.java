package entity;

public interface Tree<E> {
    boolean insert(E e);
    void inovo();
    int getSize();
}