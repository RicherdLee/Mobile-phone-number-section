package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone139Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone139Map Phone139Map = new Phone139Map();
	
	static{
		Phone139SectionMap.get0SectionMap(sectionMap);
		Phone139SectionMap.get1SectionMap(sectionMap);
	}

	private Phone139Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone139Map getInstance(){
		return Phone139Map;
	} 
}
