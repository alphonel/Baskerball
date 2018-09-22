package cn.edu.wp.baskerball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter1;
    int counter2;
    TextView sa,sb;
    Button pa3,pa2,pb3,pb2,pa1,pb1,rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sa=findViewById(R.id.scoreA);
        sb=findViewById(R.id.scoreB);
        pa3=findViewById(R.id.pointA3);
        pa2=findViewById(R.id.pointA2);
        pa1=findViewById(R.id.free1);
        pb1=findViewById(R.id.free2);
        pb3=findViewById(R.id.pointB3);
        pb2=findViewById(R.id.pointB2);
        rs=findViewById(R.id.reset);

        counter1=0;
        counter2=0;
        pa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            counter1=counter1+3;
            sa.setText(String.valueOf(counter1));
            }
        });
        pa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1=counter1+2;
                sa.setText(String.valueOf(counter1));
            }
        });
        pa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1=counter1+1;
                sa.setText(String.valueOf(counter1));
            }
        });
        pb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2=counter2+3;
                sb.setText(String.valueOf(counter2));
            }
        });
        pb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2=counter2+2;
                sb.setText(String.valueOf(counter2));
            }
        });
        pb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter2=counter2+1;
                sb.setText(String.valueOf(counter2));
            }
        });
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1=0;
                counter2=0;
                sa.setText(String.valueOf(counter1));
                sb.setText(String.valueOf(counter2));
            }
        });




        // Example of a call to a native method
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
