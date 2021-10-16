package master.solid.secret_tips.intro

import android.util.Log
import master.solid.secret_tips.TAG

class FirebaseAuth {


    fun signInWithEmailAndPassword(email: String, password: String) {
        Log.d(
            TAG, "FirebaseAuth signIn .. " +
                    "\n$email password:$password "
        )
    }


}