package com.org.Roman_to_Integer;
import java.util.HashMap;
public class Soluction {
	public int R_to_A(String s)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum = 0; // ×ÜºÍ
		int i = 0;
		while (i < s.length()) {
			int a = map.get(s.charAt(i));
			int b;
			if (i + 1 < s.length()) {
				b = map.get(s.charAt(i + 1));
			} else {
				b = 0;
			}
			if (a < b) {
				sum += b - a;
				i += 2;
			} else {
				sum += a;
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Soluction S=new Soluction();
		System.out.println(S.R_to_A("DCXXI"));
	}

}
