package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2577 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int arr[] =  new int [10];
    	int sum = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()); 
    	
    	String str = String.valueOf(sum);
    	
    	for (int i=0;i<str.length();i++) {
    		arr[(str.charAt(i) - '0')]++;
    	}
    	
    	for (int v: arr) {
    		System.out.println(v);
    	}
    }
}	