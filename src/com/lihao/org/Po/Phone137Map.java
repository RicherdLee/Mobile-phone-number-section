package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone137Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone137Map Phone137Map = new Phone137Map();
	
	static{
		Phone137SectionMap.get0SectionMap(sectionMap);
		Phone137SectionMap.get1SectionMap(sectionMap);
	}

	private Phone137Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone137Map getInstance(){
		return Phone137Map;
	} 
}
