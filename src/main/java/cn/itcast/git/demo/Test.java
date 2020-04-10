package cn.itcast.git.demo;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author linf
 * @version 1.0
 * @date 2020/4/1 14:43
 */
public class Test {
    public static void main(String[] args) {
       /* ArrayList<String  > arrayList=new ArrayList<>();
        //arrayList.add(0,"a");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("!!!");*/
       int[] a=new int[10];
       a[0]=111;
       a[1]=222;
       a[2]=333;
        System.out.println(a);


        //System.out.println(Arrays.toString(a));
        String s = Arrays.toString(a);
        System.out.println(s);
    }
}
