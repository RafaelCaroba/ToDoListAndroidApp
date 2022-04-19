package br.senai.sp.cotia.mynewtodolist.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.senai.sp.cotia.mynewtodolist.R;
import br.senai.sp.cotia.mynewtodolist.databinding.FragmentCadSubTarefaBinding;


public class CadSubTarefaFragment extends Fragment {
    private FragmentCadSubTarefaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // instanciar binding
        binding = FragmentCadSubTarefaBinding.inflate(inflater, container, false);

        // retorna a view raiz do binding
        return binding.getRoot();
    }
}