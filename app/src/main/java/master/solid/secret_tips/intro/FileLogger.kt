package master.solid.secret_tips.intro

import java.io.File

open class FileLogger {


    // open ! so i can inherit!
    open fun logError(error: String) {
        val file = File("errors.txt")
        file.appendText(
            text = error
        )
    }
}


/*
* #2 -> O -> Open / Closed Principles
* Object and entities should open be opened from extensions
* (open class customErrorFileLogger)
* But Closed But Closed from modification
* */

/*
* #3 -> Liskov Substitution Principle
* parent class should be replaceable by their subclass
* that with out altering behavior
* so we override the behavior of the parent function :
* override fun logError(error: String) that this function
* will be used instead
*
*
* */


class CustomErrorFileLogger : FileLogger() {
    override fun logError(error: String) {
        // super.logError(error)
        val file = File("custom_errors.txt")
        file.appendText(
            text = error
        )
    }
}