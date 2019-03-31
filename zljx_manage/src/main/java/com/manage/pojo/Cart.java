package com.manage.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
//数据库表名称和类名一致可以省略 @TableName("cart")
public class Cart {
    /**
     * create table cart
     * (
     *    id                   bigint not null,
     *    cart_type            varchar(50) not null,
     *    cart_size            int,
     *    pricture             varchar(500),
     *    created              datetime,
     *    updated              datetime,
     *    primary key (id)
     * );
     *
     */
    @TableId(type = IdType.AUTO) //表示主键自增
    private Long id;
    private String cart_type;
    private Integer cart_size;
    private String picture;
    private Date created;
    private Date updated;
}
