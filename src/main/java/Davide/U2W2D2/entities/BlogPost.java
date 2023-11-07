package Davide.U2W2D2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BlogPost {
    private long id;
    private Categoria categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPost(Categoria categoria, String titolo, String cover, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
