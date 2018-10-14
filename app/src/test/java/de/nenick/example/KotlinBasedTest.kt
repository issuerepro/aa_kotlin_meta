package de.nenick.example

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotlinBasedTest {

    @Test
    fun androidAnnotations() {
        val activity = MainActivity_()
        activity.setContentView(null)
        // stacktrace has no info about our activity
    }

    @Test
    fun androidAnnotationsCompile() {
        val activity = MainActivity_()
        // following line does not compile
       activity.onViewChanged(null)
    }
}
