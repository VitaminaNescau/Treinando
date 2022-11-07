<?php
/*
O aluno joão tirou as notas 5,7,8 onde a média da escola é 6, a média para conselho de classe é 4. Verifique a média final do aluno e o status de aprovação

student = joão 
value1 = 5
value2 = 7
value3 = 8
average = (value1+value2+value3)/3
if average >= 6
    joão está aprovado
else if average >= 4
    joão foi para o conselho 
else
    joão está reprovado
    */
    $student = "João";
    $value1 = 5;
    $value2 = 4;
    $value3 = 1;
    $average = ($value1+$value2+$value3)/3;
    if ($average >= 6) {
        echo "Aprovado";
    } elseif ($average >= 4){
        echo "Foi para o conselho de classe";

    }else{
        echo "Reprovado";

    }
    
?>