package contas;

public class SeguroVida {
	
    public static void calcularTributo(double valorSegurado) {
        valorSegurado = valorSegurado * 0.80; 
        System.out.println("Seguro de vida contratado no valor de " + valorSegurado);
    }

}
