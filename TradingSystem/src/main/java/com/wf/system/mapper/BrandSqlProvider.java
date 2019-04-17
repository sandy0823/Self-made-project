package com.wf.system.mapper;

import com.wf.system.model.entity.Brand;
import org.apache.ibatis.jdbc.SQL;

public class BrandSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table brand
	 * @mbg.generated
	 */
	public String insertSelective(Brand record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("brand");
		if (record.getId() != null) {
			sql.VALUES("id", "#{id,jdbcType=INTEGER}");
		}
		if (record.getName() != null) {
			sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.VALUES("descript", "#{descript,jdbcType=VARCHAR}");
		}
		if (record.getPic() != null) {
			sql.VALUES("pic", "#{pic,jdbcType=LONGVARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table brand
	 * @mbg.generated
	 */
	public String updateByPrimaryKeySelective(Brand record) {
		SQL sql = new SQL();
		sql.UPDATE("brand");
		if (record.getName() != null) {
			sql.SET("name = #{name,jdbcType=VARCHAR}");
		}
		if (record.getDescript() != null) {
			sql.SET("descript = #{descript,jdbcType=VARCHAR}");
		}
		if (record.getPic() != null) {
			sql.SET("pic = #{pic,jdbcType=LONGVARCHAR}");
		}
		sql.WHERE("id = #{id,jdbcType=INTEGER}");
		return sql.toString();
	}
}