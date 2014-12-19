package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone133Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone133Map Phone133Map = new Phone133Map();
	
	static{
		Phone133SectionMap.get0SectionMap(sectionMap);
		Phone133SectionMap.get1SectionMap(sectionMap);
	}

	private Phone133Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone133Map getInstance(){
		return Phone133Map;
	} 
}
