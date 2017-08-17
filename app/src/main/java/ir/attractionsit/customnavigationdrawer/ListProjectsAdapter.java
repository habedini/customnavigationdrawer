package ir.attractionsit.customnavigationdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by habed on 12/08/2017.
 */

public class ListProjectsAdapter extends BaseAdapter {
    private LayoutInflater minflator;
    private String[] mcaptions;
    private Integer[] mimages;


    public ListProjectsAdapter(Context context , String[] caption , Integer[] images) {
        minflator=LayoutInflater.from(context);
        mcaptions=caption;
        mimages=images;

    }

    @Override
    public int getCount() {
        return mcaptions.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view=minflator.inflate(R.layout.list_group, null);

        }else{
            view=convertView;
        }

        TextView textviewright= (TextView) view.findViewById(R.id.caption);
        ImageView imageViewright=(ImageView) view.findViewById(R.id.image);
        imageViewright.setImageResource(mimages[position]);
        textviewright.setText(mcaptions[position]);

        return view;
    }
}
