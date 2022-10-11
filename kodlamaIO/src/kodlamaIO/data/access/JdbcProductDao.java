package kodlamaIO.data.access;

import kodlamaIO.entities.Course;

public class JdbcProductDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanýna eklendi.");

	}

}
