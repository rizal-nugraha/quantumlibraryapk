package id.kotlin.quantumlibrary;

public class AboutRizalActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rizal_about);

        val button = findViewById<View>(R.id.button_about_rizal) as Button

        button.setOnClickListener {
            val i = Intent(this@AboutRizalActivity, AboutActivity::class.java)
            startActivity(i)
        }
    }
}