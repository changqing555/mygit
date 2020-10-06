package edu.xja.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * (City)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:52
 */
@Data
@ApiModel("城市实体类")
public class City implements Serializable {
    private static final long serialVersionUID = 860821400362348947L;
    /**
     * 主键 自增长
     */
    @ApiModelProperty(value = "主键")
    private Integer id;
    /**
     * 城市名称
     */
    //@NotNull(message = "{city.cityname.notnull}")
    @ApiModelProperty(value = "城市名称")
    private String cityName;
    /**
     * 城市名称拼音
     */
    @ApiModelProperty(value = "城市名称拼音")
    private String cityNameSpell;
    /**
     * 城市首字母
     */
    @ApiModelProperty(value = "城市名称首字母")
    //@NotNull(message = "{city.cityInitial.notnull}")
    //@Length(max = 1, min = 1, message = "{city.cityInitial.size}")
    private String cityInitial;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "城市创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "修改日期")
    private LocalDateTime operateTime;

    @ApiModelProperty(value = "修改人")
    private String operator;

    @ApiModelProperty(value = "是否删除，1为删除，0为未删除")
    private Integer deleteFlag;


}