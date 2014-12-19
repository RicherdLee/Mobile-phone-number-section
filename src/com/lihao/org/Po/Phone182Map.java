package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone182Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone182Map Phone182Map = new Phone182Map();
	
	static{
		Phone182SectionMap.get0SectionMap(sectionMap);
		Phone182SectionMap.get1SectionMap(sectionMap);
	}

	private Phone182Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone182Map getInstance(){
		return Phone182Map;
	} 
}
