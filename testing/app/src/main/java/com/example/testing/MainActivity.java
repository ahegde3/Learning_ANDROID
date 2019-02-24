package example.com.testing;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.testing.R;

//import example.com.R;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}