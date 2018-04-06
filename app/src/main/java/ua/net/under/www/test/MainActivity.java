package ua.net.under.www.test;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("TabOne"),true);
        tabLayout.addTab(tabLayout.newTab().setText("TabTwo"));
        tabLayout.addOnTabSelectedListener(new TabSelected());
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.isChecked()){
                    item.setChecked(false);
                    Log.print("Uncheked");
                }else {
                    item.setChecked(true);
                    Log.print("Checked");
                }

                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
