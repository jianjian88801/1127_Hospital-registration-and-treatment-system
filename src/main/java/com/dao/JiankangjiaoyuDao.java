package com.dao;

import com.entity.JiankangjiaoyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangjiaoyuView;

/**
 * 健康教育 Dao 接口
 *
 * @author 
 */
public interface JiankangjiaoyuDao extends BaseMapper<JiankangjiaoyuEntity> {

   List<JiankangjiaoyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
