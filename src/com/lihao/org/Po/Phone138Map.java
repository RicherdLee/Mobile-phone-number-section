package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone138Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone138Map Phone138Map = new Phone138Map();
	
	static{
		Phone138SectionMap.get0SectionMap(sectionMap);
		Phone138SectionMap.get1SectionMap(sectionMap);
	}

	private Phone138Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone138Map getInstance(){
		return Phone138Map;
	} 
}
