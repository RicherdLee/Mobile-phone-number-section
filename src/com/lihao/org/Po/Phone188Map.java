package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone188Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone188Map Phone188Map = new Phone188Map();
	
	static{
		Phone188SectionMap.get0SectionMap(sectionMap);
		Phone188SectionMap.get1SectionMap(sectionMap);
	}

	private Phone188Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone188Map getInstance(){
		return Phone188Map;
	} 
}
