package org.testCases;

import org.testng.annotations.Test;

public class PopupTest extends BaseTest{
    @Test
    public void testAlert(){
        home.visitPopUpsPage();
        popUps.handleAlertPopup();
        popUps.handleConfirmPopup();
        popUps.handlePromptPopup();
    }
}
