package src.main.java;
import src.main.java.maj_data.MAJData;
import src.main.java.search_data.SearchData;


public class Main {

    public static void main(String[] args) {
        SearchData searchData = new SearchData();
        MAJData majData = new MAJData();
        System.out.println("Hello World ! : " + searchData.toString() + " / " + majData.toString());
    }

}
