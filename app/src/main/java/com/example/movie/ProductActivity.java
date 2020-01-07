package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity implements RecyclerViewAdapter.ProductViewHolder.OnListClickListener {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager m;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = findViewById(R.id.recyclerViewID);
        ArrayList<ProdectModel> list = new ArrayList<>();
        list.add(new ProdectModel("Into The Wild","2003","001",R.drawable.wild));
        list.add(new ProdectModel("Forest Gump","2001","05",R.drawable.forest));
        list.add(new ProdectModel("Terminal","1997","003",R.drawable.terminal));
        list.add(new ProdectModel("We are The Miller","2005","004",R.drawable.millers));
        list.add(new ProdectModel("300","2003","003",R.drawable.threehundred));
        list.add(new ProdectModel("Avatar","2009","009",R.drawable.avatar));
        list.add(new ProdectModel("Three Step Above Heaven","2010","007",R.drawable.heaven));
        list.add(new ProdectModel("500 Days of Summer","2002","008",R.drawable.daysofsummer));
        list.add(new ProdectModel("The Vow","2012","00",R.drawable.thevow));
        list.add(new ProdectModel("Into The Wild","2003","001",R.drawable.wild));
        list.add(new ProdectModel("Forest Gump","2001","05",R.drawable.forest));
        list.add(new ProdectModel("Terminal","1997","003",R.drawable.terminal));
        list.add(new ProdectModel("We are The Miller","2005","004",R.drawable.millers));
        list.add(new ProdectModel("300","2003","003",R.drawable.threehundred));
        list.add(new ProdectModel("Avatar","2009","009",R.drawable.avatar));
        list.add(new ProdectModel("Three Step Above Heaven","2010","007",R.drawable.heaven));
        list.add(new ProdectModel("500 Days of Summer","2002","008",R.drawable.daysofsummer));
        list.add(new ProdectModel("The Vow","2012","00",R.drawable.thevow));



        m = new GridLayoutManager(getApplicationContext(),2);
        adapter = new RecyclerViewAdapter(list,this);
        recyclerView.setLayoutManager(m);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onListClick(int position) {
        Toast.makeText(getApplicationContext(),"Clicked"+position,Toast.LENGTH_LONG).show();
    }
}
