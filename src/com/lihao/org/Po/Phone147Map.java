package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone147Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone147Map Phone147Map = new Phone147Map();
	
	static{
		Phone147SectionMap.get0SectionMap(sectionMap);
		Phone147SectionMap.get1SectionMap(sectionMap);
	}

	private Phone147Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone147Map getInstance(){
		return Phone147Map;
	} 
}
