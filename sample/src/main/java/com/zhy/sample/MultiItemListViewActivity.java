package com.zhy.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.zhy.adapter.abslistview.CommonAdapter;
import com.zhy.sample.adapter.lv.ChatAdapter;
import com.zhy.sample.bean.ChatMessage;

public class MultiItemListViewActivity extends AppCompatActivity {

    private ListView mListView;
    private ChatAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mListView = (ListView) findViewById(R.id.id_listview_list);
        mListView.setDivider(null);
        mListView.setAdapter(mAdapter = new ChatAdapter(this, ChatMessage.MOCK_DATAS));

    }

}
