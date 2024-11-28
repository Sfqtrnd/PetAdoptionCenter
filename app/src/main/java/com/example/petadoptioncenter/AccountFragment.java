package com.example.petadoptioncenter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AccountFragment extends Fragment {

    public AccountFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.account_fragment, container, false);

        // Set example user data
        TextView nameTextView = view.findViewById(R.id.text_nama);
        TextView emailTextView = view.findViewById(R.id.text_email);
        TextView phoneTextView = view.findViewById(R.id.text_phone);

        nameTextView.setText("Rizka Filardi Toliz");
        nameTextView.setTextSize(18);
        emailTextView.setText("mahrezyaditya@gmail.com");
        emailTextView.setTextSize(18);
        phoneTextView.setText("+62 851-3579-4810");
        phoneTextView.setTextSize(18);

        return view;
    }
}
