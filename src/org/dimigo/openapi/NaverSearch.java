package org.dimigo.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class NaverSearch {
    public static void main(String[] args) {
        String clientId = "feQnLzO_tkDPT75OTukf";
        String clientSecret = "ueJnIOL1K1";
        try {
            String text = URLEncoder.encode("어벤져스", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/movie.json?query="+ text; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            parseBook(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void parseBook(String json) throws IOException {
        Map map=new ObjectMapper().readValue(json, Map.class);
        List<Map<String,String>> list= (List) map.get("items");
        int i=0;
        for(Map<String,String> movie : list){
            String title=movie.get("title");
            String dircetor=movie.get("director");
            System.out.printf("%d. %s %s\n",++i,title,dircetor,title);
        }
    }
}
