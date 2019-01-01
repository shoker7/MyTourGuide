package shoker.mytourguide;

import android.content.res.TypedArray;

import com.shoker.mytourguidee.R;

public class CityMileStones extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public CityMileStones() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String [] names = getResources().getStringArray(R.array.city_milestones_names);
        String [] descriptions = getResources().getStringArray(R.array.city_milestones_descriptions);
        String [] phones = getResources().getStringArray(R.array.city_milestones_numbers);
        String [] address = getResources().getStringArray(R.array.city_milestones_addresses);
        String [] scedules =getResources().getStringArray(R.array.city_milestones_hours);
        String [] url = getResources().getStringArray(R.array.city_milestones_url);
        String [] mapBookmarks = getResources().getStringArray(R.array.city_milestones_map_bookmarks);
        TypedArray images = getResources().obtainTypedArray(R.array.city_milestones_images);

        for (int i =0;i<names.length;i++){
            locationsList.add(new Location(names[i],address[i],descriptions[i],phones[i],scedules[i],url[i],mapBookmarks[i],images.getResourceId(i,0)));
        }
        images.recycle();
    }
}