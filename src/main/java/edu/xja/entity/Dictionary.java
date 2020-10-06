package edu.xja.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * (Dictionary)实体类
 *
 * @author makejava
 * @since 2020-07-26 17:28:53
 */
@Data
@ApiModel("字典实体类")
public class Dictionary implements Serializable {
    private static final long serialVersionUID = 733648344358457935L;
    /**
     * 主键，自增长
     */
    @ApiModelProperty("主键")
    private Integer id;
    /**
     * 数据字典类型
     */
    @NotNull(message = "{dictionary.dictType.notNull}")
    @ApiModelProperty("字典类型")
    private String dictType;
    /**
     * 名称或者标签
     */
    @NotNull(message = "{dictionary.dictName.notNull}")
    @ApiModelProperty("字典名称")
    private String dictName;
    /**
     * 字典值
     */
    @NotNull(message = "{dictionary.dictValue.notNull}")
    @ApiModelProperty("字典值")
    private String dictValue;
    /**
     * 是否可用,0可用，1不可用
     */
    @ApiModelProperty(value = "是否可用", notes = "0为可用，1为不可用")
    //@Length(max = 1, min = 1, message = "{dictionary.enable.notNull}")
    private Integer enabled;
    /**
     * 排序
     */
    @ApiModelProperty("排序")
    private Integer sort;
    /**
     * 描述，备注也可以填到这里
     */
    @ApiModelProperty("描述")
    private String description;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    /**
     * 创建用户,引用用户表的用户名
     */
    @ApiModelProperty("创建人")
    private String creator;
    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private LocalDateTime operateTime;
    /**
     * 修改用户，引用用户表的用户名
     */
    @ApiModelProperty("修改人")
    private String operator;
    /**
     * 删除标识，缺省值0,0为未删除，1为已删除
     */
    @ApiModelProperty(value =  "删除标识", notes = "0为未删除，1为删除")
    //@Length(max = 1, min = 1, message = "{dictionary.enable.notNull}")
    private Integer deleteFlag;


}