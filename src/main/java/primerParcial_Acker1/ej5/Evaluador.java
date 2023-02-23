package primerParcial_Acker1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private List<OperacionMatematica> operacion = new ArrayList<>();
    private Context context;

    public Evaluador(String operacionOriginal){
        context = new Context(operacionOriginal.replace(" ",""));
        for (String msg:operacionOriginal.split(" ")){
            switch (msg) {
                case "+" -> operacion.add(new Suma());
                case "*" -> operacion.add(new Multiplicacion());
                default -> operacion.add(new NumberExpression());
            }
        }
    }

    public int evaluarOperacion(){
        for (OperacionMatematica operacionMatematica:operacion){
            operacionMatematica.interpreter(context);
        }
        return context.output;
    }
}
