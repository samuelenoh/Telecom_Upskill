package org.testCases;

import org.testng.annotations.Test;

public class ModalTest extends BaseTest{

    @Test
    public void testSimpleModal(){
        home.visitModalsPage();
        modal.clickSimpleModal();
        modal.checkSimpleModalContent();
        modal.closeSimpleModal();
    }
    @Test()
    public void testFormFields(){
        modal.fillForm();
    }

}
