package shoker.mytourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shoker.mytourguidee.R;

import java.util.List;


public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Location currentLocation = getItem(position);

        ImageView image = (ImageView) convertView.findViewById(R.id.iv_location);
        image.setImageResource(currentLocation.getImgResId());

        TextView nameTV = (TextView) convertView.findViewById(R.id.tv_name);
        nameTV.setText(currentLocation.getName());
        nameTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentLocation.getUrl()));
                getContext().startActivity(intent);
            }
        });

        TextView descriptionTV = (TextView) convertView.findViewById(R.id.tv_description);
        descriptionTV.setText(currentLocation.getDescription());

        TextView addressTV = (TextView) convertView.findViewById(R.id.tv_address);
        addressTV.setText(currentLocation.getAddress());
        addressTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentLocation.getMapBookmark()));
                intent.setPackage("com.google.android.apps.maps");
                getContext().startActivity(intent);
            }
        });

        TextView scheduleTV = (TextView) convertView.findViewById(R.id.tv_schedule);
        scheduleTV.setText(currentLocation.getSchedule());

        TextView phoneTV = (TextView) convertView.findViewById(R.id.tv_phone);
        phoneTV.setText(currentLocation.getPhone());
        phoneTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",currentLocation.getPhone(),null));
             getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
