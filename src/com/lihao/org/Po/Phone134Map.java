package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone134Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone134Map Phone134Map = new Phone134Map();
	
	static{
		Phone134SectionMap.get0SectionMap(sectionMap);
		Phone134SectionMap.get1SectionMap(sectionMap);
	}

	private Phone134Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone134Map getInstance(){
		return Phone134Map;
	} 
}
