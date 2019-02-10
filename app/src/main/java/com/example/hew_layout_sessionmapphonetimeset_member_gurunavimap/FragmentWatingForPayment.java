package com.example.hew_layout_sessionmapphonetimeset_member_gurunavimap;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentWatingForPayment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.waitingforpay_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//
//        ListView mlistView =(ListView) view.findViewById(R.id.waitingforpay_id);
//
//        // データを準備
//        ArrayList<String> items = new ArrayList<>();
//        for(int i = 0; i < 30; i++) { }
//
//        // Adapter - ArrayAdapter
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this.getContext(),
//                R.layout.session_text,
//                items
//        );
//
//        // ListViewに表示;
//        mlistView.setAdapter(adapter);

    }
}
