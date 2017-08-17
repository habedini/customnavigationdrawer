package ir.attractionsit.customnavigationdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import static ir.attractionsit.customnavigationdrawer.R.id.listdrawerview;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mdrawer;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private String[] str;
    private Integer[] image;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            setContentView(R.layout.activity_main);
            str= new String[]{"sdfds", "sdfds", "sdfds", "sdfds"};
            image = new Integer[] {R.drawable.branch,R.drawable.branch,R.drawable.branch,R.drawable.branch};

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            ListProjectsAdapter myadapter=new ListProjectsAdapter(getApplicationContext(),str,image);
            ListView list= (ListView) findViewById(R.id.listdrawerview);
            list.setAdapter(myadapter);


            mdrawer =(DrawerLayout) findViewById(R.id.drawer_layout) ;
            actionBarDrawerToggle= new ActionBarDrawerToggle(this,mdrawer,R.string.drawet_open, R.string.drawet_open );
        } catch (Exception e) {
            Log.d("hadi",e.toString());
        }
    }
}
