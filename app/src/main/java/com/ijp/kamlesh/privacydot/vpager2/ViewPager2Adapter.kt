package com.ijp.kamlesh.privacydot.vpager2
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ijp.kamlesh.privacydot.ui.AboutFragment
import com.ijp.kamlesh.privacydot.ui.AccessLogFragment
import com.ijp.kamlesh.privacydot.ui.SettingsFragment

class ViewPager2Adapter(fAct: FragmentActivity) : FragmentStateAdapter(fAct) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> AboutFragment()
            1-> SettingsFragment()
            2-> AccessLogFragment()
            else-> AboutFragment()
        }
    }

}