package data.user.loadimage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

public class UserListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<User> userItems;
    ImageLoader imageLoader = App.getInstance().getImageLoader();

    public UserListAdapter(Activity activity, List<User> userItems) {
        this.activity = activity;
        this.userItems = userItems;
    }

    @Override
    public int getCount() {
        return userItems.size();
    }

    @Override
    public Object getItem(int location) {
        return userItems.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.row, null);

        if (imageLoader == null)
            imageLoader = App.getInstance().getImageLoader();
        NetworkImageView img = (NetworkImageView) convertView
                .findViewById(R.id.img);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView phone = (TextView) convertView.findViewById(R.id.phone);

        User m = userItems.get(position);

        img.setImageUrl(m.getPictureUrl(), imageLoader);

        name.setText(m.getName());

        phone.setText(m.getPhone());


        return convertView;
    }

}
