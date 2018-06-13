package majer.kostki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Second extends Activity {

    private ImageView back;
    private ImageView cz1;
    private ImageView cz2;
    private ImageView cz3;
    private ImageView cz4;
    private ImageView cz5;
    private ImageView cz6;
    private ImageView z1;
    private ImageView z2;
    private ImageView z3;
    private ImageView z4;
    private ImageView z5;
    private ImageView z6;
    private ImageView s1;
    private ImageView s2;
    private ImageView s3;
    private ImageView s4;
    private ImageView s5;
    private ImageView s6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        back = findViewById(R.id.back);
        Button mRzut3 = findViewById(R.id.mRzut3);
        cz1 = findViewById(R.id.cz1);
        cz2 = findViewById(R.id.cz2);
        cz3 = findViewById(R.id.cz3);
        cz4 = findViewById(R.id.cz4);
        cz5 = findViewById(R.id.cz5);
        cz6 = findViewById(R.id.cz6);
        z1 = findViewById(R.id.z1);
        z2 = findViewById(R.id.z2);
        z3 = findViewById(R.id.z3);
        z4 = findViewById(R.id.z4);
        z5 = findViewById(R.id.z5);
        z6 = findViewById(R.id.z6);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);

        mRzut3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int n1 = random.nextInt(6) + 1;
                int n2 = random.nextInt(6) + 1;
                int n3 = random.nextInt(6) + 1;
                if(n1 == 1)
                {
                    z1.setVisibility(View.VISIBLE);
                    z2.setVisibility(View.INVISIBLE);
                    z3.setVisibility(View.INVISIBLE);
                    z4.setVisibility(View.INVISIBLE);
                    z5.setVisibility(View.INVISIBLE);
                    z6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 1)
                {
                    cz1.setVisibility(View.VISIBLE);
                    cz2.setVisibility(View.INVISIBLE);
                    cz3.setVisibility(View.INVISIBLE);
                    cz4.setVisibility(View.INVISIBLE);
                    cz5.setVisibility(View.INVISIBLE);
                    cz6.setVisibility(View.INVISIBLE);
                }
                if(n3 == 1)
                {
                    s1.setVisibility(View.VISIBLE);
                    s2.setVisibility(View.INVISIBLE);
                    s3.setVisibility(View.INVISIBLE);
                    s4.setVisibility(View.INVISIBLE);
                    s5.setVisibility(View.INVISIBLE);
                    s6.setVisibility(View.INVISIBLE);
                }
                if(n1 == 2)
                {
                    z1.setVisibility(View.INVISIBLE);
                    z2.setVisibility(View.VISIBLE);
                    z3.setVisibility(View.INVISIBLE);
                    z4.setVisibility(View.INVISIBLE);
                    z5.setVisibility(View.INVISIBLE);
                    z6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 2)
                {
                    cz1.setVisibility(View.INVISIBLE);
                    cz2.setVisibility(View.VISIBLE);
                    cz3.setVisibility(View.INVISIBLE);
                    cz4.setVisibility(View.INVISIBLE);
                    cz5.setVisibility(View.INVISIBLE);
                    cz6.setVisibility(View.INVISIBLE);
                }
                if(n3 == 2)
                {
                    s1.setVisibility(View.INVISIBLE);
                    s2.setVisibility(View.VISIBLE);
                    s3.setVisibility(View.INVISIBLE);
                    s4.setVisibility(View.INVISIBLE);
                    s5.setVisibility(View.INVISIBLE);
                    s6.setVisibility(View.INVISIBLE);
                }
                if(n1 == 3)
                {
                    z1.setVisibility(View.INVISIBLE);
                    z2.setVisibility(View.INVISIBLE);
                    z3.setVisibility(View.VISIBLE);
                    z4.setVisibility(View.INVISIBLE);
                    z5.setVisibility(View.INVISIBLE);
                    z6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 3)
                {
                    cz1.setVisibility(View.INVISIBLE);
                    cz2.setVisibility(View.INVISIBLE);
                    cz3.setVisibility(View.VISIBLE);
                    cz4.setVisibility(View.INVISIBLE);
                    cz5.setVisibility(View.INVISIBLE);
                    cz6.setVisibility(View.INVISIBLE);
                }
                if(n3 == 3)
                {
                    s1.setVisibility(View.INVISIBLE);
                    s2.setVisibility(View.INVISIBLE);
                    s3.setVisibility(View.VISIBLE);
                    s4.setVisibility(View.INVISIBLE);
                    s5.setVisibility(View.INVISIBLE);
                    s6.setVisibility(View.INVISIBLE);
                }
                if(n1 == 4)
                {
                    z1.setVisibility(View.INVISIBLE);
                    z2.setVisibility(View.INVISIBLE);
                    z3.setVisibility(View.INVISIBLE);
                    z4.setVisibility(View.VISIBLE);
                    z5.setVisibility(View.INVISIBLE);
                    z6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 4)
                {
                    cz1.setVisibility(View.INVISIBLE);
                    cz2.setVisibility(View.INVISIBLE);
                    cz3.setVisibility(View.INVISIBLE);
                    cz4.setVisibility(View.VISIBLE);
                    cz5.setVisibility(View.INVISIBLE);
                    cz6.setVisibility(View.INVISIBLE);
                }
                if(n3 == 4)
                {
                    s1.setVisibility(View.INVISIBLE);
                    s2.setVisibility(View.INVISIBLE);
                    s3.setVisibility(View.INVISIBLE);
                    s4.setVisibility(View.VISIBLE);
                    s5.setVisibility(View.INVISIBLE);
                    s6.setVisibility(View.INVISIBLE);
                }
                if(n1 == 5)
                {
                    z1.setVisibility(View.INVISIBLE);
                    z2.setVisibility(View.INVISIBLE);
                    z3.setVisibility(View.INVISIBLE);
                    z4.setVisibility(View.INVISIBLE);
                    z5.setVisibility(View.VISIBLE);
                    z6.setVisibility(View.INVISIBLE);
                }
                if(n2 == 5)
                {
                    cz1.setVisibility(View.INVISIBLE);
                    cz2.setVisibility(View.INVISIBLE);
                    cz3.setVisibility(View.INVISIBLE);
                    cz4.setVisibility(View.INVISIBLE);
                    cz5.setVisibility(View.VISIBLE);
                    cz6.setVisibility(View.INVISIBLE);
                }
                if(n3 == 5)
                {
                    s1.setVisibility(View.INVISIBLE);
                    s2.setVisibility(View.INVISIBLE);
                    s3.setVisibility(View.INVISIBLE);
                    s4.setVisibility(View.INVISIBLE);
                    s5.setVisibility(View.VISIBLE);
                    s6.setVisibility(View.INVISIBLE);
                }
                if(n1 == 6)
                {
                    z1.setVisibility(View.INVISIBLE);
                    z2.setVisibility(View.INVISIBLE);
                    z3.setVisibility(View.INVISIBLE);
                    z4.setVisibility(View.INVISIBLE);
                    z5.setVisibility(View.INVISIBLE);
                    z6.setVisibility(View.VISIBLE);
                }
                if(n2 == 6)
                {
                    cz1.setVisibility(View.INVISIBLE);
                    cz2.setVisibility(View.INVISIBLE);
                    cz3.setVisibility(View.INVISIBLE);
                    cz4.setVisibility(View.INVISIBLE);
                    cz5.setVisibility(View.INVISIBLE);
                    cz6.setVisibility(View.VISIBLE);
                }
                if(n3 == 6)
                {
                    s1.setVisibility(View.INVISIBLE);
                    s2.setVisibility(View.INVISIBLE);
                    s3.setVisibility(View.INVISIBLE);
                    s4.setVisibility(View.INVISIBLE);
                    s5.setVisibility(View.INVISIBLE);
                    s6.setVisibility(View.VISIBLE);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
