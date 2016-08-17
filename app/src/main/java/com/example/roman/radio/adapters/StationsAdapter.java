package com.example.roman.radio.adapters;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roman.radio.R;
import com.example.roman.radio.activities.MainActivity;
import com.example.roman.radio.holders.StationViewHolder;
import com.example.roman.radio.model.Station;

import java.util.ArrayList;

/**
 * Created by Roman on 8/15/16.
 */
public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder>
{
    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations)
    {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position)
    {
        final Station station = stations.get(position);
        holder.updateUI(station);

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // Load the details
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return stations.size();
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }
}
