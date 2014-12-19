package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone158Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone158Map Phone158Map = new Phone158Map();
	
	static{
		Phone158SectionMap.get0SectionMap(sectionMap);
		Phone158SectionMap.get1SectionMap(sectionMap);
	}

	private Phone158Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone158Map getInstance(){
		return Phone158Map;
	} 
}
