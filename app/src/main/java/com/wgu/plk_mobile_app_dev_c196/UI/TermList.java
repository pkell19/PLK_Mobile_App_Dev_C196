package com.wgu.plk_mobile_app_dev_c196.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.wgu.plk_mobile_app_dev_c196.R;

public class TermList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
        public boolean onCreateOptionsMenu (Menu menu) {
            getMenuInflater().inflate(R.menu.menu_term_list, menu);
            return true;
        }

        public boolean onOptionsItemSelected (MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    this.finish();
                    return true;
            }
                return super.onOptionsItemSelected(item);
        }

    public void onClickAddTerm(View view) {
        Intent intent = new Intent(TermList.this, TermDetail.class);
        startActivity(intent);
    }
}
