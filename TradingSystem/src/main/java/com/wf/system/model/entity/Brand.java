package com.wf.system.model.entity;

public class Brand {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.descript
     *
     * @mbg.generated
     */
    private String descript;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column brand.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.id
     *
     * @return the value of brand.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.id
     *
     * @param id the value for brand.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.name
     *
     * @return the value of brand.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.name
     *
     * @param name the value for brand.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.descript
     *
     * @return the value of brand.descript
     *
     * @mbg.generated
     */
    public String getDescript() {
        return descript;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.descript
     *
     * @param descript the value for brand.descript
     *
     * @mbg.generated
     */
    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column brand.pic
     *
     * @return the value of brand.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column brand.pic
     *
     * @param pic the value for brand.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}