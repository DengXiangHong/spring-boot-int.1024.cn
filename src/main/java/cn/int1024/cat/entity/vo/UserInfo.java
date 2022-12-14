package cn.int1024.cat.entity.vo;

import cn.int1024.cat.entity.po.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 用户信息
 * @Author: 双料特工·钏钐钾
 * @Date: 2022/10/18 22:22
 * @Version: 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserInfo extends User implements Serializable {
    List<RoleInfo> roles;
}
