package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone135Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone135Map Phone135Map = new Phone135Map();
	
	static{
		Phone135SectionMap.get0SectionMap(sectionMap);
		Phone135SectionMap.get1SectionMap(sectionMap);
	}

	private Phone135Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone135Map getInstance(){
		return Phone135Map;
	} 
}
