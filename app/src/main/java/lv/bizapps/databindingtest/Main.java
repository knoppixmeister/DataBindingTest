package lv.bizapps.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import lv.bizapps.databindingtest.databinding.MainBinding;

public class Main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        MainBinding binding = DataBindingUtil.setContentView(this, R.layout.main);
        final User user = new User();
        binding.setUser(user);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("AAA", "ON_BTN_CLICK");

                user.setFirstName("d dsfsdfdsfds");
            }
        });
    }
}
