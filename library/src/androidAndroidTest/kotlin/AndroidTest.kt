import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class AndroidTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun androidInstrumentedTest() {
        throw Exception("test from androidAndroidTest")
    }

}
