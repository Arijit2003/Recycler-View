package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.SearchView
import android.widget.SearchView.*
import androidx.appcompat.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var arrayList:ArrayList<song>
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.songsList)
        arrayList = arrayListOf()
        arrayList.add(song("Ram Siya Ram","Song of lord Rama "))
        arrayList.add(song("Achyutam Keshavam","Song of Bhagwan Sri Krishna"))
        arrayList.add(song("Tum Prem Ho","Song of RadheKrishna"))
        arrayList.add(song("Naina","By Arijit Singh"))
        arrayList.add(song("Hey Kehsava Hey Madhava","Kartikeya 2"))
        arrayList.add(song("Bandeya","By Arijit Singh"))
        arrayList.add(song("Desh Mere","Bhuj"))
        arrayList.add(song("Hamari Aduri kahani","By Arijit Singh"))
        arrayList.add(song("galti se mistake","By Arijit Singh"))
        arrayList.add(song("Tum Hi Ho","By Arijit Singh"))
        arrayList.add(song("Nashe si Chadh Gayi","Befikre"))
        arrayList.add(song("Ram Siya Ram","Song of lord Rama "))
        arrayList.add(song("Achyutam Keshavam","Song of Bhagwan Sri Krishna"))
        arrayList.add(song("Tum Prem Ho","Song of RadheKrishna"))
        arrayList.add(song("Naina","By Arijit Singh"))
        arrayList.add(song("Hey Kehsava Hey Madhava","Kartikeya 2"))
        arrayList.add(song("Bandeya","By Arijit Singh"))
        arrayList.add(song("Desh Mere","Bhuj"))
        arrayList.add(song("Hamari Aduri kahani","By Arijit Singh"))
        arrayList.add(song("galti se mistake","By Arijit Singh"))
        arrayList.add(song("Tum Hi Ho","By Arijit Singh"))
        arrayList.add(song("Nashe si Chadh Gayi","Befikre"))
        arrayList.add(song("Ram Siya Ram","Song of lord Rama "))
        arrayList.add(song("Achyutam Keshavam","Song of Bhagwan Sri Krishna"))
        arrayList.add(song("Tum Prem Ho","Song of RadheKrishna"))
        arrayList.add(song("Naina","By Arijit Singh"))
        arrayList.add(song("Hey Kehsava Hey Madhava","Kartikeya 2"))
        arrayList.add(song("Bandeya","By Arijit Singh"))
        arrayList.add(song("Desh Mere","Bhuj"))
        arrayList.add(song("Hamari Aduri kahani","By Arijit Singh"))
        arrayList.add(song("galti se mistake","By Arijit Singh"))
        arrayList.add(song("Tum Hi Ho","By Arijit Singh"))
        arrayList.add(song("Nashe si Chadh Gayi","Befikre"))
        arrayList.add(song("Ram Siya Ram","Song of lord Rama "))
        arrayList.add(song("Achyutam Keshavam","Song of Bhagwan Sri Krishna"))
        arrayList.add(song("Tum Prem Ho","Song of RadheKrishna"))
        arrayList.add(song("Naina","By Arijit Singh"))
        arrayList.add(song("Hey Kehsava Hey Madhava","Kartikeya 2"))
        arrayList.add(song("Bandeya","By Arijit Singh"))
        arrayList.add(song("Desh Mere","Bhuj"))
        arrayList.add(song("Hamari Aduri kahani","By Arijit Singh"))
        arrayList.add(song("galti se mistake","By Arijit Singh"))
        arrayList.add(song("Tum Hi Ho","By Arijit Singh"))
        arrayList.add(song("Nashe si Chadh Gayi","Befikre"))
        val adapter:MyAdapter= MyAdapter(this,arrayList)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater:MenuInflater=getMenuInflater()
        menuInflater.inflate(R.menu.menu,menu)
        // here we are creating a reference variable for the menu item(search view)
        val menuItemSV:MenuItem= menu?.findItem(R.id.actionSearch) as MenuItem

        /* Here we are adding a search view.
           It means that when we are clicking the menu item (search view item) then
           a search view will be added in the the top */
        val searchView: SearchView = menuItemSV.actionView as SearchView
        // here we are expanding the search view.
        // If we do not add this line of code then
        // again we have to tap on the searchView: SearchView
        searchView.onActionViewExpanded()

        searchView.queryHint = "Search here"
        searchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var arrayList2: ArrayList<song> = arrayListOf()

                for (i in arrayList) {
                    if (i.title.lowercase().contains(newText.toString().lowercase())) {
                        arrayList2.add(i)
                    }
                }
                val adapter2 = MyAdapter(this@MainActivity, arrayList2)
                recyclerView.adapter = adapter2
                return false
            }
        })
        return true
    }
}