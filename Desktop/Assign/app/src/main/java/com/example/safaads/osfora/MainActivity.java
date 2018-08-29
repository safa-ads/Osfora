package com.example.safaads.osfora;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Adapter;
import android.widget.EditText;
import java.util.ArrayList;


public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private com.example.safaads.osfora.Adapter adapter;
    private EditText etsearch;
    private String[] moviewList;
    public static ArrayList<Model> movieNamesArrayList;
    public static ArrayList<Model> array_sort;
    int textlength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setDisplayShowHomeEnabled(false);
        recyclerView.setdi

        moviewList = new String[]{"Xmen", "Titanic", "Captain America",
                "Iron man", "Rocky", "Transporter", "Lord of the rings", "The jungle book",
                "Tarzan","Cars","Shreck"};

        recyclerView = (RecyclerView) findViewById(R.id.tweeters_recycler_view);

        movieNamesArrayList = new ArrayList<Model>();
        adapter = new com.example.safaads.osfora.Adapter(this,movieNamesArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        etsearch = (EditText) findViewById(R.id.search_editText);
        array_sort = new ArrayList<>();
        array_sort = populateList();
        etsearch.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                movieNamesArrayList = populateList();
                array_sort = populateList();
                textlength = etsearch.getText().length();
                array_sort.clear();
                for (int i = 0; i < movieNamesArrayList.size(); i++) {
                    if (textlength <= movieNamesArrayList.get(i).getName().length()) {
                        //Log.d("ertyyy", movieNamesArrayList.get(i).getName().toLowerCase().trim());
                        if (movieNamesArrayList.get(i).getName().toLowerCase().trim().contains(
                                etsearch.getText().toString().toLowerCase().trim())) {
                            array_sort.add(movieNamesArrayList.get(i));
                        }
                    }
                }
                adapter = new com.example.safaads.osfora.Adapter(MainActivity.this, array_sort);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

            }
        });


    }
    private ArrayList<Model> populateList(){

        ArrayList<Model> list = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            Model imageModel = new Model();
            imageModel.setName(moviewList[i]);
            list.add(imageModel);
        }

        return list;
    }

}
