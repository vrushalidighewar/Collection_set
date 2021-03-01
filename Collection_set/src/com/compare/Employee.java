package com.compare;

public class Employee implements Comparable{
	
	private int id;
	private String name;
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		/*Employee1 emp=(Employee1) o;
	if(emp.getId()==this.id) 
		return 0;
	else if(emp.getId() < this.id)          // > descending order
		return 1;
	else 
		return -1;*/
	
	     
		/* Employee1 emp=(Employee1) o;
	      if(emp.getAge() == this.age)
	    	  return 0;
	      else if(emp.getAge() < this.age)
	    	  return 5;                          // Any  positive value
	      else
	    	  return -5;       */                  // Any negative value
		
		
		Employee emp=(Employee) o;
		
		//return this.name.compareTo(emp.getName());           //D T Z
		return emp.getName().compareTo(this.name);             //Z T D
	}

	@Override
	public String toString() {
		return "Employee1 [id= " + id + ",name =" + name + ",age=" + age +"]";
	}
	}

