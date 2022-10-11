package kodlamaIO.data.access;

import kodlamaIO.entities.Course;

public class HibernateProductDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi.");

	}

}
