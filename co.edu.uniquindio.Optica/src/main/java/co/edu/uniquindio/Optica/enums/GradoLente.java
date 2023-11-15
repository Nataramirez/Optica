package co.edu.uniquindio.Optica.enums;

public enum GradoLente {
    GRADO_025("GRADO_025", 50000), GRADO_050("GRADO_050",50000), GRADO_075("GRADO_075",50000), GRADO_100("GRADO_100",50000),
    GRADO_125("GRADO_125",100000), GRADO_150("GRADO_150",100000), GRADO_175("GRADO_175",100000), GRADO_200("GRADO_200",100000),
    GRADO_225("GRADO_225",150000), GRADO_250("GRADO_250",150000), GRADO_275("GRADO_275",150000), GRADO_300("GRADO_300",150000),
    GRADO_325("GRADO_325",200000), GRADO_350("GRADO_350",200000), GRADO_375("GRADO_375",200000), GRADO_400("GRADO_400",200000),
    GRADO_425("GRADO_425",250000), GRADO_450("GRADO_450",250000), GRADO_475("GRADO_475",250000), GRADO_500("GRADO_500",250000),
    GRADO_525("GRADO_525",300000), GRADO_550("GRADO_550",300000), GRADO_575("GRADO_575",300000), GRADO_600("GRADO_600",300000);

    private String nombre;
    private double precio;

    GradoLente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
