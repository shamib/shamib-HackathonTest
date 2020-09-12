package com.test;
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hackathon Test");
		new Application().testMethod();
	}
	
	public void testMethod () {
		String test = null;
		boolean flag = false;
		if (flag) {
			test = "one";
		}
		System.out.println("test is  : "+test.toLowerCase());
	}

}
