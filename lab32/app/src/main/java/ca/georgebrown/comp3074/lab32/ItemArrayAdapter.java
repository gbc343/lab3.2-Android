package ca.georgebrown.comp3074.lab32;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemArrayAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final List<Item> values;
    private final int rowLayout;
    private final int textViewId;
    private final int smallTextId;
    private final int iconId;


    public ItemArrayAdapter(@NonNull Context context, int resource, int textViewResourceId, int smallTextResourceId, int iconResourceId,
                            @NonNull List<Item> objects) {
        super(context, resource, textViewResourceId, objects);

        this.context = context;
        this.values = objects;
        this.rowLayout = resource;
        this.textViewId = textViewResourceId;
        this.smallTextId = smallTextResourceId;
        this.iconId = iconResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(this.rowLayout, parent, false);

        TextView textView = rowView.findViewById(this.textViewId);
        textView.setText(this.values.get(position).getLargeText());

        TextView smallText = rowView.findViewById(this.smallTextId);

        smallText.setText(this.values.get(position).getSmallText());

        ImageView icon = rowView.findViewById(this.iconId);

        icon.setImageResource(this.values.get(position).getIconId());

        return rowView;
    }

}
