package primerParcial_Acker1.ej5;

public class NumberExpression extends OperacionMatematica {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.multiplicacion=true;
            context.input=context.input.substring(1);
        }
    }
}
