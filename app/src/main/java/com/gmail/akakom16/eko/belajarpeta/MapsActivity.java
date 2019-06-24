package com.gmail.akakom16.eko.belajarpeta;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
//TODO 1 : Yaitu program diatas adalah package yang sudah tersedia dilam class java dan kita tinggal memenggil package tersebut
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    //TODO 2 : Yaitu program diatas adalah perintah untuk mendeklarasikan variabel apa saja yang ada di class xml dan mendeklarasikan variabel baru
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        //TODO 3 : Yaitu program diatas mendeklarasikan method oncreat yaitu untuk ketika aplikasi pertama di ajalankan dengan menagmbil dari class xml
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //TODO 4 : Yaitu program diatas memanggil variabel yang sudah dideklarasikan dengan mengambil nilai dari class R dan mengansencronus dari server
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
//TODO 5 : Yaitu program diatas mendeklarasikan variabel nMap denan mengambil nilai dari googleMap
        // Add a marker in Sydney and move the camera'
        LatLng akakom = new LatLng(-7.7927441, 110.4061663);
        mMap.addMarker(new MarkerOptions().position(akakom).title("STMIK AKAKOM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(akakom));
        //TODO 6 : Yaitu program diatas mendeklarasikan titi yang detentukan dengan menuliskan bujur lintang dari titil lokasi tersebut yaitu dengan nama STMIK AKAKOM
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        Toast.makeText(getApplicationContext(),"Kustomisasi Type Hybrid Dipilih", Toast.LENGTH_SHORT).show();
        //TODO 7 : Yaitu program diatas mendeklarasikan tipe map yang kita gunakan yaitu dengan menggunakan tipe hybrid .
    }
}
