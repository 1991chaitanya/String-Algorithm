package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class StringCount {

	public static void main(String[] args) throws IOException {
/*String st = "hello how are u";
//System.out.println(st.trim());

		StringTokenizer strt = new StringTokenizer(st,"");
		String result[]=new String[strt.countTokens()];
		while(strt.hasMoreTokens()) {
			//System.out.print(strt.nextToken());	
           
		}*/
		
		try {
			int i = 0;
			File file = new File("input.txt");
			System.out.println(file.exists());
			FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            BufferedReader br  = new BufferedReader(new InputStreamReader(dis));
            String str[] = null;
            //String s = null;
			int n=0,k=0;
			while(( br.readLine()) != null){
           
				n++;
            }
			//n--;
			System.out.println(n);
			
		str=new String[n+1];
			FileInputStream fis2 = new FileInputStream(file);
            DataInputStream dis2 = new DataInputStream(fis2);
            BufferedReader br2  = new BufferedReader(new InputStreamReader(dis2));
			
			while((str[i]= br2.readLine()) != null){
            	//str[i] = br.readLine();
            
				i++;
            }
			
			for (String sl : str) {
			System.out.println(sl);
			}
		
			//System.out.println(str);
			
			Map<Integer,String> m = new HashMap();
			
			for (int a=0;a<str.length;a++ ) {
				int count=1; 
				if(m.containsValue(str[a])) {
					continue;
				}
				for(int b=a+1;b<str.length;b++) {
					if(str[a].equals(str[b])){
						count++;
					}
								
				}
				System.out.println(str[a]);	
				m.put(count, str[a]);
			}
			
			System.out.println(m);
		
			Set<Integer> set = m.keySet(); 
		      Object array[] = set.toArray();
			
		      int max = (Integer)array[0];
		      
		     for(int x=1;x<array.length;x++) {
		    	Integer arr = (Integer)array[x];
		    	 if (arr.intValue() > max) {
		    		 max = arr;
		    	 }
		     }
			
		System.out.println("SO finally the string with max frequency in the file is"+m.get(max));
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
