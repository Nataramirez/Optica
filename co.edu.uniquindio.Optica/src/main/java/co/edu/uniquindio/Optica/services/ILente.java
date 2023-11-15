package co.edu.uniquindio.Optica.services;

import co.edu.uniquindio.Optica.enums.Filtro;
import co.edu.uniquindio.Optica.enums.Montura;
import co.edu.uniquindio.Optica.model.Diagnostico;

public interface ILente {
    public boolean crearLente(Diagnostico diagnostico, Montura montura, Filtro filtro);
}
