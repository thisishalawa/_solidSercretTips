package master.solid.secret_tips.intro

import java.io.File

interface FileLoggerIn {

    //fun printLog() -> Issue
    fun printLogs() {
        /*
        * default behavior !
        *
        * */
    }

    fun logError(error: String) {
        val file = File("errors.txt")
        file.appendText(
            text = error
        )
    }


}

class CustomErrorFileLoggerIn : FileLoggerIn {

    /*
    * if we want to make fun printLogs() optional
    * we have to implement  override fun printLogs()
    * and keep it empty! that would be bad!
    *
    * 4- > Interface Segregation Principle
    * classes should not be forced to implement function of
    * interface actually that don't need
    *
    * so we will gave fun printLogs() default behavior and
    * then we don't need an implementation
    *
    * */

/*
    override fun printLogs() {

        if we don't need that!!
        so why we have to implement !
        solution -> fun printLogs() default behavior
    }
*/

    override fun logError(error: String) {
        val file = File("custom_errors.txt")
        file.appendText(
            text = error
        )
    }
}