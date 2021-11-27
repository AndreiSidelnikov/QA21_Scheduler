package com.telran.scheduler.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChooseCurrencyAndWageTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions () {
        app.getUser().register();
    }

    @Test
    public void chooseCurrencyAndWageTest() {
       app.getCurrency().chooseCurrency("Bahamian dollar");
       app.getWage().chooseWage("150");
    }
    // tapwizard_settings_currency_arrow
    // currency = android.widget.TextView Bahamian dollar
    // wizard_settings_wage_arrow
    // input = wage_dialog_input
    // ok = wage_dialog_ok_btn
    // next = wizard_settings_next
}
