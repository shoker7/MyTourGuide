package shoker.mytourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.shoker.mytourguidee.R;


public class PagerAdapter extends FragmentPagerAdapter {

    private static final int NUMBER_OF_CATEGORIES = 4;
    private Context mContext;

    /**
     * Constructor
     */
    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    /**
     * Overridden Methods
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CityMileStones();
            case 1:
                return new Hotels();
            case 2:
                return new Restaurants();
            case 3:
                return new Shoping();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.historic_places_fragment_label);
            case 1:
                return mContext.getString(R.string.hotels_fragment_label);
            case 2:
                return mContext.getString(R.string.food_destinations_fragment_label);
            case 3:
                return mContext.getString(R.string.activities_and_events_fragment_label);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_CATEGORIES;
    }
}
