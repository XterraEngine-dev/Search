package cifuentes.engine.xterra.searchinflator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fernando on 22/08/2016.
 */
public class AdaptadorCategoria extends BaseAdapter {
    private ArrayList<Categoria> categoria;
    LayoutInflater inflater;
    Context contexto;

    /**
     * @param cat
     * @param con
     */
    public AdaptadorCategoria(ArrayList<Categoria> cat, Context con) {
        this.categoria = cat;
        inflater = LayoutInflater.from(con);
        this.contexto = con;
    }

    /**
     * @return size y position
     */
    @Override
    public int getCount() {
        return categoria.size();
    }

    @Override
    public Object getItem(int position) {
        return categoria.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * @param position
     * @param convertView
     * @param parent
     * @return converView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.adaptador_lista, null);
        Categoria cat = categoria.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView titulo = (TextView) convertView.findViewById(R.id.titulo);
        TextView subtitulo = (TextView) convertView.findViewById(R.id.subtitulo);

        img.setBackgroundResource(cat.getImagen());
        titulo.setText(cat.getTitulo());
        subtitulo.setText(cat.getSubtitulo());

        return convertView;
    }
}
