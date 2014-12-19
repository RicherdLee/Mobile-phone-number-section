package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone155Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone155Map Phone155Map = new Phone155Map();
	
	static{
		Phone155SectionMap.get0SectionMap(sectionMap);
		Phone155SectionMap.get1SectionMap(sectionMap);
	}

	private Phone155Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone155Map getInstance(){
		return Phone155Map;
	} 
}
