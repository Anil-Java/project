

public class Student implements Comparable {
   private int id;
   private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int compareTo(Object o) {
	Student student=(Student)o;
	if(this.getId()>student.getId())
		return 1;
	else if(this.getId()<student.getId())
		return -1;
	return 0;
}
public String toString()
{
	return id+"       "+name;
}
   
}
