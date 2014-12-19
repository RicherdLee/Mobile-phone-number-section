package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone130Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone130Map Phone130Map = new Phone130Map();
	
	static{
		Phone130SectionMap.get0SectionMap(sectionMap);
		Phone130SectionMap.get1SectionMap(sectionMap);
	}

	private Phone130Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone130Map getInstance(){
		return Phone130Map;
	} 
}
