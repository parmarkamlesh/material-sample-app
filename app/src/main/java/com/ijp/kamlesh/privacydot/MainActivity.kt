package com.ijp.kamlesh.privacydot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.ijp.kamlesh.privacydot.vpager2.ViewPager2Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vpager2:ViewPager2=viewpager
        val vpAdapter=ViewPager2Adapter(this)
        vpager2.adapter=vpAdapter
        supportActionBar?.hide()
        TabLayoutMediator(tabs, viewpager) { tab, position ->{}}.attach()
        tabs.getTabAt(0)?.setIcon(android.R.drawable.ic_dialog_info)
        tabs.getTabAt(1)?.setIcon(android.R.drawable.ic_menu_preferences)
        tabs.getTabAt(2)?.setIcon(android.R.drawable.ic_menu_view)
    }
}