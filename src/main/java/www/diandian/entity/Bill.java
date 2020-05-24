package www.diandian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private Integer id;

    private String sp;

    private Date data;

    private Integer number;

    private Float price;
}