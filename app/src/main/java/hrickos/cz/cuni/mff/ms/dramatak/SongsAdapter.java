package hrickos.cz.cuni.mff.ms.dramatak;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Song> songs;

    public SongsAdapter(List<Song> songs){
        this.songs = songs;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent,false);
        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //set values of views in song_item based on the specific song
        final Holder classHolder = (Holder) holder;
        classHolder.songNumber.setText(songs.get(position).getNum());
        classHolder.songDuration.setText(songs.get(position).getDur());
        classHolder.songTitle.setText(songs.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }


    class Holder extends RecyclerView.ViewHolder{
        TextView songNumber;
        TextView songTitle;
        TextView songDuration;

        public Holder(View itemView) {
            super(itemView);
            //assign views to properties, so findViewById is called only once for each view
            songNumber = (TextView) itemView.findViewById(R.id.songNumber);
            songTitle = (TextView) itemView.findViewById(R.id.songTitle);
            songDuration = (TextView) itemView.findViewById(R.id.songDuration);
        }
    }
}