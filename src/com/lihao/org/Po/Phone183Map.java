package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone183Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone183Map Phone183Map = new Phone183Map();
	
	static{
		Phone183SectionMap.get0SectionMap(sectionMap);
		Phone183SectionMap.get1SectionMap(sectionMap);
	}

	private Phone183Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone183Map getInstance(){
		return Phone183Map;
	} 
}
