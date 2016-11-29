package azizashari.achievement;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int hitung=5;
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitungBadges();
    }

    public void hitungBadges(){
        if (hitung == 5){
            ImageView img = (ImageView) findViewById(R.id.badge2);
            img.setImageResource(R.drawable.cake);
        }

        else if (hitung == 10){
            ImageView img = (ImageView) findViewById(R.id.badge2);
            img.setImageResource(R.drawable.egg);
        }

        else if (hitung == 15){
            ImageView img = (ImageView) findViewById(R.id.badge2);
            img.setImageResource(R.drawable.chicken);
        }

        else if (hitung == 20){
            ImageView img = (ImageView) findViewById(R.id.badge2);
            img.setImageResource(R.drawable.burger);
        }

        else if (hitung == 25){
            ImageView img = (ImageView) findViewById(R.id.badge2);
            img.setImageResource(R.drawable.pizza);
        }

    }

    public void klikBadges1(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("This is Your First Achievemennt! Visit More Places To Get Another Badges."+"\n"+"<b>"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }

    public void klikBadges2(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("You Must Get 5 Points to Unlock This Achievement!"+"\n"+"<b>"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }

    public void klikBadges3(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("You Must Get 10 Points to Unlock This Achievement!"+"\n"+"<b>"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }

    public void klikBadges4(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("You Must Get 15 Points to Unlock This Achievement!"+"<br>"+"\n"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }

    public void klikBadges5(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("You Must Get 20 Points to Unlock This Achievement!"+"\n"+"<b>"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }

    public void klikBadges6(View v){
        new AlertDialog.Builder(this)
                .setTitle("Achievement")
                .setMessage(Html.fromHtml("You Must Get 25 Points to Unlock This Achievement!"+"\n"+"<b>"+"Your Current Point : "+hitung+"</b>"))
                .setNegativeButton("Ok", null)
                .show();
    }


}


