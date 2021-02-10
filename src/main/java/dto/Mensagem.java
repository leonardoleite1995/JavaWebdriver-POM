package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openqa.selenium.By;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mensagem {
    private String msg;
    private By locator;
}