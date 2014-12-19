package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone131Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone131Map Phone131Map = new Phone131Map();
	
	static{
		Phone131SectionMap.get0SectionMap(sectionMap);
		Phone131SectionMap.get1SectionMap(sectionMap);
	}

	private Phone131Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone131Map getInstance(){
		return Phone131Map;
	} 
}
