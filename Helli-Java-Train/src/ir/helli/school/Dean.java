package ir.helli.school;

import ir.helli.enums.Roles;
import ir.helli.interfaces.Payable;

public class Dean extends Person implements Payable
{
	public int background;
	private int workHours;
	private int salary;
	
	/* public default constructor for class Dean */
	public Dean()
	{
		setName(null);
		setId(0);
		setBackground(0);
		setWorkHours(0);
		setSalary(0);
		
		setRole(Roles.Dean);
	}
	
	/* public parameterized constructor for class Dean */
	public Dean(String name, int id, int background, int workHours, int salary)
	{
		setName(name);
		setId(id);
		setBackground(background);
		setWorkHours(workHours);
		setSalary(salary);
		
		setRole(Roles.Dean);
	}
	
	public void startWork()
	{
		prepareOffice();	// calling function prepareOffice() on Dean...
		checkAppointments();	// calling function checkAppointments() on Dean...
		restOfWork();	// calling function restOfWork() on Dean...
	}
	
	private void prepareOffice()
	{
		// here Dean does preparing the office...
	}
	
	private void checkAppointments()
	{
		// here Dean does check the appointments for the day...
	}
	
	private void restOfWork()
	{
		// here all of the works remaining for the rest of the day...
	}
	
	private int calculateSalary()
	{
		// performs some kind of calculations of workHours depending on Dean base salary...
		
		return 0;	// 0 is just for example...
	}

	/* [start] getters/setters for class Dean */
	public int getBackground()
	{
		return background;
	}

	public void setBackground(int background)
	{
		this.background = background;
	}

	public int getWorkHours()
	{
		return workHours;
	}

	public void setWorkHours(int workHours)
	{
		this.workHours = workHours;
	}
	
	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	/* [end] getters/setters for class Dean */

	/* overriden method from class Person */
	@Override
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Background is: " + getBackground() + ", Salary is: " + getSalary() +
					", Work Hours is: " + getWorkHours() );
	}
	
	@Override
	public int getPaycheck()
	{
		int deanSalary = calculateSalary();
		
		return deanSalary;
	}
}
