package com.haier.hryauto.mapper;

import com.haier.hryauto.po.Env;
import com.haier.hryauto.po.EnvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnvMapper {
    long countByExample(EnvExample example);

    int deleteByExample(EnvExample example);

    int insert(Env record);

    int insertSelective(Env record);

    List<Env> selectByExample(EnvExample example);

    int updateByExampleSelective(@Param("record") Env record, @Param("example") EnvExample example);

    int updateByExample(@Param("record") Env record, @Param("example") EnvExample example);
}