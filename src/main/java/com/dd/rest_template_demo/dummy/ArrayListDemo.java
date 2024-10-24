package com.dd.rest_template_demo.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        //System.out.println("Array list is : " + arrayList);

//        Iterator itr = arrayList.iterator();
//        while (itr.hasNext()) {
//            System.out.println( "Itr"+ itr.next());
//        }
//
//         ListIterator itrList =  arrayList.listIterator(arrayList.size());
//        while (itrList.hasPrevious()) {
//            System.out.println( "List Itr"+ itrList.previous());
//        }


        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }

}
