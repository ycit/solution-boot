package com.ycit.mapper;

import com.ycit.domain.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user mapper
 *
 * @author xlch
 * @Date 2017-12-14 15:39
 */
@Repository
public interface UserMapper {

    @Select(" select * from user")
    List<User> finds();

}
