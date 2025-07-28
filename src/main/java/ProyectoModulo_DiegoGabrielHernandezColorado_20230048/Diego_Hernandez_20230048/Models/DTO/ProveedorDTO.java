package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @EqualsAndHashCode
@Getter @Setter
public class ProveedorDTO {

    private Long ProviderId;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 50, message = "El nombre no puede exceder los 50 caracteres")
    private String  ProviderName;


    @NotBlank(message = "El telefono es obligatorio")
    @Size(max = 25, message = "El telefono no puede exceder los 25 caracteres")
    private String ProviderPhone;

    @NotBlank(message = "La dirrecion es obligaoria")
    @Size(max = 128, message = "La direccion no puede exceder los 128 caracteres")
    private String ProviderAddress;

    @Email(message = "Debe ser un correo valido")
    @Size(max = 100, message = "El email no puede exceder los 100 caracteres")
    private String ProviderEmail;

    @Size(max = 35 ,message = "El codigo no puede exceder los 35 caracteres")
    private String ProviderCode;

    private Integer ProviderStatus = 1;

    @Size(max = 256, message = "Los comentarios no pueden exceder los 256 caracteres")
    private String ProviderComments;
}
