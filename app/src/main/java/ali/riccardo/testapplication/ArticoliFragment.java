package ali.riccardo.testapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ArticoliFragment extends Fragment {
    View view;
    int counter = 0;
    String link = "https://docs.google.com/document/d/1ALWFQ57sB7mdcI5zN6s_6_7hQfKR-B8KgQfN2aK8kbI/edit?usp=sharing";
    String textHolder = "";
    String textHolder2 = "";
    BufferedReader bufferReader;

    /*public String getTextFromUrl() {
        try {
            //Create a URL for the desired page
            URL url = new URL(link);

            //Read all the text returned by the server
            bufferReader = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((textHolder2 = bufferReader.readLine()) != null) {
                textHolder += textHolder2;
            }
            bufferReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            textHolder = e.toString();
        } catch (IOException e) {
            e.printStackTrace();

            textHolder = e.toString();
        }
        return textHolder;
    }*/




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
                //textView.setText(ciao());
                relativeLayout.addView(textView);
                // Get the TextView current LayoutParams
                RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                lp.setMargins(700, 50*counter, 0, 0);
                textView.setLayoutParams(lp);
            }
        });


        return view;
    }
}
