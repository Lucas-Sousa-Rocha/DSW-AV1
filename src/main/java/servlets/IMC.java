package servlets;

public class IMC {
    private Double altura;
    private Double peso;
    private Double valor;
    private String resultado;

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void calcularIMC() {
      
        if (altura != null && peso != null && altura > 0) {
           
            valor = peso / (altura * altura);

            
            if (valor < 18.5) {
                resultado = "Abaixo do peso"; // IMC menor que 18.5
            } else if (valor < 25) {
                resultado = "Peso normal"; // IMC entre 18.5 e 24.9
            } else if (valor < 30) {
                resultado = "Sobrepeso"; // IMC entre 25 e 29.9
            } else {
                resultado = "Obesidade"; // IMC 30 ou maior
            }
        } else {
            resultado = "Dados inválidos";
        }
    }

}
