package com.irctc.common;

import java.lang.reflect.Type;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class CommonUtils {
	public static Gson gson = new Gson();
	
	
	public static <T>String fromJson(T object) {
		try {
			return gson.toJson(object); 
		}catch (Exception e) {
			System.out.println("Exception while converting from  json : "+e);
			throw e;
		}
	}
	
	public static <T> T toJson(String jsonString, Type obj) {
		return gson.fromJson(jsonString, obj);
	}
}
