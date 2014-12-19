package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone157Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone157Map Phone157Map = new Phone157Map();
	
	static{
		Phone157SectionMap.get0SectionMap(sectionMap);
		Phone157SectionMap.get1SectionMap(sectionMap);
	}

	private Phone157Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone157Map getInstance(){
		return Phone157Map;
	} 
}
