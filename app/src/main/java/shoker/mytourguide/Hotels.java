package shoker.mytourguide;

import android.content.res.TypedArray;

import com.shoker.mytourguidee.R;

public class Hotels extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public Hotels() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String [] names = getResources().getStringArray(R.array.hotels_names);
        String [] descriptions = getResources().getStringArray(R.array.hotels_descriptions);
        String [] phones = getResources().getStringArray(R.array.hotels_numbers);
        String [] address = getResources().getStringArray(R.array.hotels_addresses);
        String [] scedules =getResources().getStringArray(R.array.hotels_hours);
        String [] url = getResources().getStringArray(R.array.hotels_url);
        String [] mapBookmarks = getResources().getStringArray(R.array.hotels_map_bookmarks);
        TypedArray images = getResources().obtainTypedArray(R.array.hotels_images);

        for (int i =0;i<names.length;i++){
            locationsList.add(new Location(names[i],address[i],descriptions[i],phones[i],scedules[i],url[i],mapBookmarks[i],images.getResourceId(i,0)));
        }
        images.recycle();
    }
}