package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone152Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone152Map Phone152Map = new Phone152Map();
	
	static{
		Phone152SectionMap.get0SectionMap(sectionMap);
		Phone152SectionMap.get1SectionMap(sectionMap);
	}

	private Phone152Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone152Map getInstance(){
		return Phone152Map;
	} 
}
