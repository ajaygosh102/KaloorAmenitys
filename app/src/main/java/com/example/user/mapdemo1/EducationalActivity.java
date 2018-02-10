package com.example.user.mapdemo1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class EducationalActivity extends FragmentActivity implements OnMapReadyCallback {

    //private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.educational);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment1 = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapedu);
        mapFragment1.getMapAsync(this);
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
    public void onMapReady(GoogleMap map) {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(9.9943296,76.2920018), 16));

        // You can customize the marker image using images bundled with
        // your app, or dynamically generated bitmaps.
        map.addMarker(new MarkerOptions()
                .title("SMEClabs")
                .snippet("2nd floor, Kaloor Complex, Kaloor, Kochi, Kerala 682017")
              //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
               // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.9943296,76.2920018)));
        map.addMarker(new MarkerOptions()
                .title("IGNOU Regional Centre")
                .snippet("IGNOU Regional Centre\n" +
                        "Kaloor - Kadavanthara Rd\n" +
                        "Kaloor\n" +
                        "Ernakulam, Kerala  682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.992757, 76.292346)));

        map.addMarker(new MarkerOptions()
                .title("Cochin Technical College ")
                .snippet(" Azad Rd, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.993935, 76.295809)));



    }


    }


