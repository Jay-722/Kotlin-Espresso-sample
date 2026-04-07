package net.pot8os.kotlintestsample
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.pot8os.kotlintestsample.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ACButtonTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    // 情境 1：輸入數字後按 AC
    @Test
    fun testAC_afterTypingNumbers_clearsDisplay() {
        CalculatorPage()
                .clickOne()
                .clickTwo()
                .clickAC()
                .verifyDisplay("0")
    }

    // 情境 2：計算到一半按 AC
    @Test
    fun testAC_duringCalculation_clearsDisplay() {
        CalculatorPage()
                .clickOne()
                .clickPlus()
                .clickTwo()
                .clickAC()
                .verifyDisplay("0")
    }

    // 情境 3：看到結果後按 AC
    @Test
    fun testAC_afterResult_clearsDisplay() {
        CalculatorPage()
                .clickOne()
                .clickPlus()
                .clickTwo()
                .clickCalc()
                .clickAC()
                .verifyDisplay("0")
    }

    // 情境 4：剛開 App 就按 AC
    @Test
    fun testAC_onFreshStart_staysZero() {
        CalculatorPage()
                .clickAC()
                .verifyDisplay("0")
    }
}