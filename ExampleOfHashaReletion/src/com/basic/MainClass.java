package com.basic;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
           public static void main(String ar[])
           {
        	   Mobile mobile=new Mobile("Vodafone", 4597885);
        	   
        	   
        	   Mobile mobile1=new Mobile("Aircel", 4597885);
        	   Mobile mobile2=new Mobile("Docomo", 4597885);
        	   Mobile mobile3=new Mobile("Airtel", 4597885);
        	   List<Mobile> list=new ArrayList<>();
        	   list.add(mobile);
        	   list.add(mobile1);
        	   list.add(mobile2);
        	   list.add(mobile3);
        	   User user=new User(1, "Anil", list);
        	   System.out.println(user);
           }
}
