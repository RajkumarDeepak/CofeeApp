package com.example.android.justjava; /**

 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.

 * This is the package name our example uses:

 *

 * package com.example.android.justjava;

 */



import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import com.example.android.justjava.R;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {


  /**
   * ATTENTION: This was auto-generated to implement the App Indexing API.
   * See https://g.co/AppIndexing/AndroidStudio for more information.
   */
  private GoogleApiClient client;

  int quantity = 0;

  @Override

  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    // ATTENTION: This was auto-generated to implement the App Indexing API.
    // See https://g.co/AppIndexing/AndroidStudio for more information.
    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
  }


  /**
   * This method is called when the order button is clicked.
   */

  public void submitOrder(View view) {

    int price =quantity*5;

    String priceMessage = "Total $ = " + price + "\n Thank You.!";

    displayMessage(priceMessage);

    /**display(quantity);
    displayPrice(quantity * 5);*/


  }

  /**
   * This method is called when the plus button is clicked.
   */


  public void increment (View view) {

        quantity= quantity+1;


    display(quantity);

  }


/**
 * This method is called when the minus button is clicked.
 */

  public void decrement (View view) {

        quantity = quantity-1;
        display(quantity);

  }

  /**
   * This method displays the given quantity value on the screen.
   */

  private void display(int number) {

    TextView quantity = (EditText) findViewById(R.id.quantity);

    quantity.setText("" + number);

  }

  /**

   * This method displays the given price on the screen.

   */

  private void displayPrice(int number) {

    TextView priceindollars = (TextView) findViewById(R.id.priceindollars);

    priceindollars.setText(NumberFormat.getCurrencyInstance().format(number));

  }
  /**

   * This method displays the given text on the screen.

   */

  private void displayMessage(String message) {

    TextView priceindollars = (TextView) findViewById(R.id.priceindollars);

    priceindollars.setText(message);

  }

  }


