package com.mrhi2020.ex28recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import static androidx.recyclerview.widget.LinearLayoutManager.*;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items= new ArrayList<>();
    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //대량의 데이터 추가작업
        items.add( new Item("전과목학원", "학생 모집합니다.",R.drawable.studygroup01)  );
        items.add( new Item("수학 전문학원", "수학 성적 보장합니다.")  );
        items.add( new Item("영어 전문학원", "글로벌 시대 영어가 꼭필요합니다.")  );
        items.add( new Item("입시학원", "입시전문학원입니다. 상담필요하시면 연락주세요")  );
        items.add( new Item("수시 전문학원", "수시 전문학원 입니다.")  );
        items.add( new Item("수학 전문학원", "학생 모집합니다.")  );
        items.add( new Item("영어 전문학원", "수학 성적 보장합니다.")  );
        items.add( new Item("입시학원", "입시전문학원입니다. 상담필요하시면 연락주세요")  );
        items.add( new Item("수시 전문학원", "수시 전문학원 입니다.")  );
        items.add( new Item("전과목학원", "학생 모집합니다.")  );

        recyclerView= findViewById(R.id.recycler);
        adapter= new MyAdapter(this, items);
        recyclerView.setAdapter(adapter);

        //리사이클러뷰의 아이템을 클릭하는 것을 듣는 리스너는
        //존재하지 않음!!!
        //불편하지만 itemView 마다 클릭리스너를 설정해야 하기에
        //MyAdapter 에서 작업해야만 함.
    }
}