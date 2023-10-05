package com.joykeepsflowin.materialspeeddialsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joykeepsflowin.materialspeeddialsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.speedDialView.inflate(R.menu.file_list_speed_dial)
    }
}