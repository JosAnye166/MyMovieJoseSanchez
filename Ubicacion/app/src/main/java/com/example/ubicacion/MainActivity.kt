package com.example.ubicacion

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.tasks.OnSuccessListener
import android.location.LocationRequest as LocationRequest1

class MainActivity : AppCompatActivity() {
    private val permisoFineLocation=android.Manifest.permission.ACCESS_FINE_LOCATION
    private val permisoCoarseLocation=android.Manifest.permission.ACCESS_COARSE_LOCATION

    private val cod_soli_permiso=100

    var fusedLocClient:FusedLocationProviderClient?=null
    var locationRequest: LocationRequest?=null
    var callback:LocationCallback?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fusedLocClient= FusedLocationProviderClient(this)
        initiateLocRequest()



    }
    private fun validarPermisoUbicacion():Boolean{
        val hayUbicacionPrecisa=ActivityCompat.checkSelfPermission(this,permisoFineLocation)==PackageManager.PERMISSION_GRANTED
        val hayUbicacionOrdinaria=ActivityCompat.checkSelfPermission(this,permisoCoarseLocation)==PackageManager.PERMISSION_GRANTED
        return hayUbicacionPrecisa && hayUbicacionOrdinaria


    }
    @SuppressLint("MissingPermission")
    private fun obtenerUbicacion(){
        /* fusedLocClient?.lastLocation?.addOnSuccessListener(this,object:OnSuccessListener<Location>{

             override fun onSuccess(location: Location?) {
                 if(location!=null){
                     Toast.makeText(applicationContext,location?.latitude.toString()+" - "+location?.altitude.toString(),Toast.LENGTH_SHORT).show()
                 }
             }
         })*/
        callback=object:LocationCallback(){
            override fun onLocationResult(locationResult: LocationResult?) {
                super.onLocationResult(locationResult)

                for(ubicacion in locationResult?.locations!!){
                    Toast.makeText(applicationContext,ubicacion.latitude.toString()+" - "+ubicacion.altitude.toString(),Toast.LENGTH_SHORT).show()
                }
            }
        }
        fusedLocClient?.requestLocationUpdates(locationRequest,callback,null)
    }
    private fun initiateLocRequest(){
        locationRequest= LocationRequest()
        locationRequest?.interval=10000
        locationRequest?.fastestInterval=5000
        locationRequest?.priority=LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY
    }
    private fun pedirPermisos(){
        val provideContext = ActivityCompat.shouldShowRequestPermissionRationale(this,permisoFineLocation)
        if(provideContext){
            solicitudPermiso()
        }else{
            solicitudPermiso()
        }
    }
    private fun solicitudPermiso(){
        requestPermissions(arrayOf(permisoFineLocation,permisoCoarseLocation),cod_soli_permiso)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when(requestCode){
            cod_soli_permiso->{
                if(grantResults.size>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    obtenerUbicacion()
                }else{
                    Toast.makeText(this,"No has concedido permiso para acceder a la ubicación",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    private fun detenerActUbicacion(){
        fusedLocClient?.removeLocationUpdates(callback)
    }
    override fun onStart() {
        super.onStart()
        if(validarPermisoUbicacion()){
            obtenerUbicacion()
        }
        else{
            pedirPermisos()
        }

    }

    override fun onPause() {
        super.onPause()
        detenerActUbicacion()
    }
}