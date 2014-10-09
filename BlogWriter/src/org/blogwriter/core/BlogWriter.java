package org.blogwriter.core;

import javax.swing.JFrame;

import com.github.rjeschke.txtmark.Processor;

public class BlogWriter extends JFrame{

	private static final long serialVersionUID = -5153080826068747470L;

	public static void main(String[] args) {
		new BlogWriter();
	}
	
	public BlogWriter(){
		String before = Processor.process("This is an [example link](http://example.com/).");
		System.out.println(before);
	}

}
