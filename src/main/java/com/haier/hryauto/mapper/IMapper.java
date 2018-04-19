package com.haier.hryauto.mapper;

import com.haier.hryauto.po.I;
import com.haier.hryauto.po.IExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMapper {
    long countByExample(IExample example);

    int deleteByExample(IExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(I record);

    int insertSelective(I record);

    List<I> selectByExample(IExample example);

    I selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") I record, @Param("example") IExample example);

    int updateByExample(@Param("record") I record, @Param("example") IExample example);

    int updateByPrimaryKeySelective(I record);

    int updateByPrimaryKey(I record);
}