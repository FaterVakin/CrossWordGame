package edu.ktu.crosswordgame;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private List<GridItem> items;
    int rowsCount;

    public GridAdapter(Context context, List<GridItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View root = layoutInflater.inflate(R.layout.itemdesign, parent, false);

        GridItem item = items.get(position);

        TextView titleText = (TextView) root.findViewById(R.id.title);

        titleText.setText(item.getCurrentLetter());

        if(item.getEmpty() == true)
        {
            root.setBackgroundColor(Color.BLACK);
        }

        return root;
    }
}