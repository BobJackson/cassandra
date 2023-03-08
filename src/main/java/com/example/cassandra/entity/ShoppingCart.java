package com.example.cassandra.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Data
@Table("shopping_cart")
public class ShoppingCart {
    @Id
    @Column("userid")
    private String userId;
    @Column("item_count")
    private Integer itemCount;
    @Column("last_update_timestamp")
    private Date lastUpdateTimestamp;
}
