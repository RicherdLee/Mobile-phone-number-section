package test;

import com.lihao.org.Util.PhoneAnalyse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haoli on 11/26/14.
 */
public class Test {
    public static void main(String[] args) throws IOException {
    	 List<String> phoneList = new ArrayList<String>();
         phoneList.add("13466641530");
         phoneList.add("18201572118");
         phoneList.add("18601991067");
         phoneList.add("13552317505");
         long start = System.currentTimeMillis() ;
         List<String> phoneInfoList = PhoneAnalyse.analysePhonenum(phoneList);
         long end = System.currentTimeMillis() ;
         System.out.println( end - start );
         for(String phoneinfo : phoneInfoList){
        	 System.out.println( phoneinfo );
         }
	}
}
