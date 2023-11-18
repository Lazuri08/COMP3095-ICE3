package ca.gbc.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(value = "product") //mongo tables are called documents
public class Product {

    @Id //makes Id a primary key
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}

