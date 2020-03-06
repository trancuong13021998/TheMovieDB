package com.example.themoviedbapplication.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.themoviedbapplication.R;
import com.example.themoviedbapplication.adapter.MovieAdapter;
import com.example.themoviedbapplication.model.Movie;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {
    MovieAdapter movieAdapter;
    ArrayList<Movie> movieArrayList;
    RecyclerView recyclerView;
    public MovieFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_movie, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.rcl_list_movie);
        movieArrayList = new ArrayList<>();
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieArrayList.add(new Movie("1","A Rainy Day in New York (2019)"
                ,"https://image.tmdb.org/t/p/w185_and_h278_bestv2/uPGq1mkEXznUpapDmOSxbsybjfp.jpg"
                ,"120 phút","Two young people arrive in New York to spend a weekend, " +
                "but once they arrive they're met with bad weather and a series of adventures."));
        movieAdapter = new MovieAdapter(getActivity(),movieArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(movieAdapter);
        return view;
    }
}
