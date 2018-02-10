package com.example.user.mapdemo1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class hospitals extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
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
                .title("PVS Memorial Hospital")
                .snippet(" Banerji Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.993364, 76.291374)));

        map.addMarker(new MarkerOptions()
                .title("Lisie Hospital, Kochi")
                .snippet(" Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.988231, 76.288163)));

        map.addMarker(new MarkerOptions()
                .title("Paul's Hospital")
                .snippet(" Vattakkattu Road, Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.988293, 76.29588)));

        map.addMarker(new MarkerOptions()
                .title("Specialists' Hospital")
                .snippet("Opp. North Railway Station, Ernakulam North, Kochi, Kerala 682018")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.990499, 76.285921)));
    }
}
