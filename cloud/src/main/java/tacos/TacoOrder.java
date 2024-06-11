package tacos;
import java.util.List; import java.util.ArrayList;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
public class TacoOrder {
    @NotBlank(message = "Name not found.")
    private String deliveryName;

    @NotBlank(message = "Street not found.")
    private String deliveryStreet;

    @NotBlank(message = "City not found.")
    private String deliveryCity;

    @NotBlank(message = "State not found.")
    private String deliveryState;

    @NotBlank(message = "Zip code not found.")
    private String deliveryZip;

    @NotBlank(message = "Name not found.")
    @CreditCardNumber(message = "Info CC not found.")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}