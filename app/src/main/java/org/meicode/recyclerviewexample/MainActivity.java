package org.meicode.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Margot Robbie", "Marot@gmail.com", "https://gal.img.pmdstatic.net/fit/http.3A.2F.2Fprd2-bone-image.2Es3-website-eu-west-1.2Eamazonaws.2Ecom.2Fgal.2F2018.2F02.2F13.2F74e12f90-d9b5-496b-84ad-702377147d48.2Ejpeg/480x480/quality/80/margot-robbie-heureuse-mariee-tom-et-moi-pouvons-tout-affronter.jpg"));
        contacts.add(new Contact("Cillian Murphy", "Cillian@gmail.com", "https://filmschoolrejects.com/wp-content/uploads/2018/01/cillian-murphy-feature-700x525.jpg"));
        contacts.add(new Contact("Saoirse Ronan", "Saoirse@gmail.com", "https://static1.purepeople.com/articles/5/31/59/95/@/4477370-saoirse-ronan-lors-d-un-photocall-pour-l-950x0-1.jpg"));
        contacts.add(new Contact("Emma Watson", "Emma@gmail.com", "https://img-4.linternaute.com/oG52YvTwtPTDvcMCRfK_q04_ehs=/992x/smart/570ed26dfc67454e9485657f3bf0c89f/ccmcms-linternaute/10269412-31.jpg"));
        contacts.add(new Contact("Cristian Bale", "Cristial@gmail.com", "https://i.pinimg.com/originals/4c/c6/f1/4cc6f1f365fce288fcae170fa17b6875.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
