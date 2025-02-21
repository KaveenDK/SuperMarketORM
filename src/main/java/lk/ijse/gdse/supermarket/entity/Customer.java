package lk.ijse.gdse.supermarket.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * --------------------------------------------
 * @Author Dimantha Kaveen
 * @GitHub: https://github.com/KaveenDK
 * @Date 2/21/2025
 * @Project Supermarket-72
 * --------------------------------------------
 **/

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table (name = "customer")
public class Customer {
    @Id
    @Column(name = "cus_id")
    private String id;

    private String name;
    private String email;
    private String nic;
    private String phone;
}
