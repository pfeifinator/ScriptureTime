package com.example.acer.scriptureref;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ScriptureReferences extends AppCompatActivity {

    public void read(View view){

        Intent sendIntent = new Intent(ScriptureReferences.this, ScriptureRef3.class);
        Bundle bundle = new Bundle();

        TextView t = (TextView) findViewById(R.id.bookText);
        bundle.putString("book", t.getText().toString());
        t = (TextView) findViewById(R.id.chapterText);
        bundle.putString("chapter", t.getText().toString());
        t = (TextView) findViewById(R.id.verseText);
        bundle.putString("verse", t.getText().toString());

        sendIntent.putExtras(bundle);
        startActivity(sendIntent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_references);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scripture_references, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
