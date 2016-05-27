package com.twitter;

import java.util.List;

import com.cybozu.labs.langdetect.DetectorFactory;

import twitter4j.Status;

public class MainApp {
	
	
	
	public static String conkey="your twitter consumer key";
	public static String consec="your twitter consumer key";
	public static String tokkey="your twitter token key";
	public static String toksec="your twitter token key";
	public static List<String> twitterHandleList;
	public static List<String> thandleNames;
	public static List<Status> userTweets;
	public static String twitterHandle;
	
	public static void main(String[] args) throws Exception {
		DetectorFactory.loadProfile(System.getProperty("user.dir")+"/profiles/");
		Extract.intializeHandles();
		Extract.extractTwitterFeed(conkey,consec,tokkey,toksec);
		
	}

}
