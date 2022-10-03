package Senai.Trabalho.funcoes;

import java.util.Calendar;

public class horas {
    int hr;
    public int  getHr(){
        Calendar time = Calendar.getInstance();
        hr = time.PM;
        return hr;
    }
}
