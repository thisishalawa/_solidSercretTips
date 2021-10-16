package master.solid.secret_tips.intro

import android.util.Log
import master.solid.secret_tips.TAG

class ApiAuth {


    fun signInWithEmailAndPassword(email: String, password: String) {
        Log.d(
            TAG, "ApiAuth signIn .. " +
                    "\n$email password:$password "
        )
    }


}