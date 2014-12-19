package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone159Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone159Map Phone159Map = new Phone159Map();
	
	static{
		Phone159SectionMap.get0SectionMap(sectionMap);
		Phone159SectionMap.get1SectionMap(sectionMap);
	}

	private Phone159Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone159Map getInstance(){
		return Phone159Map;
	} 
}
