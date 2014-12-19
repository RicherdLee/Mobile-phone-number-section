package com.lihao.org.Po;

import java.util.HashMap;
import java.util.Map;

public class PhoneSectionMap {
	
	public static Map<String,String> getSectionMap( String section ){
		switch (section) {
		case "130":
			return Phone130Map.getInstance().getSectionMap();
		case "131":
			return Phone131Map.getInstance().getSectionMap();
		case "132":
			return Phone132Map.getInstance().getSectionMap();
		case "133":
			return Phone133Map.getInstance().getSectionMap();
		case "134":
			return Phone134Map.getInstance().getSectionMap();
		case "135":
			return Phone135Map.getInstance().getSectionMap();
		case "136":
			return Phone136Map.getInstance().getSectionMap();
		case "137":
			return Phone137Map.getInstance().getSectionMap();
		case "138":
			return Phone138Map.getInstance().getSectionMap();
		case "139":
			return Phone139Map.getInstance().getSectionMap();
		case "145":
			return Phone145Map.getInstance().getSectionMap();
		case "147":
			return Phone147Map.getInstance().getSectionMap();
		case "150":
			return Phone150Map.getInstance().getSectionMap();
		case "152":
			return Phone152Map.getInstance().getSectionMap();
		case "153":
			return Phone153Map.getInstance().getSectionMap();
		case "155":
			return Phone155Map.getInstance().getSectionMap();
		case "156":
			return Phone156Map.getInstance().getSectionMap();
		case "157":
			return Phone157Map.getInstance().getSectionMap();
		case "158":
			return Phone158Map.getInstance().getSectionMap();
		case "159":
			return Phone159Map.getInstance().getSectionMap();
		case "180":
			return Phone180Map.getInstance().getSectionMap();
		case "182":
			return Phone182Map.getInstance().getSectionMap();
		case "183":
			return Phone183Map.getInstance().getSectionMap();
		case "186":
			return Phone186Map.getInstance().getSectionMap();
		case "187":
			return Phone187Map.getInstance().getSectionMap();
		case "188":
			return Phone188Map.getInstance().getSectionMap();
		case "189":
			return Phone189Map.getInstance().getSectionMap();
		default:
			return null;
		}
	}
	
//	private static final Map<String,String> sectionMap=new HashMap<>();
//	private static PhoneSectionMap PhoneSecctionMap=new  PhoneSectionMap();
//	
//	static{
//		Phone130SectionMap.get0SectionMap(sectionMap);
//		Phone130SectionMap.get1SectionMap(sectionMap);
//		Phone131SectionMap.get0SectionMap(sectionMap);
//		Phone131SectionMap.get1SectionMap(sectionMap);
//		Phone132SectionMap.get0SectionMap(sectionMap);
//		Phone132SectionMap.get1SectionMap(sectionMap);
//		Phone133SectionMap.get0SectionMap(sectionMap);
//		Phone133SectionMap.get1SectionMap(sectionMap);
//		Phone134SectionMap.get0SectionMap(sectionMap);
//		Phone134SectionMap.get1SectionMap(sectionMap);
//		Phone135SectionMap.get0SectionMap(sectionMap);
//		Phone135SectionMap.get1SectionMap(sectionMap);
//		Phone136SectionMap.get0SectionMap(sectionMap);
//		Phone136SectionMap.get1SectionMap(sectionMap);
//		Phone137SectionMap.get0SectionMap(sectionMap);
//		Phone137SectionMap.get1SectionMap(sectionMap);
//		Phone138SectionMap.get0SectionMap(sectionMap);
//		Phone138SectionMap.get1SectionMap(sectionMap);
//		Phone139SectionMap.get0SectionMap(sectionMap);
//		Phone139SectionMap.get1SectionMap(sectionMap);
//		Phone145SectionMap.get0SectionMap(sectionMap);
//		Phone145SectionMap.get1SectionMap(sectionMap);
//		Phone147SectionMap.get0SectionMap(sectionMap);
//		Phone147SectionMap.get1SectionMap(sectionMap);
//		Phone150SectionMap.get0SectionMap(sectionMap);
//		Phone150SectionMap.get1SectionMap(sectionMap);
//		Phone152SectionMap.get0SectionMap(sectionMap);
//		Phone152SectionMap.get1SectionMap(sectionMap);
//		Phone153SectionMap.get0SectionMap(sectionMap);
//		Phone153SectionMap.get1SectionMap(sectionMap);
//		Phone155SectionMap.get0SectionMap(sectionMap);
//		Phone155SectionMap.get1SectionMap(sectionMap);
//		Phone156SectionMap.get0SectionMap(sectionMap);
//		Phone156SectionMap.get1SectionMap(sectionMap);
//		Phone157SectionMap.get0SectionMap(sectionMap);
//		Phone157SectionMap.get1SectionMap(sectionMap);
//		Phone158SectionMap.get0SectionMap(sectionMap);
//		Phone158SectionMap.get1SectionMap(sectionMap);
//		Phone159SectionMap.get0SectionMap(sectionMap);
//		Phone159SectionMap.get1SectionMap(sectionMap);
//		Phone180SectionMap.get0SectionMap(sectionMap);
//		Phone180SectionMap.get1SectionMap(sectionMap);
//		Phone182SectionMap.get0SectionMap(sectionMap);
//		Phone182SectionMap.get1SectionMap(sectionMap);
//		Phone183SectionMap.get0SectionMap(sectionMap);
//		Phone183SectionMap.get1SectionMap(sectionMap);
//		Phone186SectionMap.get0SectionMap(sectionMap);
//		Phone186SectionMap.get1SectionMap(sectionMap);
//		Phone187SectionMap.get0SectionMap(sectionMap);
//		Phone187SectionMap.get1SectionMap(sectionMap);
//		Phone188SectionMap.get0SectionMap(sectionMap);
//		Phone188SectionMap.get1SectionMap(sectionMap);
//		Phone189SectionMap.get0SectionMap(sectionMap);
//		Phone189SectionMap.get1SectionMap(sectionMap);
//	}
//	
//	private PhoneSectionMap(){
//		
//	}
//	
//	public Map<String,String> getSectionMap(){
//		return sectionMap;
//	}
//	
//	public static PhoneSectionMap getInstance(){
//		return PhoneSecctionMap;
//	}
//	
	
}
