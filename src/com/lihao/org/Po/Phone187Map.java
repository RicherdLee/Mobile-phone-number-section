package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone187Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone187Map Phone187Map = new Phone187Map();
	
	static{
		Phone187SectionMap.get0SectionMap(sectionMap);
		Phone187SectionMap.get1SectionMap(sectionMap);
	}

	private Phone187Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone187Map getInstance(){
		return Phone187Map;
	} 
}
