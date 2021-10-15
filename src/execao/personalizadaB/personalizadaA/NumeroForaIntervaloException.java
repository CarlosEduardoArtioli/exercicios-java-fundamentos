package execao.personalizadaB.personalizadaA;

public class NumeroForaIntervaloException extends Exception {

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtribuito) {
        this.nomeDoAtributo = nomeDoAtribuito;
    }

    public String getMessage() {
        return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
    }
}
