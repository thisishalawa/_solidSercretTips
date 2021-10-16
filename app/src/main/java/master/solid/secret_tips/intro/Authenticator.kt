package master.solid.secret_tips.intro

interface Authenticator {

    suspend fun signInWithEmailAndPassword(email: String, pass: String)

}

class FirebaseAuthenticator : Authenticator {

    override suspend fun signInWithEmailAndPassword(email: String, pass: String) {
        val auth: FirebaseAuth? = null
        auth?.let { signInWithEmailAndPassword(email, pass) }

    }
}
class CustomApiAuthenticator : Authenticator {

    override suspend fun signInWithEmailAndPassword(email: String, pass: String) {
        val auth: ApiAuth? = null
        auth?.let { signInWithEmailAndPassword(email, pass) }

    }
}