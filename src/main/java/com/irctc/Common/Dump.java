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
		canConstruct("hel","heee");
	}
	
	 public boolean canConstruct(String ransomNote, String magazine) {
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		 char[] charArr = ransomNote.toCharArray();
		 for(char c : charArr) {
			 Integer a = map.get((int)c);
			 if(a!=null) {
				 map.put(c, a++);
				 continue;
			 }
			 map.put(c, 1);
		 }
		 System.out.println("Map beforee: "+map);
		 for(char c: magazine.toCharArray()) {
			 map.computeIfPresent(c, (key,value) -> value-11);
		 }
		 System.out.println("Map afterr : "+map);
		 return false;
	 }
	 
	 public static void main(String[] args) {
		 Dump d = new Dump();
		 d.start();
	 }
}
