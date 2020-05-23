package www.diandian.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
import www.diandian.entity.UserInfo;

import java.util.List;
import java.util.Map;
/*对应的是Springboottest0402Application下的@MapperScan*/
@Mapper
/*  对应的是TestController下的  @Autowired  */
@Repository
public interface UserinfoDao {
    void saveUserInfo(UserInfo userinfo);
    void delUserInfo(String username);
    void updateUserInfoByUsername(UserInfo userinfo);
    List<Map<String,Object>> selectUserInfo();
    List<Map<String, Object>> selectUserInfobyname(String username);
}
