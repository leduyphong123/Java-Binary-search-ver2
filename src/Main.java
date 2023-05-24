import entity.TreeMap;

public class Main{
    public static void main(String[] args){
        TreeMap<Integer> treeMap = new TreeMap<>();
        treeMap.insert(1);
        treeMap.insert(3);
        treeMap.insert(-3);
        treeMap.insert(6);
        treeMap.inovo();
        System.out.println(treeMap.search(4));
    }
}