package com.chinadaas;

import com.chinadaas.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SourceReader {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Student stu = (Student) context.getBean("student");
		stu.introduce();
	}

}
