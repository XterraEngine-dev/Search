package cifuentes.engine.xterra.searchinflator;

/**
 * Created by Fernando on 22/08/2016.
 */
public class Categoria {
    private String titulo;
    private String subtitulo;
    private String id;
    private int imagen;

    /**
     * @param titulo
     * @param subtitulo
     * @param imagen
     */
    public Categoria(String titulo, String subtitulo, String id, int imagen) {
        super();
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.id = id;
        this.imagen = imagen;
    }

    /**
     * @return titulo, subtitulo, imagen
     */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String id) {
        this.id = id;
    }

    public String getId() {
        return subtitulo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
