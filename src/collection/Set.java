package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String args[]){
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for(String data: Arrays.asList("D","H","F","B","Z")){
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }

        //不保证有序
        System.out.println("Ordering in HashSet :"+hashSet);

        //FIFO保证插入顺序有序
        System.out.println("Ordering of elements in LinkedHashSet :"+linkedHashSet);

        //内部实现排序
        System.out.println("Ordering of object in TreeSet :"+treeSet);

    }

}
