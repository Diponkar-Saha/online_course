package com.pioneeralpha.amarischool.ui.our_products

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.adapters.OurProductsRecyclerAdapter
import com.pioneeralpha.amarischool.databinding.ActivityOurProductsBinding
import com.pioneeralpha.amarischool.models.Product
import com.squareup.picasso.Picasso


class OurProductsActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityOurProductsBinding
    private var mAdapter
            : OurProductsRecyclerAdapter? = null
    private var mLayoutManager
            : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityOurProductsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setSupportActionBar(mBinding.toolbar)
        mBinding.toolbar.title = "Our Products"
        setSupportActionBar(mBinding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        Picasso.get()
                .load("https://cdn.pixabay.com/photo/2019/11/02/13/03/mobile-4596316_960_720.jpg").placeholder(R.drawable.placeholder_loading)
                .error(R.drawable.placeholder_error)
                .into(mBinding.imageView24)
        setupRecyclerView()


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_notification) {
            Toast.makeText(this, "notification clicked", Toast.LENGTH_SHORT).show()
            return true
        } else if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupRecyclerView() {
        val products: ArrayList<Product> = ArrayList()
        products.add(Product("https://source.unsplash.com/random/200x200?sig=1", "Android", "this is android"))
        products.add(Product("https://source.unsplash.com/random/200x200?sig=2", "Cloud", "this is cloud"))
        products.add(Product("https://source.unsplash.com/random/200x200?sig=3", "Comment", "this is comment"))
        mBinding.recyclerView.setHasFixedSize(true)
        mLayoutManager = LinearLayoutManager(this)
        mAdapter = OurProductsRecyclerAdapter(products)
        mBinding.recyclerView.layoutManager = mLayoutManager
        mBinding.recyclerView.adapter = mAdapter

    }
}