public class CarroMain {
    public static void main(String[] args){
        Proprietario prop = new Proprietario();
        Placa placa = new Placa();
        Motor motor = new Motor();
        String marca = "DeLorean";
        String modelo = "DMC/12";
        Carro car = new Carro(marca, modelo, prop, placa, motor);

        System.out.println(car.getDescricao());
    }
}
