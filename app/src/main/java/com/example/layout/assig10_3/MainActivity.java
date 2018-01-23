package com.example.layout.assig10_3;
//Package objects contain version information about the implementation and specification of a Java package

import android.app.FragmentManager;
import android.app.ListActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ListActivity {
//here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//ListActivity has a default layout that consists of a single, full-screen list in the center of the screen.
    ListView lv;
    //ListView is a view group that displays a list of scrollable items
    ImageView iv;
    //Displays image resources, for example Bitmap or Drawable resources
    TextView tv;
    //A user interface element that displays text to the user.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
// call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
        iv=findViewById(R.id.icon);
        //creating thr image and text view objects
        tv=findViewById(R.id.textView);
        String[] values={"It is used for streaming and downloading videos","A blogger is someone who blogs, or writes content for a blog"};
       //Here we have set of string values using arrays
        //An Adapter object acts as a bridge between an AdapterView and the underlying data for that view. The Adapter provides access to the data items.
        // The Adapter is also responsible for making a View for each item in the data set.
        MyAdapter adapter = new MyAdapter(MainActivity.this,R.layout.list_items,values);
        setListAdapter(adapter);
        //setting the list adapter which are in adapter
    }

}
