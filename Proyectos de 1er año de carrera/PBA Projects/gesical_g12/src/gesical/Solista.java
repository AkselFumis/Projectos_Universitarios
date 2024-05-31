package gesical;



public class Solista extends Musico {

    private String apellido;
    private String nombre;
    private String nacionalidad;
    private Instrumento instrumento;

    public Solista(String apellido, String nombre, String nacionalidad, Instrumento instrumento, String generoMusical, int añoInicio, String discografica) {
        super(generoMusical, añoInicio, discografica);
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.instrumento = instrumento;
    }

    public Solista(String apellido, String nombre, String nacionalidad, String generoMusical, int añoInicio, String discografica) {
        super(generoMusical, añoInicio, discografica);
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
   

    

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    

    @Override
    public void agregarDisco(Disco a) {
        this.listaDiscos.add(a);
    }

    @Override
    public void eliminarDisco(Disco a) {
        this.listaDiscos.remove(a);
    }

    @Override
    public String toString() {
        return "Solista{" + "Apellido: " + apellido + ", Nombre: " + nombre +", Discografia: "+discografica+'}';
    }
    
    @Override
    public void listarDisco() {
        System.out.println(this.listaDiscos);
    }

    

}
