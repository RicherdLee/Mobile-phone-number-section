package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone189Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone189Map Phone189Map = new Phone189Map();
	
	static{
		Phone189SectionMap.get0SectionMap(sectionMap);
		Phone189SectionMap.get1SectionMap(sectionMap);
	}

	private Phone189Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone189Map getInstance(){
		return Phone189Map;
	} 
}
