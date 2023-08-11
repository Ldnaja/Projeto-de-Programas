public class VeiculoExemplo {
    private String marca;
    private String modelo;
    private int ano;
    
    public VeiculoExemplo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public VeiculoExemplo(String marca, String modelo) {
        this(marca, modelo, 0);  // Chamando o outro construtor com um valor padrão para o ano
    }
    
    public VeiculoExemplo(String marca) {
        this(marca, "Desconhecido");  // Chamando o segundo construtor com um valor padrão para o modelo
    }
    
    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
    
    public static void main(String[] args) {
        VeiculoExemplo veiculo1 = new VeiculoExemplo("Toyota", "Corolla", 2020);
        VeiculoExemplo veiculo2 = new VeiculoExemplo("Honda", "Civic");
        VeiculoExemplo veiculo3 = new VeiculoExemplo("Ford");
        
        veiculo1.mostrarInformacoes();
        System.out.println();
        veiculo2.mostrarInformacoes();
        System.out.println();
        veiculo3.mostrarInformacoes();
    }
}
