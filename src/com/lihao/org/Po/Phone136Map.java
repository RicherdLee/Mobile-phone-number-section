package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone136Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone136Map Phone136Map = new Phone136Map();
	
	static{
		Phone136SectionMap.get0SectionMap(sectionMap);
		Phone136SectionMap.get1SectionMap(sectionMap);
	}

	private Phone136Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone136Map getInstance(){
		return Phone136Map;
	} 
}
