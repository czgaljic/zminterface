package com.nsxtreme.zm.api;

import com.nsxtreme.zm.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.annotation.DirtiesContext.MethodMode.BEFORE_METHOD;

/**
 * Created by chris on 4/26/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = Application.class,
        properties = ("spring.main.banner-mode=off"))
@ActiveProfiles("test")
public class ZmApiTest{
    @Autowired
    private ZmApi zmApi;

    @Test
    @DirtiesContext(methodMode = BEFORE_METHOD)
    public void test_getAllEventsURL(){
        assertEquals("http://surveil/zm/api/events.json", zmApi.getAllEventsURL());
    }

    @Test
    @DirtiesContext(methodMode = BEFORE_METHOD)
    public void test_getEventsDateRange(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime later = now.plus(1, ChronoUnit.DAYS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startString =now.format(formatter);
        String endString = later.format(formatter);
        assertEquals("http://surveil/zm/api/events/index/StartTime >=:"+startString+"/EndTime <=:"+endString+".json", zmApi.getEventsDateRange(now,later));
    }

}