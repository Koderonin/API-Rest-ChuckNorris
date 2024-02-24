package es.iesclaradelrey.da2d1a.psp.chucknorris.clienterest.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ChuckJoke {
    private String[] categories;
    private String created_at;
    private String icon_url;
    private String id;
    private String updated_at;
    private String url;
    private String value;
}
