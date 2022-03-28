package com.example.gb_mobile_settingactivity

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ActivityTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    @Test
    fun switchPreferenceCompat() {
        SwitchPage()
            .checkSwitchPreferenceCompatIsDisplayed()
    }

    @Test
    fun switchPreferenceCompat_2() {
        SwitchPage()
            .checkSwitchPreferenceCompat_2IsDisplayed()
    }

    @Test
    fun switchPageCompact() {
       SwitchPage()
           .checkSwitchPageCompactIsClickable()
        }
    }

