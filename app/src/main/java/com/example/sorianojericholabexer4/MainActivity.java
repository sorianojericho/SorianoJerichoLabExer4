package com.example.sorianojericholabexer4;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] comName, country, industry, ceo;
    int[] logo = {R.drawable.icbc, R.drawable.samsung, R.drawable.wellsfargo,
            R.drawable.royaldutchshell, R.drawable.pinganinsurance, R.drawable.jpmorgan,
            R.drawable.apple, R.drawable.att, R.drawable.agriculturalbankofchina,
            R.drawable.bankofamerica, R.drawable.bankofchina, R.drawable.chinaconstrucbank,
            R.drawable.citibank, R.drawable.exxonmobil};
    ListView lstVersions;
    ArrayList<AndroidVersion> versions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        comName = getResources().getStringArray(R.array.comName);
        country = getResources().getStringArray(R.array.country);
        industry = getResources().getStringArray(R.array.industry);
        ceo = getResources().getStringArray(R.array.ceo);
        for(int i = 0; i < comName.length; i++){
            versions.add(new com.example.sorianojericholabexer4.AndroidVersion(logo[i], comName[i], industry[i], country[i], ceo[i]));
        }

        AndroidAdapter adapter = new AndroidAdapter(this, R.layout.newlayout ,versions);
        lstVersions = findViewById(R.id.lvAndroid);
        lstVersions.setAdapter(adapter);
        lstVersions.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {
        Toast.makeText(this,comName[i], Toast.LENGTH_LONG).show();
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(logo[i]);
        dialog.setTitle(comName[i]);
        dialog.setMessage(country[i]);
        dialog.setMessage(industry[i]);
        dialog.setMessage(ceo[i]);
        dialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.dismiss();
                Toast.makeText(MainActivity.this, comName[i], Toast.LENGTH_LONG).show();
            }

        });
        dialog.create().show();

    }
}
