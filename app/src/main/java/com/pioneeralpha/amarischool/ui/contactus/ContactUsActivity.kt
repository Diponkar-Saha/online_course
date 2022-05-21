package com.pioneeralpha.amarischool.ui.contactus

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.pioneeralpha.amarischool.R
import com.pioneeralpha.amarischool.databinding.ActivityContactUsBinding


class ContactUsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mBinding: ActivityContactUsBinding
    private lateinit var mMapView: MapView
    private lateinit var MAP_API: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        val app: ApplicationInfo = this.packageManager.getApplicationInfo(this.packageName, PackageManager.GET_META_DATA)
        val bundle = app.metaData
        MAP_API = bundle.getString("com.google.android.geo.API_KEY").toString()
        setSupportActionBar(mBinding.toolbar)
        mBinding.toolbar.title = "Contact Us"
        setSupportActionBar(mBinding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        initGoogleMap(savedInstanceState)
        initSpinner()
    }

    private fun initSpinner() {
        val items = listOf("High", "Medium", "Low")
        val adapter = ArrayAdapter(baseContext, R.layout.item_spinner, items)
        (mBinding.content.contactPrioritySpinner.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }

    private fun initGoogleMap(savedInstanceState: Bundle?) {
        var mapViewBundle: Bundle? = null
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAP_API)
        }
        mMapView = mBinding.content.map;
        mMapView.onCreate(mapViewBundle)
        mMapView.getMapAsync(this)
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var mapViewBundle = outState.getBundle(MAP_API)
        if (mapViewBundle == null) {
            mapViewBundle = Bundle()
            outState.putBundle(MAP_API, mapViewBundle)
        }
        mMapView.onSaveInstanceState(mapViewBundle)
    }

    override fun onResume() {
        super.onResume()
        mMapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        mMapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mMapView.onStop()
    }

    override fun onMapReady(map: GoogleMap) {
        val lat = 23.74
        val long = 90.38
        map.addMarker(MarkerOptions().position(LatLng(lat, long)).title("Address"))
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(lat, long), 17.0f))
        map.uiSettings.isZoomControlsEnabled = true
    }

    override fun onPause() {
        mMapView.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        mMapView.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mMapView.onLowMemory()
    }

}