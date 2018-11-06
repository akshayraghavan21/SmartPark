package r.akshay.smartpark;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.BaseColumns;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment2 extends AppCompatActivity {
    private static final String TAG = "Tab1Fragment";

    private String selected;
    private String Locn, Un, Addree, Dur, Phn, a, b, c, d;
    private TextView Locname, Uname, Addi, Dura, Phone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2_layout);




        Intent intent = getIntent();
        Locn = intent.getStringExtra("Location");
        Un = intent.getStringExtra("Name");
        Log.d(TAG, "onCreate: pls"+Un);
        Addree = intent.getStringExtra("Address");
        Dur = intent.getStringExtra("Duration");
        Phn = intent.getStringExtra("try");

        Locname = findViewById(R.id.Location);
        Uname = findViewById(R.id.Name);
        Addi = findViewById(R.id.Address);
        Dura = findViewById(R.id.Duration);
        Phone = findViewById(R.id.Phoneno);

        String a = Locn;

        Locname.setText(a);
        Uname.setText(Un);
        Addi.setText(Addree);
        Dura.setText(Dur);
        Phone.setText(Phn);
    }
}
