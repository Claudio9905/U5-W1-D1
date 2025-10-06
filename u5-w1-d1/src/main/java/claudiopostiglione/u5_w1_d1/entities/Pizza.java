package claudiopostiglione.u5_w1_d1.entities;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pizza {
    private String nome;
    private List<String> toppings;
    private double costo;
    private int calorie;


    @Override
    public String toString() {
        return
                "| "+ nome + " (" + toppings + ")    " + " Costo: [" + costo + " €]   " + " Calorie: [" + calorie + "] "
                ;
    }
}
