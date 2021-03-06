package ro.andreidobrescu.declarativeadapterkt

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class SimpleDeclarativeAdapter<MODEL>
(
    val viewCreator : (Context) -> (CellView<MODEL>)
) : BaseDeclarativeAdapter()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        val view=viewCreator(parent.context)

        view.layoutParams=RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT)

        return object : RecyclerView.ViewHolder(view) {}
    }
}
