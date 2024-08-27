package com.example;

import com.example.entities.Laptop;
import com.example.entities.Student;
import com.example.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
		/*ApplicationContext context =
		StudentRepository studentRepository = context.getBean(StudentRepository.class);*/

		/*Student student1 = new Student();\

		5
		student1.setId(5);
		student1.setName("John");
		student1.setCity("Palasia");*/

		/*Laptop laptop = new Laptop();
		laptop.setLp_id(1);
		laptop.setLp_name("Dell");
		laptop.setLp_price(12000);
		laptop.setStudent(student1);

		student1.setLaptop(laptop);*/

		/*student1 ko save kara hai database me*/

		/*Student saved = studentRepository.save(student1);
		System.out.println(saved);
*/
		/*Student student2 = new Student();
		student2.setId(2);
		student2.setName("Kaju");
		student2.setCity("Mhow");*/


		/*List<Student> saved = List.of(student1, student2);
		for (Student finalresult : studentRepository.saveAll(saved)) {
			System.out.println(finalresult);
		}
*/

		/*student ko update karke  save kara hai database me*/

		/*Optional<Student> optional = studentRepository.findById(5);
		Student student = optional.get();
		student.setName("mohan");
		Student newstudent = studentRepository.save(student);
		System.out.println(newstudent);
		System.out.println("Done..");
*/
		/*sare student ko fetch kiya hai database se */
//	    Iterable<Student> itr = studentRepository.findAll();
		/*1.
		Iterator<Student> iterator = itr.iterator();
		while (iterator.hasNext()){
			Student next = iterator.next();
			System.out.println(next);
		}
		2.
		itr.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student student) {
				System.out.println(student);
			}
		});
		 3.
		itr.forEach(student -> System.out.print(student));
		 */

		/* student ka record ko delete karna hai database se */
//		studentRepository.deleteById(1);
//		System.out.println("Done..");
  	}

}
