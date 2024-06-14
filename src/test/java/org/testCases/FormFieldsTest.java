package org.testCases;

import org.testng.annotations.Test;

public class FormFieldsTest extends BaseTest{


    @Test
    public void testFormFields(){
        home.visitFormFieldsPage();
        forms.enterName();
        forms.selectFavoriteDrink();
        forms.selectFavoriteColor();
        forms.selectSiblings();
        forms.enterEmail();
        forms.enterMessage();
        forms.clickSubmit();
    }
}
