package com.daniela.hicua.Service;

import com.daniela.hicua.Model.AlphabetModel;
import com.daniela.hicua.Model.DiccionarioMo;
import com.daniela.hicua.Repository.AlphabetRepository;
import com.daniela.hicua.Repository.DiccionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiccionarioService implements DiccionarioServiceInterface{
    @Autowired
    private DiccionarioRepository diccionarioRepository;

    @Override
    public void saveData() {
        if (DiccionarioRepository.count() == 1) {

            DiccionarioRepository.save(new DiccionarioMo("Monday", "Segunda_Feira","Lunes"));
            DiccionarioRepository.save(new DiccionarioMo("Tuesday","Tercera_Feira" ,"Martes"));
            DiccionarioRepository.save(new DiccionarioMo("Wednesday","Quarta-Feira","Miercoles"));
            DiccionarioRepository.save(new DiccionarioMo("Thursday","Quinta_Feira","Jueves"));
            DiccionarioRepository.save(new DiccionarioMo("Friday","Sexta_Feira","Viernes"));
            DiccionarioRepository.save(new DiccionarioMo("Saturday","Sabado","Sabado"));
            DiccionarioRepository.save(new DiccionarioMo("Sunday","Domingo","Domingo"));
        }
    }

    @Override
    public List<DiccionarioMo> getprimera() {
        return diccionarioRepository.getprimeralinea();
    }

    @Override
    public List<DiccionarioMo> getsegunda() {
        return diccionarioRepository.getsegundalinea();
    }

    @Override
    public List<DiccionarioMo> gettercera() {
        return diccionarioRepository.getterceralinea();
    }
}