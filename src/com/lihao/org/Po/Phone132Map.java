package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone132Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone132Map Phone132Map = new Phone132Map();
	
	static{
		Phone132SectionMap.get0SectionMap(sectionMap);
		Phone132SectionMap.get1SectionMap(sectionMap);
	}

	private Phone132Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone132Map getInstance(){
		return Phone132Map;
	} 
}
