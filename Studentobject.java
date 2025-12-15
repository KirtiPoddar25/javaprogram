package java2projects;

import java.util.ArrayList;

public class Studentobject {
	// TODO Auto-generated method stub
		
		    private String name;
		    private int id;
		    private int grade;
		    private ArrayList<String> courses;

		    // Constructor
		    public Studentobject(String name, int id, int grade) {
		        this.name = name;
		        this.id = id;
		        this.grade = grade;
		        this.courses = new ArrayList<>(); // Initialize courses as an empty list
		    }

		    // Getter methods
		    public String getName() {
		        return name;
		    }

		    public int getId() {
		        return id;
		    }

		    public int getGrade() {
		        return grade;
		    }

		    public ArrayList<String> getCourses() {
		        return courses;
		    }

		    // Methods to manage courses
		    public void addCourse(String course) {
		        courses.add(course);
		    }

		    public void removeCourse(String course) {
		        courses.remove(course);
		    }

		    // Method to print student details
		    public void printStudentDetails() {
		        System.out.println("Name: " + name);
		        System.out.println("ID: " + id);
		        System.out.println("Grade: " + grade);
		        System.out.println("Courses: " + courses);
		    }
		}

	


