package org.testCases;

import org.testng.annotations.Test;

public class CalendarTest extends BaseTest {

    @Test
    public void TestCalender(){
        home.visitCalenderPage();
        calendar.clickNext();
        calendar.selectDay();
    }

}
