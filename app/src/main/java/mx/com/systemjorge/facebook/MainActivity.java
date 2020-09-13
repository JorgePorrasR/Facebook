package mx.com.systemjorge.facebook;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelFeed> modelFeedArrayList = new ArrayList<>();
    AdapterFeed adapterFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterFeed = new AdapterFeed(this, modelFeedArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();
    }

    public void populateRecyclerView() {

        ModelFeed modelFeed = new ModelFeed(1, 1005001, 29000, R.drawable.chicharito, R.drawable.mexicocampeon,
                "Javier Chicharito Hernadez", "2 horas", "Aqui ganando la copa del mundo xd.");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(2, 590, 17, R.drawable.songoku, 0,
                "Son Goku", "9 horas", "Hoy peleare por salvar la tierra (otra vez) \n" +
                "Krilin no mueras porfa xd.");
        modelFeedArrayList.add(modelFeed);
        modelFeed = new ModelFeed(3, 117, 5, R.drawable.io, R.drawable.minoviaxd,
                "Jorge Reyes", "9 horas", "Preciosa!!!");
        modelFeedArrayList.add(modelFeed);

        adapterFeed.notifyDataSetChanged();
    }
}