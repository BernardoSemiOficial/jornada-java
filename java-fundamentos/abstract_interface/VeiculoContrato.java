package abstract_interface;

public interface VeiculoContrato {
    // Atributos não são permitidos em interfaces, apenas constantes (static final)
    // Métodos em interfaces são implicitamente públicos e abstratos

    void ligar(); // Método para ligar o veículo

    void acelerar(); // Método para acelerar o veículo

    void frear(); // Método para frear o veículo

    String getMarca(); // Método para obter a marca do veículo
}
