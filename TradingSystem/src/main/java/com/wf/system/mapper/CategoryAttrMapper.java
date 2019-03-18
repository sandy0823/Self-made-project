package com.wf.system.mapper;

import com.wf.system.model.entity.CategoryAttr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CategoryAttrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @Delete({
        "delete from category_attr",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @Insert({
        "insert into category_attr (id, name, ",
        "descript, parent_second_category_id)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{descript,jdbcType=VARCHAR}, #{parentSecondCategoryId,jdbcType=INTEGER})"
    })
    int insert(CategoryAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @InsertProvider(type=CategoryAttrSqlProvider.class, method="insertSelective")
    int insertSelective(CategoryAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, descript, parent_second_category_id",
        "from category_attr",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_second_category_id", property="parentSecondCategoryId", jdbcType=JdbcType.INTEGER)
    })
    CategoryAttr selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @UpdateProvider(type=CategoryAttrSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CategoryAttr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_attr
     *
     * @mbg.generated
     */
    @Update({
        "update category_attr",
        "set name = #{name,jdbcType=VARCHAR},",
          "descript = #{descript,jdbcType=VARCHAR},",
          "parent_second_category_id = #{parentSecondCategoryId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CategoryAttr record);
}