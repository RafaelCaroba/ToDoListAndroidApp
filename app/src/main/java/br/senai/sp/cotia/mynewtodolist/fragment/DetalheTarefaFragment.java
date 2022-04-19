package br.senai.sp.cotia.mynewtodolist.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.senai.sp.cotia.mynewtodolist.R;
import br.senai.sp.cotia.mynewtodolist.databinding.FragmentDetalheTarefaBinding;


public class DetalheTarefaFragment extends Fragment {
    private FragmentDetalheTarefaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // instanciar binding
        binding = FragmentDetalheTarefaBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}