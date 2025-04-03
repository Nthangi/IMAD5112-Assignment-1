package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize UI component
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.restButton)
        val displaySuggestions = findViewById<TextView>(R.id.displaySuggestions)

        // Button click listener to suggest meals based on time
        suggestButton.setOnClickListener {
            val Entretimeofday = timeInput.text.toString().trim().lowercase()

            //Determine meal suggestions based on the time of day
            val mealSuggestion = when (timeInput.text.toString().trim().lowercase()) {
                "morning" -> """
                  -Cereal of your choice with milk
                  -English muffin+Scrambled eggs
                  +cheese with any hot/cold beverage
                  -Instant oatmeal +Chopped nuts
                   + fruit
                  -Amagwenya/Vetkoek+palony,cheese,
                  acthor,snokfish with any hot/cold beverage
                  -Noddles+chopped vienna or russian 
                   with any hot/cold beverage
                    """.trimIndent()

                "mid-morning" -> """
                 -Use frozen fruit to make a smoothie 
                 -Pancakes with+honey+mixed berries 
                  with any hot/cold beverage
                 -Greek yogurt+chopped fruit+granola
                 -Mini bagel+cream cheese+sliced strawberries
                 -Muesli with your choice of yogurt 
                    """.trimIndent()

                "afternoon" -> """
                -Avocado Egg Salad with any hot/cold beverage
                -Basil Chicken Sandwiches with any
                 hot/cold beverage
                -Chicken Quinoa Bowl with any hot/cold beverage
                -To snack you can have a Bag of Popcorn
                 with any hot/cold beverage
                    """.trimIndent()

                "mid-afternoon" -> """
                 -Skillet Mac+Cheese with any
                  hot/cold beverage
                 -Beef ‘n’ Cheese Wraps with 
                 any hot/cold beverage
                 -Focaccia Sandwiches with 
                 any hot/cold beverage
                 -Muffin-Tin Lasagnas with 
                 any hot/cold beverage
                 -To snack you can have 
                 Cookies/Ice Cream/Doughnuts
                    """.trimIndent()

                "dinner" -> """
                 -Pap+(chicken/pork)+salads with any 
                 hot/cold beverage
                 -Garlic-Parmesan Chicken Pasta with 
                 any hot/cold beverage
                 -Grilled Chicken Street Tacos with
                 any hot/cold beverage
                 -For desert you can have malva 
                 pudding/cupcakes/Chocolate Cake
                    """.trimIndent()

                else -> " ERROR Please enter a valid time of day "+
                        "(Morning, Mid-morning,Afternoon, Mid-afternoon, Dinner). "
            }
            //Display meal suggestion
            displaySuggestions.text = mealSuggestion
        }
        //Reset button functionality
        resetButton.setOnClickListener {
            timeInput.text.clear()
            displaySuggestions.text = "Display Suggetion"
        }


    }
}


