package com.example.displaymonths.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.displaymonths.R
import com.example.displaymonths.model.Months

class ItemAdapter (private val context: Context,
                   private val dataset: List<Months>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{ // Start ItemAdapter abstract class with 3 funs ->hava a ItemViewHolder class


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    } // end ItemViewHolder :in line on ItemAdapter class


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view:ItemViewHolder and return it on ****
        // view called a adapterLayout which is get from parent to list_item layout
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // item is a af(the type of list) datatype
        // the holder is will be show on the screen
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.stringResourceId) // stringResourceId is a constructor on af class
    }

    override fun getItemCount(): Int {
        return dataset.size // dataset is initializes on ItemAdapter(constructor:type)
    }

} // end class ItemAdapter