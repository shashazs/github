package com.dao;

import com.bean.Education;
import com.bean.Identification;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:27
 */
@Repository
public interface IdentificationDao {

    @Insert("insert into identification values(#{iid},#{card},#{iimage},#{status},#{iperson})")
    public boolean insertIdentification(Identification ident);

    @Delete("delete from identification where iid=#{iid}")
    public boolean deleteIdentification(int iid);

    @Update("update identification set card=#{card},iimage=#{iimage},status=#{status},iperson=#{iperson} where iid=#{iid}")
    public boolean updateIdentification(Identification ident);

    @Select("select * from identification")
    public List<Identification> findAll();

    @Select("select * from identification where iid=#{iid}")
    public Education findByOne(@Param(value = "iid")int iid);

}
