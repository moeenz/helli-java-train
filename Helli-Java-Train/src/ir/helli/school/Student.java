package ir.helli.school;

import ir.helli.enums.Roles;
import ir.helli.interfaces.Gradable;

public class Student extends Person implements Gradable
{
	private int[] grades;
	public int rank;
	public Teacher[] teachers;
	
	public Student()
	{
		setName(null);
		setId(0);
		setGrades(null);
		setRank(0);
		setTeachers(null);
		
		setRole(Roles.Student);
	}
	
	/* public parameterized constructor for class Student */
	public Student(String name, int id, int[] grades, int rank, Teacher[] teachers)
	{
		setName(name);
		setId(id);
		setGrades(grades);
		setRank(rank);
		setTeachers(teachers);
		
		setRole(Roles.Student);
	}
	
	public void goToClass()
	{
		learnAtClass();	// calling function learnAtClass() on Student...
		doHomeWork();	// calling function doHomeWork() on Student...
		takeExam();	// calling function takeExam() on Student...
	}
	
	private void learnAtClass()
	{
		// here the student goes to class and learns something...
	}
	
	private void doHomeWork()
	{
		// here the student does his/her homework...
	}
	
	private void takeExam()
	{
		// here the student takes exam...
	}
	
	private void gatherGrades()
	{
		// sets grades[] array for this student...
	}

	/* [start] getters/setters for class Student */
	private int[] getGrades()
	{
		return grades;
	}

	public void setGrades(int[] grades)
	{
		this.grades = grades;
	}

	public int getRank()
	{
		return rank;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}

	public Teacher[] getTeachers()
	{
		return teachers;
	}

	public void setTeachers(Teacher[] teachers)
	{
		this.teachers = teachers;
	}
	/* [end] getters/setters for class Student */

	@Override
	public int[] retrieveGrades()
	{
		gatherGrades();
		
		return getGrades();
	}
}
