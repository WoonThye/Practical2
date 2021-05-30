package sg.edu.rp.c346.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView tvAnswer;
    Button btnBack;
    int ourFontSize =14;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvAnswer = findViewById(R.id.textView);
        btnBack = findViewById(R.id.button1);
        registerForContextMenu(tvAnswer);

        Intent i = getIntent();
        String Animalname = i.getStringExtra("Animalname");
        String Kingdom = i.getStringExtra("Kingdom");
        String habitat = i.getStringExtra("Habitat");
        String Prey = i.getStringExtra("Prey");
        String location = i.getStringExtra("Location");
        String lifespan = i.getStringExtra("lifespan");
        String color = i.getStringExtra("color");
        String Weight = i.getStringExtra("Weight");
        String Height = i.getStringExtra("Height");
        String description = i.getStringExtra("description");



        tvAnswer.setText("Animalname:  " + Animalname + "\nKingdom:  " + Kingdom + "\nHabitat:  " + habitat + "\nPrey:  " + Prey + "\nLocation:  " + location + "\nLifespan:  " + lifespan + "\nColor:  "+color+ "\nWeight:  "+Weight+ "\nHeight:  " +Height+ "\nDescription:  " +description);

        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_zoom, menu);


        if (v == tvAnswer) {
            wordClicked ="tvAnswer";
            Log.v("Context", "tvAnswer selected");//
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (wordClicked.equalsIgnoreCase("tvAnswer")) {
            if (id == R.id.Zoominselection) {
                ourFontSize += 1;
                tvAnswer.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize);
            } else if (id == R.id.Zoomoutselection) {
                ourFontSize -= 1;
                tvAnswer.setTextSize(TypedValue.COMPLEX_UNIT_SP, ourFontSize);
            }
        }
        return super.onContextItemSelected(item);
    }
}