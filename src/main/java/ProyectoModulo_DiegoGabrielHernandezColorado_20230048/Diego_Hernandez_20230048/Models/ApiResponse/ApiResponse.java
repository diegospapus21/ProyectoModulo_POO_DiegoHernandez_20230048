package ProyectoModulo_DiegoGabrielHernandezColorado_20230048.Diego_Hernandez_20230048.Models.ApiResponse;

import lombok.Data;

@Data
public class ApiResponse <t>{
    private String status;
    private t Data;
    private String message;

    public ApiResponse(String status, t data){
        this.status = status;
        this.data = data;
    }

    public ApiResponse(String status, String message){
        this.status = status;
        this.message = message;
    }
}
