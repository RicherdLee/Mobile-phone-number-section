package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone150Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone150Map Phone150Map = new Phone150Map();
	
	static{
		Phone150SectionMap.get0SectionMap(sectionMap);
		Phone150SectionMap.get1SectionMap(sectionMap);
	}

	private Phone150Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone150Map getInstance(){
		return Phone150Map;
	} 
}
