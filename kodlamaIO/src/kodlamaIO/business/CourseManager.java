package kodlamaIO.business;

import kodlamaIO.data.access.CourseDao;
import kodlamaIO.entities.Course;
import kodlamaIO.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] logger;

	public void add(Course course) throws Exception {
		Course[] courses = new Course[] {
				new Course("Engin Demiroð", "Software", "2022 Java Yazýlým Geliþtirici", 500, "java.jpg"),
				new Course("Ali Baþ", "Hardware", "Bilgisayar Donanýmý", 50, "donanim.jpg") };

		for (Course course1 : courses) {
			if (course1.getCategory() == course.getCategory()) {
				throw new Exception("Ayný isimli kategori girilemez");
			}
			if (course1.getTitle() == course.getTitle()) {
				throw new Exception("Ayný isimli kurs baþlýðý girilemez.");
			}
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatý 0'dan küçük olamaz.");
		}

		courseDao.add(course);
		for (Logger log : logger) {
			log.log("Log geldi.");
		}
	}

	public CourseManager(CourseDao courseDao, Logger[] logger) {
		this.courseDao = courseDao;
		this.logger = logger;

	}

}
