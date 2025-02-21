package lk.ijse.gdse.supermarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * @Date 2/21/2025
 * @Project Supermarket-72
 * --------------------------------------------
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "item_id")
    private String id;

    private String name;
    private int quantity;

    @Column(precision = 10, scale = 2) // 0000000000.00 - format, 100 -> 100.00
    private BigDecimal price;

}
