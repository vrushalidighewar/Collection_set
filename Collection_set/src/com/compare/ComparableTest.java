package com.compare;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Z");
		e1.setAge(25);
		
		Employee e2=new Employee();
		e2.setId(104);
		e2.setName("T");
		e2.setAge(28);
		
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("D");
        e3.setAge(30);
        
        List list=new ArrayList();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        list.forEach(System.out :: println);
        
        Collections.sort(list);
        
        System.out.println("_______ after sorting _______");
        
        list.forEach(System.out :: println);
	}

}
