package com.example.recyclerpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsRecView = findViewById(R.id.contactsRecView);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Aaryaman", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Omansh", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Priya", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Vivek", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Cheryl", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Aaryaman", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Omansh", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Priya", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Vivek", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Cheryl", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Aaryaman", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Omansh", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Priya", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Vivek", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        contacts.add(new Contact("Cheryl", "aaryaman@gmail.com", "https://cdn.theatlantic.com/thumbor/CtrkkbDqPJDMFW3snBaD42ed7VA=/289x408:3287x1982/960x504/media/img/mt/2016/09/original-2/original.jpg"));
        ContactsRecViewAdapter  adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);
        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}