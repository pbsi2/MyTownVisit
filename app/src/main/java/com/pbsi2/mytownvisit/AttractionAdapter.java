package com.pbsi2.mytownvisit;



import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link Attraction} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param Attractions is the list of {@link Attraction}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
public AttractionAdapter(Context context, ArrayList<Attraction> Attractions, int colorResourceId){
        super(context,0,Attractions);
        mColorResourceId=colorResourceId;
        }

@Override
public View getView(int position,View convertView,ViewGroup parent){
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView=convertView;
        if(listItemView==null){
        listItemView=LayoutInflater.from(getContext()).inflate(
        R.layout.mytown_category,parent,false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView titleTextView=(TextView)listItemView.findViewById(R.id.title_view);
        // Get the Miwok translation from the currentAttraction object and set this text on
        // the Miwok TextView.
        titleTextView.setText(currentAttraction.getitemName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView addressTextView=(TextView)listItemView.findViewById(R.id.address_view);
        // Get the default translation from the currentAttraction object and set this text on
        // the default TextView.
        addressTextView.setText(currentAttraction.getitemAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView=(ImageView)listItemView.findViewById(R.id.picture_view);
        // Check if an image is provided for this Attraction or not
        if(currentAttraction.hasImage()){
        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(currentAttraction.getImageResourceId());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);
        }else{
        // Otherwise hide the ImageView (set visibility to GONE)
        imageView.setVisibility(View.GONE);
        }
// Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView descTextView=(TextView)listItemView.findViewById(R.id.desc_view);
        // Get the default translation from the currentAttraction object and set this text on
        // the default TextView.
        descTextView.setText(currentAttraction.getitemDescription());
        // Set the theme color for the list item
        View textContainer=listItemView.findViewById(R.id.container);
        // Find the color that the resource ID maps to
        int color=ContextCompat.getColor(getContext(),mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
        }
        }