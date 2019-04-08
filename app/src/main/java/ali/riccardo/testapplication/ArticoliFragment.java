package ali.riccardo.testapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ArticoliFragment extends Fragment {
    View view;
    int counter = 0;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_articoli, container, false);
        Button button = view.findViewById(R.id.button);
        final RelativeLayout relativeLayout = view.findViewById(R.id.fragment_articoli_layout);
        final TextView lel = view.findViewById(R.id.label);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter++;

                TextView textView = new TextView(relativeLayout.getContext());
                textView.setText("TextView" + counter);
                relativeLayout.addView(textView);
            }
        });
        return view;
    }
}
