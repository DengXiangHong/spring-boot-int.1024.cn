package cn.int1024.cat.mapper;

import cn.int1024.cat.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: 双料特工·钏钐钾
 * @Date: 2022/10/14 17:04:00
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     *
     * @return List<User>
     */
    List<User> queryAll();

    /**
     * 新增用户
     *
     * @param user 用户
     * @return 用户ID
     */
    Integer addUser(User user);

    /**
     * 删除所有
     * @return 删除数量
     */
    Integer delAll();
}
