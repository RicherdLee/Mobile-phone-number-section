package com.lihao.org.Util;


import java.util.*;

import com.lihao.org.Po.Phone156SectionMap;
import com.lihao.org.Po.PhoneSectionMap;

/**
 * 手机号码分析
 * Created by haoli on 11/26/14.
 */
public class PhoneAnalyse {



    public static List<String> analysePhonenum(List<String> phoneList)  {
        Map<String,List<String>> phonesectionMap = new HashMap<String, List<String>>();
        //1.分析手机号
        //1.1判断手机号位数
        for( String phone : phoneList){
            if(phone.length() != 11){
                //不为手机号
            	return null;
            }else{
                //手机号前三位，确定哪里去匹配
                String phonesection3 = phone.substring(0,3);
                //手机前7位，确定归属地
                String phonesection7 = phone.substring(0,7);
                List<String> section3List = new ArrayList<String>();
                if(phonesectionMap.containsKey( phonesection3 )){
                    section3List =  phonesectionMap.get(phonesection3);
                    section3List.add(phone+':'+phonesection7);
                }else{
                    section3List.add(phone+':'+phonesection7);
                    phonesectionMap.put(phonesection3,section3List);
                }
            }
        }
        List<String> phoneInfoList = analysePhonesection(phonesectionMap);
        return phoneInfoList;
    }

    private static List<String> analysePhonesection(Map<String,List<String>> phonesectionMap)  {
        Set set = phonesectionMap.entrySet();
        Iterator i = set.iterator();
        List<String> phoneInfoList = new ArrayList<String>();
        while (i.hasNext()){
            @SuppressWarnings("unchecked")
			Map.Entry<String,List<String>> entry = (Map.Entry<String,List<String>>)i.next();
            //获取前三位号段，用于决定打开号码文件数据库
            String section3 = entry.getKey();
            List<String> phonesectionList = entry.getValue();
            List<String> phoneList = analysePhonesectionFromDB(section3,phonesectionList);
            phoneInfoList.addAll(phoneList);
        }
        return phoneInfoList;
    }

    private static List<String> analysePhonesectionFromDB(String section3,List<String> phonesectionList)  {
//    	PhoneSectionMap phoneSectionMap = PhoneSectionMap.getInstance();
//    	
//    	Map<String,String> sectionMap = phoneSectionMap.getSectionMap();
    	Map<String,String> sectionMap = PhoneSectionMap.getSectionMap(section3);
    	List<String> phonenumsectionList = new ArrayList<String>();
    	for(String phonesection : phonesectionList){
    		String[] phoneS = phonesection.split(":");
    		String phonesectionInfo = sectionMap.get(phoneS[1]);
    		String phoneInfoJson = String.format("{\"%s\" : { %s } }  ", phoneS[0],phonesectionInfo);
    		phonenumsectionList.add( phoneInfoJson );
    	}
    	return phonenumsectionList;
    }


}
