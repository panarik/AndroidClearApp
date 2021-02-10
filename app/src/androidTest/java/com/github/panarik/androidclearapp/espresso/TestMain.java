package com.github.panarik.androidclearapp.espresso;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.github.panarik.androidclearapp.MainActivity;
import com.github.panarik.androidclearapp.espresso.main.EspressoMain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


public class TestMain extends EspressoMain {


    @Test
    public void testHelloWorldText(){
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

}
