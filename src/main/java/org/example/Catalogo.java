import java.util.ArrayList;

public class Catalogo {
    public ArrayList<Computador> computadores = new ArrayList();
    public ArrayList<Notebook> notebooks = new ArrayList();
    public ArrayList<Tablet> tablets = new ArrayList();


    public Catalogo() {

    }

    public Computador agregarComputador(String marca, String memoriaRAM, String memoriaROM, String procesador, String modelo, String anoFabricacion, int precio, String tarjetaDeVideo, String fuenteDePoder, String chasis,
                                        String marcaPantalla, String modeloPantalla, String anoPantalla){
        Computador computador = new Computador(marca, memoriaRAM, memoriaROM, procesador, modelo, anoFabricacion, precio, tarjetaDeVideo, fuenteDePoder, chasis);
        computador.setPantalla(marcaPantalla, modeloPantalla, anoPantalla, computador);
        this.computadores.add(computador);
        return computador;

    }

    public Notebook agregarNotebook(String marca, String memoriaRAM, String memoriaROM, String procesador, String modelo, String anoFabricacion, int precio, String resolucionPantalla, String tipoTeclado, String bateria){
        Notebook notebook = new Notebook(marca, memoriaRAM, memoriaROM, procesador, modelo, anoFabricacion, precio, resolucionPantalla, tipoTeclado, bateria);
        this.notebooks.add(notebook);
        return notebook;

    }

    public Tablet agregarTablet(String marca, String memoriaRAM, String memoriaROM, String procesador, String modelo, String anoFabricacion, int precio, String resolucionPantalla){
        Tablet tablet = new Tablet(marca, memoriaRAM, memoriaROM, procesador, modelo, anoFabricacion, precio, resolucionPantalla);
        this.tablets.add(tablet);
        return tablet;

    }

    public ArrayList<Computador> getComputadores() {
        return computadores;
    }

    public ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public ArrayList<Tablet> getTablets() {
        return tablets;
    }
}