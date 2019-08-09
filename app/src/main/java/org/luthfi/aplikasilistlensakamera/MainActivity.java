package org.luthfi.aplikasilistlensakamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLensa;
    private ArrayList<Lensa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvLensa = findViewById(R.id.rv_lensa);
        rvLensa.setHasFixedSize(true);

        list.addAll(LensaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvLensa.setLayoutManager(new LinearLayoutManager(this));
        ListLensaAdapter listHeroAdapter = new ListLensaAdapter(list);
        rvLensa.setAdapter(listHeroAdapter);
    }

    private void showRecylerCardView(){
        rvLensa.setLayoutManager(new LinearLayoutManager(this));
        CardViewLensaAdapter cardViewLensaAdapter = new CardViewLensaAdapter(list);
        rvLensa.setAdapter(cardViewLensaAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_cardview:
                showRecylerCardView();
                break;
        }
    }
}