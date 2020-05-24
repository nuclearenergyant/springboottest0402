package www.diandian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.diandian.entity.UserInfo;


@Mapper
@Repository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}