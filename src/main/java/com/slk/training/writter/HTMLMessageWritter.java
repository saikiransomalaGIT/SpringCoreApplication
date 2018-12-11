package com.slk.training.writter;

import com.slk.training.bean.StudentInfo;

public class HTMLMessageWritter implements IMessageWritter {

	@Override
	public void writeMessage(StudentInfo sInfo) {
		
	 System.out.println(" HTML Message Writter");
	/* System.out.println(" Student Name : " + sInfo.getsName());
	 System.out.println(" Student Branch : " + sInfo.getBranchName());
	 System.out.println(" Student Email : " + sInfo.getEmailId()); */
	 
	 System.out.println(sInfo.toString());
		
	}

}
