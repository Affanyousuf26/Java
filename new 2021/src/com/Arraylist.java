package com;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(10);

        list.add(67);
        list.add(675);
        list.add(676);
        list.add(6757);
        list.add(673);

       list.remove(2);
        System.out.println(list.get(3));


        System.out.println(list);






    }
}

/*
 for array list from user using for loop first initialize the list like

  for (int i=0;i,3;i++);{
      list.add(new Arraylist<>();
  }

 then let the user add input by using for loop

   for (int i=0 ; i<3;i++);{
       for (int j=0; j<3; j++);{
           list.get(i).add(in.nextInt());
           }
          }

  */



