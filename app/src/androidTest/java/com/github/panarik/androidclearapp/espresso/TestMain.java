package com.github.panarik.androidclearapp.espresso;


import com.github.panarik.androidclearapp.espresso.base.EspressoBase;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


public class TestMain extends EspressoBase {


    @Test
    public void testHelloWorldText() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

}
