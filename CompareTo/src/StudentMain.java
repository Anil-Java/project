

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String ar[])
    {
    	Student student=new Student();
    	student.setId(1);
    	student.setName("Anil");
    	Student student2=new Student();
    	student2.setId(3);
    	student2.setName("Abhay");
    	Student student3=new Student();
    	student3.setId(5);
    	student3.setName("Deepanker");
    	ArrayList<Student> arrayList=new ArrayList<>();
    	arrayList.add(student2);
    	arrayList.add(student);
    	arrayList.add(student3);
    	System.out.println(arrayList);
    	Collections.sort(arrayList);
    	System.out.println(arrayList);
    }
}
