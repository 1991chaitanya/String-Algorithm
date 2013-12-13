package com;

public class COnstructorTest {

	int a;
	static int b;
	public void method() {
		
	}
	static {
		System.out.println("staiac block");
	}
	{
		System.out.println("non static block");
	}
	
	public static void main(String[] args) {
		COnstructorTest c = new COnstructorTest();
		COnstructorTest c2 = new COnstructorTest();
		System.out.println(c.a);
		System.out.println(b);
	}
	
	
	
	public COnstructorTest() {
		System.out.println("constructor");
		}
		
}
