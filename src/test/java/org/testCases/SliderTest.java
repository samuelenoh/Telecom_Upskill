package org.testCases;

import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void TestSliderFunctionality() {
        home.visitSliderPage();
        sliderPage.handleSlider();
    }
}
