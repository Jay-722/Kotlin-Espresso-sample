package net.pot8os.kotlintestsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import net.pot8os.kotlintestsample.R

class CalculatorPage {

    fun clickOne(): CalculatorPage {
        onView(withId(R.id.button_1)).perform(click())
        return this
    }

    fun clickTwo(): CalculatorPage {
        onView(withId(R.id.button_2)).perform(click())
        return this
    }

    fun clickPlus(): CalculatorPage {
        onView(withId(R.id.button_sum)).perform(click())
        return this
    }

    fun clickAC(): CalculatorPage {
        onView(withId(R.id.button_all_clear)).perform(click())
        return this
    }

    fun clickCalc(): CalculatorPage {
        onView(withId(R.id.button_calc)).perform(click())
        return this
    }

    fun verifyDisplay(expected: String): CalculatorPage {
        onView(withId(R.id.field)).check(matches(withText(expected)))
        return this
    }

}