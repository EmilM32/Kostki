package majer.kostki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button mRzut;
    Button mRzut2;
    ImageView k1;
    ImageView k2;
    ImageView k3;
    ImageView k4;
    ImageView k5;
    ImageView k6;
    ImageView k1b;
    ImageView k2b;
    ImageView k3b;
    ImageView k4b;
    ImageView k5b;
    ImageView k6b;
    ImageView sword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRzut = (Button)findViewById(R.id.mRzut);
        mRzut2 = (Button)findViewById(R.id.mRzut2);
        k1 = (ImageView)findViewById(R.id.k1);
        k2 = (ImageView)findViewById(R.id.k2);
        k3 = (ImageView)findViewById(R.id.k3);
        k4 = (ImageView)findViewById(R.id.k4);
        k5 = (ImageView)findViewById(R.id.k5);
        k6 = (ImageView)findViewById(R.id.k6);
        k1b = (ImageView)findViewById(R.id.k1b);
        k2b = (ImageView)findViewById(R.id.k2b);
        k3b = (ImageView)findViewById(R.id.k3b);
        k4b = (ImageView)findViewById(R.id.k4b);
        k5b = (ImageView)findViewById(R.id.k5b);
        k6b = (ImageView)findViewById(R.id.k6b);

        sword = findViewById(R.id.sword);
        sword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second.class); //przejście do innego Activity
                startActivity(intent); //wywołanie przejścia
            }
        });

        mRzut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int n = rand.nextInt(6) + 1; //max:6 min:1
                if(n == 1) {
                    k1.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                else if(n == 2) {
                    k2.setVisibility(View.VISIBLE);
                    k1.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                else if(n == 3) {
                    k3.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k1.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);

                }
                else if(n == 4) {
                    k4.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k1.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                else if(n == 5) {
                    k5.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k1.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                else if(n == 6) {
                    k6.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k1.setVisibility(View.INVISIBLE);

                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }

            }
        });

        mRzut2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int n1 = random.nextInt(6) + 1;
                int n2 = random.nextInt(6) + 1;
                if(n1 == 1)
                {
                    k1.setVisibility(View.VISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 1)
                {
                    k1b.setVisibility(View.VISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                if(n1 == 2)
                {
                    k1.setVisibility(View.INVISIBLE);
                    k2.setVisibility(View.VISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 2)
                {
                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.VISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                if(n1 == 3)
                {
                    k1.setVisibility(View.INVISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.VISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 3)
                {
                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.VISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                if(n1 == 4)
                {
                    k1.setVisibility(View.INVISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.VISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 4)
                {
                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.VISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                if(n1 == 5)
                {
                    k1.setVisibility(View.INVISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.VISIBLE);
                    k6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 5)
                {
                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.VISIBLE);
                    k6b.setVisibility(View.INVISIBLE);
                }
                if(n1 == 6)
                {
                    k1.setVisibility(View.INVISIBLE);
                    k2.setVisibility(View.INVISIBLE);
                    k3.setVisibility(View.INVISIBLE);
                    k4.setVisibility(View.INVISIBLE);
                    k5.setVisibility(View.INVISIBLE);
                    k6.setVisibility(View.VISIBLE);
                }
                if(n2 == 6)
                {
                    k1b.setVisibility(View.INVISIBLE);
                    k2b.setVisibility(View.INVISIBLE);
                    k3b.setVisibility(View.INVISIBLE);
                    k4b.setVisibility(View.INVISIBLE);
                    k5b.setVisibility(View.INVISIBLE);
                    k6b.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
