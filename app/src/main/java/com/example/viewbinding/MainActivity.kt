package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //we first import the view binding property under the 'android' tag
    // in the module.gradle file (see the gradle file)

//    buildFeatures{
//        viewBinding = true
//    }
    //after syncing the gradle file to the project we can procede to allocate id's for each element in the .xml file

    // a seperate binding object must be created for each activity to use the binding property derived from the Binding class
    //so the syntax of the naming for the binding class follows the activity name noun
    //since we are in the MainActivity, our binding class in this case will be : ActivityMainBinding

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // to transfer a design object to the activity via ViewBinding
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        //whenever we wanna access a view object using viewBinding , we always use the
        //binding object created initially, then the IdName of the view object, and then the objective to do

        mainBinding.buttonOk.setOnClickListener {
            mainBinding.textViewResult.text = mainBinding.editTextName.text.toString()

        }
    }
}