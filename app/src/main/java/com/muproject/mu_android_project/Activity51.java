package com.muproject.mu_android_project;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Activity51 extends AppCompatActivity implements LocationListener {

    private TextView tvLocation;
    private LocationManager locationManager;
    private static final int LOCATION_PERMISSION_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_51);

        tvLocation = findViewById(R.id.tvLocation);
        Button btnGetLocation = findViewById(R.id.btnGetLocation);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        btnGetLocation.setOnClickListener(v -> {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, LOCATION_PERMISSION_CODE);
            } else {
                locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, this);
                Toast.makeText(this, "Requesting Location...", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        tvLocation.setText("Latitude: " + location.getLatitude() + "\nLongitude: " + location.getLongitude());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == LOCATION_PERMISSION_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, this);
                }
            } else {
                Toast.makeText(this, "Permission denied!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
