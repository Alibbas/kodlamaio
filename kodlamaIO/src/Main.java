import kodlamaIO.business.CourseManager;
import kodlamaIO.data.access.JdbcProductDao;
import kodlamaIO.entities.Course;
import kodlamaIO.logging.DatabaseLogger;
import kodlamaIO.logging.FileLogger;
import kodlamaIO.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course = new Course("Engin", "Software İntro", "Data Structed", 700, "data.jpg");
		Logger[] log = { new DatabaseLogger(), new FileLogger() };
		CourseManager courseManager = new CourseManager(new JdbcProductDao(), log);
		courseManager.add(course);

	}

}
