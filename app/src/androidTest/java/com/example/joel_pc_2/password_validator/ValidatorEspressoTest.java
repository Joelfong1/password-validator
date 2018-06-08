package com.example.joel_pc_2.password_validator;

/**
 * Created by Joel Fong on 2018-06-06
 */

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ValidatorEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void enterPassword() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("password"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void enterPasswordCase() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("PASSWOrd"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void checkPasswordLength() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("short123!"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void checkPasswordSpecialChars() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("NoChars1"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void checkPasswordDigits() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("DigitsWhere?"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void checkPasswordCases() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("nocaps1234!"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Not Strong!")));
    }

    @Test
    public void fullValidation() {
        Espresso.onView(withId(R.id.inputPass)).perform(typeText("passWord-1234!"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.validateButton)).perform(click());
        Espresso.onView(withId(R.id.validatePass)).check(matches(withText("Password is strong enough!")));
    }
}
