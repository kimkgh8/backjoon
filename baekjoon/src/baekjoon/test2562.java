package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2562 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int arr[] = new int[9];
    	int max = 0;
    	int index= 0;
    	int count = 0;
    	for (int i=0;i<9;i++) {
    		arr[i]=Integer.parseInt(br.readLine());
    	}
    	
    	for (int j=0;j<arr.length;j++) {
    		count ++;
    		if (arr[j]>max) {
    			max = arr[j];
    			index = count;
    		}
    	}
    	
    	System.out.println(max);
    	System.out.println(index);
    	
    }
}	