package com.example.user.mapdemo1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class banks extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks);
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
                .title("ICICI Bank")
                .snippet("Naduparambil Building, Kaloor - Kadavanthara Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.992437, 76.292614)));

        map.addMarker(new MarkerOptions()
                .title("Canara Bank")
                .snippet("1st Floor, Guru Madhavendra Tower, Kaloor - Kadavanthara Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.993185, 76.292763)));

        map.addMarker(new MarkerOptions()
                .title("Federal Bank")
                .snippet("Syda Building, Kaloor - Kadavanthara Road, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.992600, 76.29294)));

        map.addMarker(new MarkerOptions()
                .title("Axis Bank")
                .snippet(" Kaloor - Kadavanthara Rd, Kathrikadavu, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.987717, 76.295617)));

        map.addMarker(new MarkerOptions()
                .title("Catholic Syrian Bank")
                .snippet("Pavakkulam Chambers, No. 36/2289 B, Azad Rd, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.997634, 76.294828)));

        map.addMarker(new MarkerOptions()
                .title("Punjab National Bank")
                .snippet(" Kassin Building, Sebastian Rd, Kaloor, Kochi, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.991131, 76.292487)));

        map.addMarker(new MarkerOptions()
                .title("State Bank of India")
                .snippet("Banerji Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.999050, 76.297662)));

        map.addMarker(new MarkerOptions()
                .title("Axis Bank ATM")
                .snippet("Shamna Towers, Kaloor Kathrikadavu Road, South Kaloor, Kaloor, Ernakulam, Kerala 68201")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.994222, 76.290907)));

        map.addMarker(new MarkerOptions()
                .title("Ernakulam District Co-operative Bank Kaloor Branch")
                .snippet("Banerji Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995623, 76.293089)));

        map.addMarker(new MarkerOptions()
                .title("Dhanlaxmi Bank")
                .snippet("M E S Cultural Complex Building, Ground Floor, Banerji Rd, Kaloor, Ernakulam, Kerala 682017")
                //  .icon(bitmapDescriptorFromVector(getActivity(), R.drawable.your_vector_asset))
                // .icon(BitmapDescriptorFactory.fromResource(R.drawable.edu))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .position(new LatLng(9.995029, 76.291814)));
    }
}
