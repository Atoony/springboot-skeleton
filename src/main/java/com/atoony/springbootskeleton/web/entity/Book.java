package com.atoony.springbootskeleton.web.entity;

import java.math.BigDecimal;

import com.atoony.springbootskeleton.config.valid.EntityAddValid;
import com.atoony.springbootskeleton.config.valid.EntityEditValid;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * <p>
 *
 * </p>
 *
 * @author Atoony
 * @since 2020-05-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @NotNull(groups = {EntityEditValid.class}, message = "请提供id")
    private Long id;

    @NotEmpty(groups = {EntityAddValid.class, EntityEditValid.class}, message = "请提供书名")
    private String name;

    @NotNull(groups = {EntityAddValid.class, EntityEditValid.class}, message = "请提供价格")
    private Double price;

    private String description;


}
