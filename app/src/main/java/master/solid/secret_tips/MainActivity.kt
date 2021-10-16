package master.solid.secret_tips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import master.solid.secret_tips.databinding.ActivityMainBinding

const val TAG = "_main_tag"
class MainActivity : AppCompatActivity() {

    // binding
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // setNavHost
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main)
                    as NavHostFragment
        navController = navHostFragment.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController)


    }
}

/*
*   SOLID Principles!
*   Practical explanation
*   MainRepository()
*
*   S -> Single Responsibility
*   O -> Open / Closed Principle
*   L -> Liskov Substitution Principle
*   I -> Interface Segregation Principle
*   D -> Dependency Inversion
*
* */
