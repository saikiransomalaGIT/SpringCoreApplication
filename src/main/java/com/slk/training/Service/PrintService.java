package com.slk.training.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.bean.StudentInfo;
import com.slk.training.printer.MessagePrinter;

public class PrintService {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessagePrinter msgPrinter = applicationContext.getBean("messagePrinter", MessagePrinter.class);
		StudentInfo sInfo = applicationContext.getBean("studentInfo", StudentInfo.class);
		msgPrinter.printMessage(sInfo);
		
	}

}
