package Collection;

public class Student implements Comparable<Student> {

	int studentId;
	String studentName;
	String qualification;

	public Student(int studentId, String studentName, String qualification) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = qualification;

	}

	@Override

	public String toString() {

		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", qualification=" + qualification
				+ "]";

	}

	@Override
	public int compareTo(Student o) {

		if (this.studentName.compareTo(o.studentName) > 0)
			return 1;
		else if (this.studentName.compareTo(o.studentName) < 0)
			return -1;
		else
			return 0;
		
	}

}

