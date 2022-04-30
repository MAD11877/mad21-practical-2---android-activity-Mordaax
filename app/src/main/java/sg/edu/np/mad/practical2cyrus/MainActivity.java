package sg.edu.np.mad.practical2cyrus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User newUser = new User("Hello World!","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",1,false);

        TextView textViewName = findViewById(R.id.textViewName);
        textViewName.setText(newUser.name);

        TextView textViewDescription = findViewById(R.id.textViewDescription);
        textViewDescription.setText(newUser.description);

        Button buttonFollow = findViewById(R.id.buttonFollow);
        buttonFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonFollow.setText(newUser.followed ? "Follow" : "Unfollow");
                newUser.followed = !newUser.followed;
            }
        });

        }
    }