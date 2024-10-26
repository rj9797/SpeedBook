package com.irctc.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

public class Dump {
	
	
	public void start() {
		System.out.println('z'-1);
		System.out.println("Construction "+canConstruct("aaaaa","aaaaasde"));
	}
	
	 public boolean canConstruct(String ransomNote, String magazine) {
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		 char[] charArr = ransomNote.toCharArray();
		 int y = 1;
		 Integer z = 1;
		 for(char c : charArr) {
			 Integer a = map.get(c);
			 System.out.println("A: "+a);
			 if(a!=null) {
				 a++;
				 map.put(c, a);
				 continue;
			 }
			 map.put(c, 1);
		 }
		 System.out.println("Map beforee: "+map);
		 for(char c: magazine.toCharArray()) {
			 map.computeIfPresent(c, (key,value) -> value-1);
		 }
		 System.out.println("Map afterr : "+map);
		 return map.values().stream().noneMatch(x->x > 0);
	 }
	 
	 public static void main(String[] args) {
		 Dump d = new Dump();
		 d.start();
	 }
}
