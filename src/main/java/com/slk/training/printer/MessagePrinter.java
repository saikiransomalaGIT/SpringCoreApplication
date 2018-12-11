package com.slk.training.printer;

import com.slk.training.bean.StudentInfo;
import com.slk.training.writter.IMessageWritter;

public class MessagePrinter {
	
	private IMessageWritter msgWritter;
	
	public void printMessage(StudentInfo sInfo) {
		msgWritter.writeMessage(sInfo);
		
	}

	public void setMsgWritter(IMessageWritter msgWritter) {
		this.msgWritter = msgWritter;
	}
	

}
