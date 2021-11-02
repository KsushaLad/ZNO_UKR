package com.ksusha.zno_ukr;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private Toolbar toolbar;
    private int category_index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.listView);
        array = getResources().getStringArray(R.array.ukrmova_array); //по умолчанию список
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<>(Arrays.asList(array))); //инициализация адаптера
        list.setAdapter(adapter); //использование списка адаптером
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.ukrainskamova);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        list.setOnItemClickListener((parent, view, position, id) -> { //реагирование на нажатие каждого пункта списка
            Intent intent = new Intent(MainActivity.this, Text_Content_Activity.class);
            intent.putExtra("category", category_index);
            intent.putExtra("position", position);
            startActivity(intent);
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) { //нажатие на элементы в боковом меню
        int id = menuItem.getItemId(); //какой Item был нажат
        if (id == R.id.ukr_mova) {
            fillArray(R.string.ukrainskamova, R.array.ukrmova_array, 0);
        } else if (id == R.id.ukr_lit) {
            fillArray(R.string.ukrliteratura, R.array.ukrlitra_array, 1);
        } else if (id == R.id.nagolosy) {
            fillArray(R.string.nagolosy, R.array.nagolosi_array, 2);
        } else if (id == R.id.fraze) {
            fillArray(R.string.fraze, R.array.frazeologizms, 3);
        }
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START); //закрытие бокового меню при нажатии на любой Item
        return true;
    }

    private void fillArray(int title, int arrayList, int index) {
        toolbar.setTitle(title);
        array = getResources().getStringArray(arrayList); //получение данных
        adapter.clear(); //стирание старого списка
        adapter.addAll(array); //добавление нового списка в адаптер
        adapter.notifyDataSetChanged(); //указание адаптеру об изменении данных
        category_index = index;
    }
}