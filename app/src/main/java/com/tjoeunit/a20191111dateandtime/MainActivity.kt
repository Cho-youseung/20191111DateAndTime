package com.tjoeunit.a20191111dateandtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : BaseActivity() {

    var startDateTimeCalendar = Calendar
    var startDateBtn = 

    override fun setupEvents(){
        startDateBtn.setOnClickListener {


        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
