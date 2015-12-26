package igenius.natthapol.mytraffic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    // 2. Explicit -> Parameter declaration
    private ListView trafficListView;
    private Button aboutMeButton; // ctrl + shift + enter



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 3. Bind widget ->
        bindWidget();
        // Button controller
        buttonController();

    } // Main method -> the start up method

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sound effect
                // getBaseContext -> get file from resource internal memory
                // getApplication -> get file from disk
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.cow);
                buttonMediaPlayer.start();
            } // Event
        });
    } // buttonController

    private void bindWidget() {
        // R files (press R button) (Studio will read on name list in R file.) -> contains id name
        // Raw files -> contains pictures.
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);
    }


} // Main class
