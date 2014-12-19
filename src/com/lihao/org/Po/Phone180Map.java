package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone180Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone180Map Phone180Map = new Phone180Map();
	
	static{
		Phone180SectionMap.get0SectionMap(sectionMap);
		Phone180SectionMap.get1SectionMap(sectionMap);
	}

	private Phone180Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone180Map getInstance(){
		return Phone180Map;
	} 
}
