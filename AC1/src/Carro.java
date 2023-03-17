public class Carro {
    //atributos
     String cor;
     String modelo;
     int velocidadeAtual;
     int velocidadeMaxima;
     Motor motor;
    
    public Carro(String cor, String modelo, int velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.motor = new Motor(200, "alcool");
    }
    
    public void ligar() {
        System.out.println("O carro está ligado");
    }
    
    public void acelerar(int quantidade) {
        if (this.velocidadeAtual + quantidade > this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeMaxima;
        } else {
            this.velocidadeAtual += quantidade;
        }
    }
    
    public int pegarMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        } else if (this.velocidadeAtual < 40) {
            return 1;
        } else if (this.velocidadeAtual < 80) {
            return 2;
        } else {
            return 3;
        }
    }


}

