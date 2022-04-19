package br.senai.sp.cotia.mynewtodolist.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.senai.sp.cotia.mynewtodolist.R;
import br.senai.sp.cotia.mynewtodolist.databinding.FragmentInicioBinding;


public class InicioFragment extends Fragment {
    private FragmentInicioBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // instanciar binding
        binding = FragmentInicioBinding.inflate(inflater, container, false);

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}