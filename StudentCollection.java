package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollection {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(124, "Keerthi", "BSc"));
		list.add(new Student(165, "Lahari", "Bcom"));
		list.add(new Student(144, "Harshini", "BE"));
		list.add(new Student(136, "Sowmya", "Btech"));

		Student s = new Student(183, "Manogna", "BCA");
		list.add(s);

		for (Student s1 : list) {

			System.out.println(s1);

		}

		Collections.sort(list);
		System.out.println("\nAftersorting according to Alphabatical Order:");
		for (Student s2 : list) {
			System.out.println(s2);

		}

	}

}