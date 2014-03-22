package com.greenman_journey.listviewdemoone;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**This class will demonstrate the List Activity example.*/
public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*Data structure to populate in list view.For example we use country names.*/
		ArrayList<String> arrayListToDisplay = new ArrayList<String>();
		arrayListToDisplay.add("IceLand");
		arrayListToDisplay.add("India");
		arrayListToDisplay.add("Japan");
		arrayListToDisplay.add("Jordan");
		arrayListToDisplay.add("Mexico");
		arrayListToDisplay.add("Monaco");
		arrayListToDisplay.add("Netherlands");
		arrayListToDisplay.add("Norway");
		arrayListToDisplay.add("Oman");
		arrayListToDisplay.add("Peru");

		/*Initialize the array adapter with context of calling activity , a layout resource and a data source.*/
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arrayListToDisplay);
		/*Set adapter to the list*/
		setListAdapter(adapter);

	}

	
	
	@Override
	protected void onListItemClick(ListView listView, View view, int position, long id) {
		super.onListItemClick(listView, view, position, id);
	
					/*Fetch the object at selected position from list view.*/
					String selectedCountryString =	(String) listView.getAdapter().getItem(position);
				
					/*Display the selected String.*/
					Toast.makeText(MainActivity.this, "Selected Country is "+selectedCountryString, Toast.LENGTH_LONG).show();
	
	}
	
}
