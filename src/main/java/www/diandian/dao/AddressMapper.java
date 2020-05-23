package www.diandian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.diandian.entity.Address;

/*对应的是Springboottest0402Application下的@MapperScan*/
@Mapper
/*  对应的是TestController下的  @Autowired  */
@Repository
public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}