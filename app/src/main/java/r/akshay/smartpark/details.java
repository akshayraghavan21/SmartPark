package r.akshay.smartpark;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class details extends AppCompatActivity {
    private Context mm;
    private EditText Name;
    private EditText Address;
    private EditText Dura;
    private EditText Phno;
    public String a, b, c, d;
    private static final String TAG = "Tab1Fragment";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);


        Intent intent = getIntent();
        final String name1 = intent.getStringExtra("Location name");

        TextView Locname = findViewById(R.id.Location);
        Locname.setText(name1);

        TextView Wel = findViewById(R.id.textView);
        Wel.setText("Enter your personal Details");

        Button btn = findViewById(R.id.Details);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name = findViewById(R.id.Name);
                Address = findViewById(R.id.Address);
                Dura = findViewById(R.id.Duration);
                Phno = findViewById(R.id.phnumber);
                String a = Name.getText().toString();
                String b = Address.getText().toString();
                String c = Dura.getText().toString();
                String d = Phno.getText().toString();
                Intent entent1 = new Intent(getBaseContext(),MainFragment2.class);

                entent1.putExtra("Location", name1);
                entent1.putExtra("Name", a);
                entent1.putExtra("Address", b);
                entent1.putExtra("Duration", c);
                entent1.putExtra("try", d);
                startActivity(entent1);
                Log.d(TAG, "onClick: Will it navigate?" + d);
            }
        });


    }
}
