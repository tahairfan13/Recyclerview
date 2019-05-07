package com.example.tahaali.recyclerview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.tahaali.recyclerview.Adapter.recyclerViewAdapter;
import com.example.tahaali.recyclerview.model.Person;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    recyclerViewAdapter recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        final List<Person> list=populateRecyclerViewDUMMY_DATA();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter=new recyclerViewAdapter(list,this);
        recyclerView.setAdapter(recyclerViewAdapter);


    }

    public List<Person> populateRecyclerViewDUMMY_DATA()
    {
        List<Person> dummyData=new ArrayList<>();
        // MAKING MODEL CLASS OBJECTS TO POPULATE THE RecyclerView
        Person P1=new Person();
        P1.setName("Taha");
        P1.setAge(24);
        P1.setDOB("13/10/1993");

        dummyData.add(P1);

        Person P2=new Person();
        P2.setName("Tallal");
        P2.setAge(22);
        P2.setDOB("10/10/1995");

        dummyData.add(P2);

        Person P4=new Person();
        P4.setName("Sarmad");
        P4.setAge(18);
        P4.setDOB("13/10/1993");

        dummyData.add(P4);

        Person p4=new Person();
        P4.setName("Haad");
        P4.setAge(19);
        P4.setDOB("8/8/1998");

        dummyData.add(p4);

        Person P5=new Person();
        P5.setName("Mobeen");
        P5.setAge(17);
        P5.setDOB("13/10/1993");

        dummyData.add(P5);

        Person P6=new Person();
        P6.setName("Taha");
        P6.setAge(24);
        P6.setDOB("13/10/1993");

        dummyData.add(P6);

        Person P7=new Person();
        P7.setName("Haad");
        P7.setAge(19);
        P7.setDOB("8/8/1998");

        dummyData.add(P7);

        Person P8=new Person();
        P8.setName("Mobeen");
        P8.setAge(17);
        P8.setDOB("13/10/1993");

        dummyData.add(P8);

        Person P9=new Person();
        P9.setName("Taha");
        P9.setAge(24);
        P9.setDOB("13/10/1993");

        dummyData.add(P9);

        Person P10=new Person();
        P7.setName("Haad");
        P7.setAge(19);
        P7.setDOB("8/8/1998");

        dummyData.add(P7);

        Person P11=new Person();
        P8.setName("Mobeen");
        P8.setAge(17);
        P8.setDOB("13/10/1993");

        dummyData.add(P8);

        Person P12=new Person();
        P9.setName("Taha");
        P9.setAge(24);
        P9.setDOB("13/10/1993");

        dummyData.add(P9);



        // Data Population Finished

        return dummyData;
    }


}
