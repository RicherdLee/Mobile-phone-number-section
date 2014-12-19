package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone156Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone156Map Phone156Map = new Phone156Map();
	
	static{
		Phone156SectionMap.get0SectionMap(sectionMap);
		Phone156SectionMap.get1SectionMap(sectionMap);
	}

	private Phone156Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone156Map getInstance(){
		return Phone156Map;
	} 
}
