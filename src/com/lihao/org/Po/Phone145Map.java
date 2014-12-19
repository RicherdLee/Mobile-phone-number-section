package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone145Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone145Map Phone145Map = new Phone145Map();
	
	static{
		Phone145SectionMap.get0SectionMap(sectionMap);
		Phone145SectionMap.get1SectionMap(sectionMap);
	}

	private Phone145Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone145Map getInstance(){
		return Phone145Map;
	} 
}
