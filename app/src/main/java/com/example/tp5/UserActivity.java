package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {

    List<Contact> contacts=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        RecyclerView rvContacts=(RecyclerView) findViewById(R.id.rvContacts);

        contacts.add(new Contact("Jean","Pierre","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS--nUrvqVvU-7z69lygDZoe2I36_8Lkw7y7uEbZ_bKJZdiAbedGI2h8Cz7DcrYx6DHYHI&usqp=CAU"));
        contacts.add(new Contact("Jeanne","D'arc","https://static.vecteezy.com/system/resources/previews/001/209/332/original/lion-png.png"));
        contacts.add(new Contact("Pierre","Menez","https://static.vecteezy.com/system/resources/previews/001/199/289/original/lion-png.png"));
        contacts.add(new Contact("Arthur","Rimbaut","https://data.topquizz.com/distant/question/big/1/8/2/4/344281_e9d7b556e5.jpg"));        contacts.add(new Contact("Jean","Pierre","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS--nUrvqVvU-7z69lygDZoe2I36_8Lkw7y7uEbZ_bKJZdiAbedGI2h8Cz7DcrYx6DHYHI&usqp=CAU"));
        contacts.add(new Contact("Jeanne","D'arc","https://static.vecteezy.com/system/resources/previews/001/209/332/original/lion-png.png"));
        contacts.add(new Contact("Pierre","Menez","https://static.vecteezy.com/system/resources/previews/001/199/289/original/lion-png.png"));
        contacts.add(new Contact("Arthur","Rimbaut","https://data.topquizz.com/distant/question/big/1/8/2/4/344281_e9d7b556e5.jpg"));        contacts.add(new Contact("Jean","Pierre","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS--nUrvqVvU-7z69lygDZoe2I36_8Lkw7y7uEbZ_bKJZdiAbedGI2h8Cz7DcrYx6DHYHI&usqp=CAU"));
        contacts.add(new Contact("Jeanne","D'arc","https://static.vecteezy.com/system/resources/previews/001/209/332/original/lion-png.png"));
        contacts.add(new Contact("Pierre","Menez","https://static.vecteezy.com/system/resources/previews/001/199/289/original/lion-png.png"));
        contacts.add(new Contact("Arthur","Rimbaut","https://data.topquizz.com/distant/question/big/1/8/2/4/344281_e9d7b556e5.jpg"));        contacts.add(new Contact("Jean","Pierre","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS--nUrvqVvU-7z69lygDZoe2I36_8Lkw7y7uEbZ_bKJZdiAbedGI2h8Cz7DcrYx6DHYHI&usqp=CAU"));
        contacts.add(new Contact("Jeanne","D'arc","https://static.vecteezy.com/system/resources/previews/001/209/332/original/lion-png.png"));
        contacts.add(new Contact("Pierre","Menez","https://static.vecteezy.com/system/resources/previews/001/199/289/original/lion-png.png"));
        contacts.add(new Contact("Arthur","Rimbaut","https://data.topquizz.com/distant/question/big/1/8/2/4/344281_e9d7b556e5.jpg"));        contacts.add(new Contact("Jean","Pierre","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS--nUrvqVvU-7z69lygDZoe2I36_8Lkw7y7uEbZ_bKJZdiAbedGI2h8Cz7DcrYx6DHYHI&usqp=CAU"));
        contacts.add(new Contact("Jeanne","D'arc","https://static.vecteezy.com/system/resources/previews/001/209/332/original/lion-png.png"));
        contacts.add(new Contact("Pierre","Menez","https://static.vecteezy.com/system/resources/previews/001/199/289/original/lion-png.png"));
        contacts.add(new Contact("Arthur","Rimbaut","https://data.topquizz.com/distant/question/big/1/8/2/4/344281_e9d7b556e5.jpg"));

        ContactsAdapter adapter=new ContactsAdapter(contacts);

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}