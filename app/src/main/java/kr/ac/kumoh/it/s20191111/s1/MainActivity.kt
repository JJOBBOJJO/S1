package kr.ac.kumoh.it.s20191111.s1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.it.s20191111.s1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            count++
            main.txtCount.text = "${count}"
        }
        main.btnSub.setOnClickListener {
            if (count > 0) {
                count--
                main.txtCount.text = "$count"
            }
        }
        main.btnReset.setOnClickListener {
            main.txtCount.text = "0"
        }
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}