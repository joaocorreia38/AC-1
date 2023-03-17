public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("vermelho", "sedan", 350);
        carro.ligar();
        carro.acelerar(50);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Marcha atual: " + carro.pegarMarcha());
        carro.acelerar(60);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Marcha atual: " + carro.pegarMarcha());
        carro.acelerar(100);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
        System.out.println("Marcha atual: " + carro.pegarMarcha());
    }
}