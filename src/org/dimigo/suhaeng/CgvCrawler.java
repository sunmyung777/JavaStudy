package org.dimigo.suhaeng;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class CgvCrawler {
    public String areacode;
    public String theathercode;
    public String date;
    public List<String> name;
    public List<String> time;

    public CgvCrawler(String areacode, String theathercode, String date) {
        this.areacode = areacode;
        this.theathercode = theathercode;
        this.date = date;
    }
    public void Crawling(){
        String url="http://www.cgv.co.kr/common/showtimes/iframeTheater.aspx?areacode="+this.areacode+"&theaterCode="+this.theathercode+"&date="+date;
        try {
            Document doc = Jsoup.connect(url).get();
            Elements item=doc.select("a[target=_parent] strong");
            System.out.println(item);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
