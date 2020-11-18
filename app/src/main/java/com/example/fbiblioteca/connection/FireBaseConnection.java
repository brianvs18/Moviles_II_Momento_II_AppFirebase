package com.example.fbiblioteca.connection;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FireBaseConnection {
    private static FirebaseAuth mAuth;

    //private static StorageReference mStorageRef;
    private static FirebaseStorage firebaseStorage;

    private static FirebaseFirestore db;


    public static FirebaseAuth ConnectionAuth(){
        return mAuth = FirebaseAuth.getInstance();
    }
    /*
    public static StorageReference ConnectionStorage(){
        return mStorageRef = FirebaseStorage.getInstance().getReference();
    }
    */
    public static FirebaseFirestore ConnectionFirestore(){
        return db = FirebaseFirestore.getInstance();
    }

    public static FirebaseStorage ConnectionStorage(){
        return firebaseStorage = FirebaseStorage.getInstance();
    }
}
