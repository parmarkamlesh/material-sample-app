package com.ijp.kamlesh.privacydot
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.access_log_item.view.*

class AccessLogRecycleViewAdapter(private val mList: List<AccessLogEntry>,private val context: Context)
    : RecyclerView.Adapter<AccessLogRecycleViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.access_log_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.timetv.text=mList[position].time
        holder.appNameTv.text=mList[position].appName
        holder.timeDurationTv.text=mList[position].duration

        holder.appLogoIv.setImageDrawable(context.getDrawable(mList[position].appLogo))
        holder.accessTypeDot.setImageDrawable(context.getDrawable(mList[position].dotType))

    }
    override fun getItemCount(): Int {
        return mList.size
    }
    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        var timetv=itemView.timeTv
        var appLogoIv=itemView.appLogoIv
        var appNameTv=itemView.appNameTv
        var accessTypeDot=itemView.accessTypeDot
        var timeDurationTv=itemView.timeDurationTv

    }
}