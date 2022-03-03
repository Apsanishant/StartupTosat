package sharma.gq.startuptosat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import sharma.gq.stratuptoast.toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast.startUpToast(this, "Hello");
    }
}