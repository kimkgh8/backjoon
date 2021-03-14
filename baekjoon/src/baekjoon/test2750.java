package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test2750 {
 
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	
    	int arr[] = new int[N];
    	for (int i=0;i<N;i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(arr);
    	
    	StringBuilder sb = new StringBuilder();
    	for (int number:arr) {
    		sb.append(number).append("\n");
    	}
    	System.out.println(sb);
    	
    	
    }
}	