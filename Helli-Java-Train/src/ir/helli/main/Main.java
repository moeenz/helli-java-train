package ir.helli.main;

import ir.helli.school.Dean;
import ir.helli.school.Person;
import ir.helli.school.Student;

/**
 * git repos [at] https://github.com/moeenz/helli-java-train
 * @author moeenz
 *
 */
public class Main
{
	public static void main( String args[] )
	{	
		Dean d = new Dean("ali", 2, 10, 40, 100000);
		d.printInfo();
		
		Person p = new Student("hasan", 3, null, 5, null);
		p.printInfo();
	}
}