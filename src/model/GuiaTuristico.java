package model;

public class GuiaTuristico extends Persona{

    private String idioma;

    public GuiaTuristico(){

    }

    public GuiaTuristico(String nombre, String rut, Direccion direccion, String idioma){
        super(nombre, rut, direccion);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "idioma='" + idioma + '\'' +
                '}';
    }
}
