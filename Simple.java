import java.util.*;
import java.io.*;

class Simple{
    public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add(new Student(101,"Anjana",23));
        al.add(new Student(106,"Snega",21));
        al.add(new Student(105,"Kaviya",22));
        al.add(new Student(104,"Deepika",21));

        System.out.println("Sorting by Name");

        Collections.sort(al,new NameComparator());
        Iterator it=al.iterator();
        while(it.hasNext()){
            Student st=(Student)it.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");

        Collections.sort(al,new AgeComparator());
        Iterator itr2=al.iterator();
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}  