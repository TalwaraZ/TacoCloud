package tacos;
import java.util.List;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class Taco {
    @NotNull
    @Size(min = 5, message = "Ваше имя должно быть больше 5 символов.")
    private String name;

    @NotNull
    @Size(min = 1, message = "Выберете хотябы один ингридиент.")
    private List<Ingredient> ingredients;
}