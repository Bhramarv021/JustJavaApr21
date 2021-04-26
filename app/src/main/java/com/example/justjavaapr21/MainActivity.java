package com.example.justjavaapr21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    /**
     * variable quantity to get the number of quantity
     */
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method to increment the order quantity
     */
    public void incrementQuantity(View view) {
        quantity++;
        displayQuantity();
    }

    /**
     * Method to decrement the order quantity
     */
    public void decrementQuantity(View view) {
        if (quantity > 0)
            quantity--;
        displayQuantity();
    }

    /**
     * This method is called when the submit button clicked
     */
    public void submitOrder(View view) {
        displayPrice(quantity * 20);
    }

    /**
     * This method displays the given quantity number on the screen
     * quantity receives number of coffee and pass as argument to setText method
     */
    public void displayQuantity() {
        TextView orderQuantityTV = (TextView) findViewById(R.id.quantity_text_view);
        orderQuantityTV.setText("" + quantity);
    }

    /**
     * This method is called to display total price on the screen
     *
     * @param totalPrice takes the price value
     */
    public void displayPrice(int totalPrice) {
        TextView priceTV = (TextView) findViewById(R.id.price_text_view);
        priceTV.setText(NumberFormat.getCurrencyInstance().format(totalPrice));
    }

}