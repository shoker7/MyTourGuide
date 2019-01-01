package shoker.mytourguide;

import android.content.res.TypedArray;

import com.shoker.mytourguidee.R;

public class Restaurants extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public Restaurants() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String [] names = getResources().getStringArray(R.array.restaurants_names);
        String [] descriptions = getResources().getStringArray(R.array.restaurants_descriptions);
        String [] phones = getResources().getStringArray(R.array.restaurants_numbers);
        String [] address = getResources().getStringArray(R.array.restaurants_addresses);
        String [] scedules =getResources().getStringArray(R.array.restaurants_hours);
        String [] url = getResources().getStringArray(R.array.restaurants_url);
        String [] mapBookmarks = getResources().getStringArray(R.array.restaurants_map_bookmarks);
        TypedArray images = getResources().obtainTypedArray(R.array.restaurants_images);

        for (int i =0;i<names.length;i++){
            locationsList.add(new Location(names[i],address[i],descriptions[i],phones[i],scedules[i],url[i],mapBookmarks[i],images.getResourceId(i,0)));
        }
        images.recycle();
    }
}