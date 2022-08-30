package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LenghtOf_Nonrepeat_Substring {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Character> ca=new ArrayList<Character>();
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
				if(!ca.contains(c)) {
					ca.add(c);
				}
		}
		
		System.out.println("The length of the longest substring without repeating characters is : "+ca.size());
	}
}
