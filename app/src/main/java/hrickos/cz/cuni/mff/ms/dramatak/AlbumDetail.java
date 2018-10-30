package hrickos.cz.cuni.mff.ms.dramatak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlbumDetail extends AppCompatActivity {
    RecyclerView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);
        setUpRecyclerView();
    }

    void setUpRecyclerView(){
        //fill with sample data
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("01.", "Pieseň 1", "3:02"));
        songs.add(new Song("02.", "Pieseň 2", "3:02"));
        songs.add(new Song("03.", "Pieseň 3", "3:02"));
        songs.add(new Song("04.", "Pieseň 4", "3:02"));
        songs.add(new Song("05.", "Pieseň 5", "3:02"));
        songs.add(new Song("06.", "Pieseň 6", "3:02"));
        songs.add(new Song("07.", "Pieseň 7", "3:02"));
        songs.add(new Song("08.", "Pieseň 8", "3:02"));
        songs.add(new Song("09.", "Pieseň 9", "3:02"));
        songs.add(new Song("10.", "Pieseň 10", "3:02"));

        //build RecyclerView
        SongsAdapter adapter = new SongsAdapter(songs);
        songList = findViewById(R.id.songList);
        final RecyclerView.LayoutManager eventLayoutManager = new LinearLayoutManager(getApplicationContext());
        songList.setLayoutManager(eventLayoutManager);
        songList.setItemAnimator(new DefaultItemAnimator());
        songList.setAdapter(adapter);
    }
}

class Song {
    private String num;
    private String title;
    private String dur;

    Song(String num, String title, String dur){
        this.num = num;
        this.title = title;
        this.dur = dur;
    }

    public String getDur() {
        return dur;
    }

    public String getNum() {
        return num;
    }

    public String getTitle() {
        return title;
    }
}
