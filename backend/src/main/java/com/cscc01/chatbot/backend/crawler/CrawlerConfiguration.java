package com.cscc01.chatbot.backend.crawler;

import java.util.regex.Pattern;

public class CrawlerConfiguration {
    
    protected static final Pattern FILTERS = Pattern.compile(
        ".*(\\.(css|js|bmp|gif|jpe?g|png|tiff?|mid|mp2|mp3|mp4|wav|avi|mov|mpeg|ram|m4v|pdf" +
        "|rm|smil|wmv|swf|wma|zip|rar|gz))$");
    protected static final String STORAGE_FOLDER = "/tmp/crawler4j/";
    protected static final int POLITENESS_DELAY = 200;
    protected static final int MAX_DEPTH_CRAWLING = 1;
    protected static final int MAX_PAGES_FETCH = 2;
    protected static final boolean INCLUDE_BINARY_CONTENT = false;
    protected static final boolean RESUMABLE_CRAWLING = false;
    protected static final int NUMBER_OF_CRAWLERS = 8;
}