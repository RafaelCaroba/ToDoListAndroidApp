package br.senai.sp.cotia.mynewtodolist.fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import java.util.Calendar;

import br.senai.sp.cotia.mynewtodolist.R;
import br.senai.sp.cotia.mynewtodolist.databinding.FragmentCadTarefaBinding;

public class CadTarefaFragment extends Fragment {
    private FragmentCadTarefaBinding binding;


    // var para o datepicker
    DatePickerDialog datePicker;

    // var para dia, mes e ano
    int year, month, day;

    // var para data atual
    Calendar dataAtual;

    // var para data formatada
    String dataEscolhida;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // instanciar binding
        binding = FragmentCadTarefaBinding.inflate(inflater, container, false);

        // instanciar a data atual
        dataAtual = Calendar.getInstance();

        //descobrir dia, mes e ano
        year = dataAtual.get(Calendar.YEAR);
        month = dataAtual.get(Calendar.MONTH);
        day = dataAtual.get(Calendar.DAY_OF_MONTH);

        datePicker = new DatePickerDialog(getContext(), (view, ano, mes, dia) -> {
            // cai aqui to vez que o ok do datepicker é clicado

        }, year, month, day);

        // listener do botão de data
        binding.btData.setOnClickListener(v -> {
            // abre o datepicker
            datePicker.show();
        });

        // retorna view raiz do binding
        return binding.getRoot();
    }
}