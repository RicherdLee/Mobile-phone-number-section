package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class Phone186Map {
	private static final Map<String,String> sectionMap=new HashMap<>();
	private static Phone186Map Phone186Map = new Phone186Map();
	
	static{
		Phone186SectionMap.get0SectionMap(sectionMap);
		Phone186SectionMap.get1SectionMap(sectionMap);
	}

	private Phone186Map(){
	}
	
	public Map<String,String> getSectionMap(){
		return sectionMap;
	}
	
	public static Phone186Map getInstance(){
		return Phone186Map;
	} 
}
