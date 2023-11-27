package ma.ofppt.move_picture;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import ma.ofppt.move_picture.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_MOVE){
                    binding.image.setX(event.getRawX() - binding.image.getWidth()/2);
                    binding.image.setY(event.getRawY() - binding.image.getHeight()/2);
                    return true;
                }
                Toast.makeText(getApplicationContext(),"Move",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}