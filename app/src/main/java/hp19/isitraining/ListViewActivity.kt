package hp19.isitraining

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedState: Bundle?) {
        super.onCreate(savedState)
        setContentView(R.layout.activity_image_list)

        val lv = findViewById<ListView>(R.id.list)
        lv.adapter = CustomAdapter(this)
    }
}