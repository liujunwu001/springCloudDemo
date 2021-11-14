package com.ljw.springcloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PaymentDo implements Serializable {
    private static final long serializableUID = PaymentDo.class.hashCode();
    /**
     * id
     */
    private Long id;

    /**
     * serial
     */
    private String serial;

    /**
     * 添加人
     */
    private String addBy;
    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private java.util.Date updateTime;

    /**
     * 创建时间
     */
    private java.util.Date createTime;
}
