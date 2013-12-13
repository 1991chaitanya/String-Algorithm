package com;
import java.util.*;

import org.apache.commons.lang.StringUtils;

public class RemoveSapce {
	public static void main(String[] args) {

		String testString = "Hello Hey You";
		
		System.out.println("String BEFORE removing whitespace "+ testString);

		System.out.println("--------------------------------------------------");
		
		String whithoutWhiteSpace = StringUtils.deleteWhitespace(testString);

		System.out.println("String AFTER removing whitespace " + whithoutWhiteSpace);
	}
}


/*-----------------------------
char c[] = 	s.toCharArray();
char a[]  = new char[c.length];
for(int i=0;i<c.length;i++) {
	if (c[i] == ' ') {
		continue;
	}
	a[i] = c[i];
}
String st = new String(a);
System.out.println(st);
 s.replaceAll("\\s+","");*/