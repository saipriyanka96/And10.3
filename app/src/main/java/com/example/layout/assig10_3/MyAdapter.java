package com.example.layout.assig10_3;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 15-12-2017.
 */

public class MyAdapter extends ArrayAdapter<String> {
   String[] values;
   //Sequence of characters
   Context context;
   //Context:Interface to global information about an application environment
    public MyAdapter(@NonNull Context context, int resource, @NonNull String[] objects) {
        //@NonNull:Denotes that a parameter, field or method return value can never be null.
        super(context, resource, objects);
        //super keyword:The super keyword is a reference variable which is used to refer immediate parent class object
        this.values=objects;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a View that displays the data at the specified position in the data set. You can either create a View manually or inflate it from an XML layout file. When the View is inflated, the parent View (GridView, ListView...) will apply default layout parameters unless you use inflate(int, android.view.ViewGroup, boolean) to specify a root view and to prevent attachment to the root.

        //Parameters
      //  position	int: The position of the item within the adapter's data set of the item whose view we want.
       // convertView	View: The old view to reuse, if possible. Note: You should check that this view is non-null and of an appropriate type before using. If it is not possible to convert this view to display the correct data, this method can create a new view. Heterogeneous lists can specify their number of view types, so that this View is always of the right type (see getViewTypeCount() and getItemViewType(int)).
       // parent	ViewGroup: The parent that this view will eventually be attached to

                ViewHolder viewHolder = new ViewHolder();
//A ViewHolder object stores each of the component views inside the tag field of the Layout, so you can immediately access them without the need to look them up repeatedly.
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        //Obtains the LayoutInflater from the given context.
         viewHolder.textView = (TextView)view.findViewById(R.id.textView);
         //view holds the textview and imageview hab=ving the objects
         viewHolder.imageView = (ImageView)view.findViewById(R.id.icon);
         int[] images={R.drawable.ab,R.drawable.abc};
         //here it holds the images which are in drawable folders
       viewHolder.textView.setText(values[position]);
        viewHolder.imageView.setImageResource(images[position]);
        //Sets a drawable as the content of this ImageView.
        //resId	int: the resource identifier of the drawable
        return view;
        //Returns
       // View	A View corresponding to the data at the specified position.

    }

    class ViewHolder{
        TextView textView;
        ImageView imageView;
    }
}
