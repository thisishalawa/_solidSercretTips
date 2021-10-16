package master.solid.secret_tips.intro


/*
#5 last :code Issue
class MainRepository(
    private val auth: FirebaseAuth,
    private val fileLogger: FileLogger // this class has a single responsibility
) { ... }
*
* -> we should depend on abstraction and not concretions
* private val auth: FirebaseAuth concrete implementation!
* it force us to use auth with firebaseAuth !
  solution ->
  interface Authenticator {}

  5# our MainRepository will authenticate someone
  it doesn't really care if that firebase or custom api call *


  helps us to inject @inject constructor!


* */
class MainRepository(
    private val auth: Authenticator,//private val auth: FirebaseAuth Issue #5
    private val fileLogger: FileLogger // this class has a single responsibility
) {

    /*
    * getting started!
    * Ready.Set!
    *
    *
    * */


    suspend fun loginUser(email: String, pass: String) {
        try {
            auth.signInWithEmailAndPassword(email, pass)
        } catch (ex: Exception) {
            fileLogger.logError(ex.toString())
        }
    }
}

/*

    1#
    What is Wrong !

    1# principle -> class must have one single responsibility!
    solution ->
    create a sep class that represent such an error logger !

    suspend fun loginUser(email: String, pass: String) {
        try {
            auth.signInWithEmailAndPassword(email, pass)
        } catch (ex: Exception) {
            !! !! !! !!
            val file = File("errors.txt")
            file.appendText(
                text = ex.message.toString()
            )
        }
    }



    */