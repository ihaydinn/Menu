package com.ismailhakkiaydin.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        SubMenu subMenu = menu.addSubMenu(0,0,Menu.NONE,"Sub Menu");
        subMenu.setHeaderIcon(R.drawable.ic_launcher_foreground);
        subMenu.setIcon(R.drawable.ic_launcher_foreground);

        MenuItem menuItem = subMenu.add(0,0,Menu.NONE,"Sub Menu Item");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Context Menu");
        menu.add(0,menu.FIRST,Menu.NONE,"Item 1").setIcon(R.drawable.ic_launcher_background);

        menu.add(0,menu.FIRST+1,Menu.NONE, "Item 2").setCheckable(true);
        menu.add(0,menu.FIRST+2, Menu.NONE,"Item 3 ").setShortcut('3','3');
        SubMenu subMenu = menu.addSubMenu("SubMenu");
        subMenu.add("SubMenu Item");
    }
}
