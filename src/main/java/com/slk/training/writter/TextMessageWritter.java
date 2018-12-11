package com.slk.training.writter;

import com.slk.training.bean.StudentInfo;

public class TextMessageWritter implements IMessageWritter {

	@Override
	public void writeMessage(StudentInfo sInfo) {
		
		 System.out.println(" Text Message Writter");
		 /* System.out.println(" Student Name : " + sInfo.getsName());
		 System.out.println(" Student Branch : " + sInfo.getBranchName());
		 System.out.println(" Student Email : " + sInfo.getEmailId()); */
		 System.out.println(sInfo.toString());
		}
}
