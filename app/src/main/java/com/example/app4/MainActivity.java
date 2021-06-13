package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    ImageView imageView1, imageView2, imageView3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        imageView1=(ImageView) findViewById(R.id.imageView1);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView3=(ImageView) findViewById(R.id.imageView3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("textView", "Website for development programming languages");

                intent.putExtra("textView1", "JavaScript is an abbreviation of JS, actually is  programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time complied, and multi-paradigm. It uses curly-bracket syntax, dynamic typing , prototype-based object-orientation.");

                intent.putExtra("textView2","HTML(Hypertext Markup Language) is used to crate the actual content of the page, such as writing text, and CSS(Cascade Styling Sheet) which is responsible for the design or style of the website, including the layout, visual events and background's colour");
                intent.putExtra("textView3", "JavaScript frameworks are an essential part of the font-end web development, providing developers with tried and tested tools for building scalable, interactive web applications.Nowadays many companies uses javaScript framework their standard font-end jobs require framework experience employee.");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("textView","Development of android mobile devices");

                intent.putExtra("textView1","android mobile development is the process of by which applications are created for device running the android operating system. This experiment can be carried using Java, Kotlin, C++ languages (using the android software known as development kit(SDK).\n" +
                        "Android is one the most popular operating system that is used through the global world, around 90% of the world use android.");

                intent.putExtra("textView2","Adaptive design refers to graphical user interface(GUI) design that adapts to different screen sizes. Designers applies it in GUIs, such as web pages, which  must function on devices of different sizes. Adaptive design typically uses multiple fixed layout sizes");


                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("textView", "Exploration of programming");
            intent.putExtra("textView1", "Machine language is a method odf data analysis that automates analystical model building. It is a branch of artificial intelligiance based on ht e idea that system can learn from data, identify patterns and make decisions with minimal human intervention");
            intent.putExtra("textView2", "Programming language is a formal language coprosing a set of strings that produce various kinds of machine code out. Progrmming languages are one kind of computer language, and are used in computer programming to implement algorithims.");
            intent.putExtra("textView3", "Statistics Inference is the process of using data analysis to infer properties of an underlying distribution of probability.");

        startActivity(intent);
    }
}