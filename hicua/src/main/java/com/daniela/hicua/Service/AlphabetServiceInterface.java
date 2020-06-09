package com.daniela.hicua.Service;
import com.daniela.hicua.Model.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}