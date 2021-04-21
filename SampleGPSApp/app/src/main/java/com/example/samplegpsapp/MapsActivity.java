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
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.*;

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

        // These are markers representing people in the area (Hard-Coded)
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

        // Adding these people to the map
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

        // These are markers representing businesses in the area (Hard-Coded)
        LatLng business = new LatLng(38.0497903, -78.5028646);
        LatLng business2 = new LatLng(38.0499778, -78.5042131);
        LatLng business3 = new LatLng(38.0497327, -78.5029169);
        LatLng business4 = new LatLng(38.0488652, -78.5051546);
        LatLng business5 = new LatLng(38.0515329, -78.5017146);

        ArrayList<LatLng> users = new ArrayList<>();
        users.add(barracks);
        users.add(barracks2);
        users.add(barracks3);
        users.add(barracks4);
        users.add(barracks5);
        users.add(barracks6);
        users.add(barracks7);
        users.add(barracks8);
        users.add(barracks9);
        users.add(barracks10);
        users.add(barracks11);

        //Log.d("Crowd Level", String.valueOf(getCrowdLevel(users, business)));
        //Log.d("Crowd Level", String.valueOf(getCrowdLevel(users, business2)));
        //Log.d("Crowd Level", String.valueOf(getCrowdLevel(users, business3)));
        //Log.d("Crowd Level", String.valueOf(getCrowdLevel(users, business4)));
        //Log.d("Crowd Level", String.valueOf(getCrowdLevel(users, business5)));

        // Adding businesses to the map
        mMap.addMarker(new MarkerOptions().position(business).title("Smoothie King:" + getCrowdLevel(users, business)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(business2).title("Harris Teeter:" + getCrowdLevel(users, business2)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(business3).title("Zin Burger:" + getCrowdLevel(users, business3)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(business4).title("Orangetheory Fitness:" + getCrowdLevel(users, business4)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions().position(business5).title("Subway:" + getCrowdLevel(users, business5)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(barracks5, 16));
    }

    public String getCrowdLevel(List users, LatLng business){
        double crowdMetric = 0;
        for (int i = 0; i < users.size(); i++){
            Log.d("Distance", String.valueOf(getDistance((LatLng) users.get(i),business)));
            double distance = getDistance((LatLng) users.get(i),business);
            // If a user is within 20 meters of a business, they are considered AT that business
            if (distance <= 20){
                crowdMetric += 1;
            }
            // If a user is within 20 and 50 meters of a business, there's a good chance they're at it
            if (20 < distance && distance <= 50){
                crowdMetric = crowdMetric + 0.5;
            }
            // If a user is within 50 and 150 meters of a business, odds are low they are there
            // However, if the location is 'big,' like a park or store, we need to account for these people
            if (50 < distance && distance <= 150){
                crowdMetric += 0.1;
            }
        }

        // We have to take into account the number of users.
        // If the number of users is higher, then the crowdMetrics will also be higher
        // We need to adjust this
        double adjustment = Math.pow(users.size(), 0.2);
        crowdMetric = crowdMetric/adjustment;
        if (crowdMetric <= 0.2){
            return " not that busy";
        }
        else if (0.2 < crowdMetric && crowdMetric <= 0.5){
            return " somewhat busy";
        }
        else if (0.5 < crowdMetric && crowdMetric <= 1){
            return " pretty busy";
        }
        else{
            return " very busy";
        }
    }

    public double getDistance(LatLng point1, LatLng point2){
        // Code for this calculation based off https://www.geodatasource.com/developers/java
        if (point1.latitude == point2.latitude && point1.longitude == point2.longitude){
            return 0;
        }
        else{
            double theta = point1.longitude - point2.longitude;
            double dist = Math.sin(Math.toRadians(point1.latitude))
                    * Math.sin(Math.toRadians(point2.latitude))
                    + Math.cos(Math.toRadians(point1.latitude))
                    * Math.cos(Math.toRadians(point2.latitude))
                    * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            // This puts the distance in meters
            dist = dist * 1609.34;
            return dist;
        }
    }
}

