package ir.helli.school;

import ir.helli.enums.Roles;

public class Person
{
	protected String name;
	protected Roles role;
	protected int id;
	
	/* public default constructor for class Person */
	public Person()
	{
		setId(0);
		setRole(Roles.Student);
		setName(null);
	}
	
	/* public parameterized constructor for class Person */
	public Person(String name, Roles role, int id)
	{
		setId(id);
		setRole(role);
		setName(name);
	}
	
	/* [start] getters, setters for class fields */
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Roles getRole()
	{
		return role;
	}
	
	public void setRole(Roles role)
	{
		this.role = role;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	/* [end] getters, setters for class fields */
	
	public void printInfo()
	{
		System.out.println( "Name is: " + getName() + ", Id is: " + getId() + ", Role is: " + getRole() );
	}
}