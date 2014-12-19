package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone153Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone153Map Phone153Map = new Phone153Map();
	
	static{
		Phone153SectionMap.get0SectionMap(sectionMap);
		Phone153SectionMap.get1SectionMap(sectionMap);
	}

	private Phone153Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone153Map getInstance(){
		return Phone153Map;
	} 
}
