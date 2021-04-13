package com.example.samplegpsapp;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import java.util.ArrayList;
import java.util.List;


import android.graphics.Canvas;




public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //HeatmapTileProvider mMap = new HeatmapTileProvider.Builder();

        // Add a marker in Sydney and move the camera
        LatLng barracks = new LatLng(38.0528, -78.5013);
        LatLng barracks2 = new LatLng(38.0524, -78.5015);
        LatLng barracks3 = new LatLng(38.0520, -78.5017);
        LatLng barracks4 = new LatLng(38.0515, -78.5013);
        LatLng barracks5 = new LatLng(38.0512, -78.5020);
        LatLng barracks6 = new LatLng(38.0510, -78.5022);
        LatLng barracks7 = new LatLng(38.0505, -78.5027);
        LatLng barracks8 = new LatLng(38.05, -78.5025);
        LatLng barracks9 = new LatLng(38.0510, -78.5040);
        LatLng barracks10 = new LatLng(38.0505, -78.5030);
        LatLng barracks11 = new LatLng(38.05, -78.5035);

        //android.location.LocationManager locationManager = (android.location.LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        //String locationProvider = LocationManager.NETWORK_PROVIDER;
        // I suppressed the missing-permission warning because this wouldn't be executed in my
        // case without location services being enabled
        //@SuppressLint("MissingPermission") android.location.Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);
        //double userLat = lastKnownLocation.getLatitude();
        //double userLong = lastKnownLocation.getLongitude();
        mMap.addMarker(new MarkerOptions().position(barracks).title("Marker close to Barracks Shopping Center"));
        mMap.addMarker(new MarkerOptions().position(barracks2).title("Marker close to Barracks Shopping Center 2"));
        mMap.addMarker(new MarkerOptions().position(barracks3).title("Marker close to Barracks Shopping Center 3"));
        mMap.addMarker(new MarkerOptions().position(barracks4).title("Marker close to Barracks Shopping Center 4"));
        mMap.addMarker(new MarkerOptions().position(barracks5).title("Marker close to Barracks Shopping Center 5"));
        mMap.addMarker(new MarkerOptions().position(barracks6).title("Marker close to Barracks Shopping Center 6"));
        mMap.addMarker(new MarkerOptions().position(barracks7).title("Marker close to Barracks Shopping Center 7"));
        mMap.addMarker(new MarkerOptions().position(barracks8).title("Marker close to Barracks Shopping Center 8"));
        mMap.addMarker(new MarkerOptions().position(barracks9).title("Marker close to Barracks Shopping Center 9"));
        mMap.addMarker(new MarkerOptions().position(barracks10).title("Marker close to Barracks Shopping Center 10"));
        mMap.addMarker(new MarkerOptions().position(barracks11).title("Marker close to Barracks Shopping Center 11"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(barracks));
    }

}