class Student{
	int roll;
	String name;
	double marks;
}

class Test{
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "Rohit";
		s1.marks = 87;

		Student s2 = new Student();
		s2.roll = 2;
		s2.name = "Rahul";
		s2.marks = 75;

		Student s3 = new Student();
		s3.roll = 3;
		s3.name = "Amit";
		s3.marks =67;

		Student students[]  = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for (Student stud : students){

			System.out.println(stud.name + " : "+stud.roll+" : "+stud.marks);
		}

	}
}