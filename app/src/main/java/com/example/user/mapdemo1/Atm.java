package com.example.user.mapdemo1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Atm extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);
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
    public void onMapReady(GoogleMap map) {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(
                new LatLng(9.994222, 76.290907), 16));

        // You can customize the marker image using images bundled with
        // your app, or dynamically generated bitmaps.
        map.addMarker(new MarkerOptions()
                .title("Axis Bank ATM")
                .snippet("Shamna Towers, Kaloor Kathrikadavu Road, South Kaloor, Kaloor, Ernakulam, Kerala 68201")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.994222, 76.290907)));
        map.addMarker(new MarkerOptions()
                .title("Federal Bank ATM")
                .snippet("Syda Building, Kaloor - Kadavanthara Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995532, 76.292266)));


        map.addMarker(new MarkerOptions()
                .title("Union Bank of India ATM")
                .snippet(" Banerji Rd, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995432, 76.292284)));


        map.addMarker(new MarkerOptions()
                .title("Union Bank ATM")
                .snippet("Pipeline Rd, Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995432, 76.292284)));



        map.addMarker(new MarkerOptions()
                .title("State Bank ATM")
                .snippet(" Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.999179, 76.290828)));


        map.addMarker(new MarkerOptions()
                .title("Andhra Bank ATM")
                .snippet("Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.990366, 76.29436)));

        map.addMarker(new MarkerOptions()
                .title("Axis Bank ATM")
                .snippet("Ground Floor, Penta Tower, Kaloor, Ernakulam, Kochi, Kerala 682015")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.994222, 76.290907)));

        map.addMarker(new MarkerOptions()
                .title("Bank of Baroda ATM")
                .snippet(" Pariyath Building, Kumaranasan Junction Kaloor Kadavanthara Road Kaloor (PO) Ernakulam, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.989426, 76.2947)));

        map.addMarker(new MarkerOptions()
                .title("Federal Bank ATM & CDM")
                .snippet("Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.992644, 76.292889)));

        map.addMarker(new MarkerOptions()
                .title("Dhanlaxmi Bank ATM")
                .snippet("M E S Cultural Complex Building Ground Floor Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995061, 76.291841)));

    }


}
