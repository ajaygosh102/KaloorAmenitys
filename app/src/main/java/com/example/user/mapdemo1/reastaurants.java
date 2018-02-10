package com.example.user.mapdemo1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class reastaurants extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reastaurants);
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
                .title("Meenus Family Restaurant")
                .snippet(" Banerji Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.994370, 76.291105)));

        map.addMarker(new MarkerOptions()
                .title("Nostalgia Restaurant")
                .snippet(" Near Park Central, Kaloor Kadavanthara Road, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.990890, 76.293702)));

        map.addMarker(new MarkerOptions()
                .title("Mubaraq Restaurant")
                .snippet("Banerji Rd, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.996190, 76.293486)));

        map.addMarker(new MarkerOptions()
                .title("The Hot Spot")
                .snippet("Kaloor- Kadavanthara Road, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.985108, 76.295765)));

        map.addMarker(new MarkerOptions()
                .title("The Soup Shop")
                .snippet("CJ towers, Near Pauls hospital, Vattakkattu Road, Kathrikadavu, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.988370, 76.295594)));

        map.addMarker(new MarkerOptions()
                .title("Pappadavada")
                .snippet("Kaloor - Kadavanthara Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.994476, 76.292378)));


    }
}
