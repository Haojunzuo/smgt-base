package com.wbz.system.mapper;

import com.wbz.system.domain.CollegeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CollegeInfoMapper {


    List<CollegeInfo> selectAll();

}
