package execao.personalizadaB.personalizadaA;

public class StringVaziaException extends Exception {

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtribuito) {
        this.nomeDoAtributo = nomeDoAtribuito;
    }

    public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);
    }
}
