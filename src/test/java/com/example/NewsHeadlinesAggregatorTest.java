package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class NewsHeadlinesAggregatorTest {

    @Test
    public void testGetHeadlines() {
        // Create an instance of the NewsHeadlinesAggregator
        NewsHeadlinesAggregator aggregator = new NewsHeadlinesAggregator();
        
        // Call the method to get headlines
        List<String> headlines = aggregator.getHeadlines();
        
        // Check if the list is not null and contains headlines
        assertNotNull(headlines);
        assertTrue(headlines.size() > 0);
    }
}
