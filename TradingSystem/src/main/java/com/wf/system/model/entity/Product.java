package com.wf.system.model.entity;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.descript
     *
     * @mbg.generated
     */
    private String descript;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_brand_id
     *
     * @mbg.generated
     */
    private Integer categoryBrandId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.descript
     *
     * @return the value of product.descript
     *
     * @mbg.generated
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.descript
     *
     * @param descript the value for product.descript
     *
     * @mbg.generated
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_brand_id
     *
     * @return the value of product.category_brand_id
     *
     * @mbg.generated
     */
    public Integer getCategoryBrandId() {
        return categoryBrandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_brand_id
     *
     * @param categoryBrandId the value for product.category_brand_id
     *
     * @mbg.generated
     */
    public void setCategoryBrandId(Integer categoryBrandId) {
        this.categoryBrandId = categoryBrandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.pic
     *
     * @return the value of product.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.pic
     *
     * @param pic the value for product.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}