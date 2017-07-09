package data.user.loadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.google.gson.Gson;

public class UserProfileActivity extends AppCompatActivity {

    TextView name_tv;
    TextView email_tv;
    TextView note_tv;
    TextView phone_tv;
    NetworkImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        name_tv = (TextView) findViewById(R.id.name);
        email_tv = (TextView) findViewById(R.id.email);
        note_tv = (TextView) findViewById(R.id.notes);
        phone_tv = (TextView) findViewById(R.id.phone);
        img = (NetworkImageView) findViewById(R.id.img);

        Bundle b = getIntent().getExtras();
        if(b!=null){
            String userGsonData = b.getString("userInfo");
            Gson g = new Gson();
            User u = g.fromJson(userGsonData,User.class);
            name_tv.setText(u.getName());
            email_tv.setText(u.getEmail());
            phone_tv.setText(u.getPhone());
            note_tv.setText(u.getNotes());
            img.setImageUrl(u.getPictureUrl(), App.getInstance().getImageLoader());
        }
    }
}
