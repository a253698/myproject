package stepik;

public class Employee {

	class Employee {
		String name;
		String email;
		String experiece;
	}

	class Developer extends Employee {
		String mainLanguage;
		String Skills;

	}

	class DataAnalyst extends Employee {

	
	}

	String[] skills = { "git", "Scala", "JBoss", "UML" };
	Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

	String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
	DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
}
