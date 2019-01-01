package shoker.mytourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.shoker.mytourguidee.R;

import java.util.ArrayList;


public abstract class CategoryAbstractFragment extends Fragment {

    protected ArrayList<Location> locationsList;

    /**
     * Overridden methods
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        locationsList = new ArrayList<>();
        populateLocationsList();

        ListView listView = rootView.findViewById(R.id.list);
        TextView tv =rootView.findViewById(R.id.tv_name);
        LocationAdapter adapter = new LocationAdapter(getActivity(), locationsList);
        listView.setAdapter(adapter);

       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });*/
        return rootView;
    }

    /**
     * Other methods
     */
    abstract void populateLocationsList();
}
