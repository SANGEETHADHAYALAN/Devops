package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;

public class NewsHeadlinesAggregator {

    // Logger for logging messages
    private static final Logger logger = LoggerFactory.getLogger(NewsHeadlinesAggregator.class);

    // This method simulates fetching headlines
    public List<String> getHeadlines() {
        logger.info("Fetching news headlines...");
        return Arrays.asList(
                "Breaking News: Global Economy on the Rise",
                "Technology: New Smartphone Released",
                "Sports: Local Team Wins Championship",
                "Entertainment: New Movie Breaks Box Office Records",
                "Weather: Storm Alert for Coastal Areas"
        );
    }

    // This method prints the headlines
    public void displayHeadlines() {
        List<String> headlines = getHeadlines();
        logger.info("Displaying news headlines...");
        headlines.forEach(headline -> System.out.println(headline));
    }
}
