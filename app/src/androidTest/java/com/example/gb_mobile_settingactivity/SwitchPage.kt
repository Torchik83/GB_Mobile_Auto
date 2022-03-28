package com.example.gb_mobile_settingactivity

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matchers.not

class SwitchPage {

    fun checkSwitchPreferenceCompatIsDisplayed(): SwitchPage {
        Espresso.onView(ViewMatchers.withText("Sync email periodically"))
            .check(matches(ViewMatchers.isDisplayed()))
        return this
    }

    fun checkSwitchPreferenceCompat_2IsDisplayed(): SwitchPage {
        Espresso.onView(ViewMatchers.withText("Download incoming attachments"))
            .check(matches(
            ViewMatchers.isDisplayed()
        ))
        return this
    }

    fun checkSwitchPageCompactIsClickable(): SwitchPage {
        Espresso.onView(ViewMatchers.withText("Your signature"))
            .check(matches(not(ViewMatchers.isClickable())))
        return this
    }
}

