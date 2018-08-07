package c.citizencenter.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity
{
    ProgressBar progressBar;
    CheckedTextView checkedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        checkedTextView = findViewById(R.id.checkedTextView);

        checkedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkedTextView.toggle();
                if (checkedTextView.isChecked())
                    checkedTextView.setCheckMarkDrawable(R.drawable.ic_check_black_24dp);
                else
                    checkedTextView.setCheckMarkDrawable(R.drawable.ic_clear_black_24dp);

            }
        });
    }

    public void for25(View view)
    {
        progressBar.setProgress(25);
    }

    public void for100(View view)
    {
        progressBar.setProgress(100);
    }
}
