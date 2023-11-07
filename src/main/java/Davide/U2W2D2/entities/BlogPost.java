package Davide.U2W2D2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private long id;
    private Categoria categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;
}
