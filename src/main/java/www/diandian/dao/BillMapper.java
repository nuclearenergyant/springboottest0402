package www.diandian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.diandian.entity.Bill;


@Mapper
@Repository
public interface BillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}