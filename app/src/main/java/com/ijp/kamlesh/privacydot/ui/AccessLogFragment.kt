package com.ijp.kamlesh.privacydot.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ijp.kamlesh.privacydot.AccessLogEntry
import kotlinx.android.synthetic.main.fragment_access_log.*
import androidx.recyclerview.widget.RecyclerView
import com.ijp.kamlesh.privacydot.AccessLogRecycleViewAdapter
import com.ijp.kamlesh.privacydot.R


class AccessLogFragment : Fragment() {
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_access_log, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gpsIco=android.R.drawable.ic_partial_secure
        val camIco=android.R.drawable.ic_menu_camera
        val micIco=android.R.drawable.stat_notify_missed_call

        val logItems= listOf<AccessLogEntry>(
            AccessLogEntry("10-10-2018 12:00:00",android.R.drawable.ic_menu_crop,"Dummy app",gpsIco,"00:00:02"),
            AccessLogEntry("10-10-2018 12:00:00",android.R.drawable.ic_menu_crop,"Dummy app 1",camIco,"00:00:02"),
            AccessLogEntry("10-10-2018 12:00:00",android.R.drawable.ic_menu_crop,"Dummy app 2",gpsIco,"00:00:02"),
            AccessLogEntry("10-10-2018 12:00:00",android.R.drawable.ic_menu_crop,"Dummy app 3",camIco,"00:00:02"),
            AccessLogEntry("10-10-2018 12:00:00",android.R.drawable.ic_menu_crop,"Dummy app 4",gpsIco,"00:00:02")
        )
        val recyclerView: RecyclerView = accessLogListView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        accessLogListView.adapter = AccessLogRecycleViewAdapter(logItems,requireContext())

    }
}