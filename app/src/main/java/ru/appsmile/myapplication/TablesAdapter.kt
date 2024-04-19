package ru.appsmile.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.appsmile.adapter.Tables

class TablesAdapter: RecyclerView.Adapter<TablesAdapter.PlanHolder> {

    class PlanHolder(item: View):RecyclerView.ViewHolder(item) {
        fun bind(tables: Tables){

        }
    }
}