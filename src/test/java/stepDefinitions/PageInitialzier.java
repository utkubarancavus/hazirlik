package stepDefinitions;

import pages.practicePage;
import pages.youtubewebpage;

public class PageInitialzier {

    public static youtubewebpage ywp;
    public static practicePage prapage;

    public static void initializePageObjects(){
ywp=new youtubewebpage();
prapage=new practicePage();

    }
}
