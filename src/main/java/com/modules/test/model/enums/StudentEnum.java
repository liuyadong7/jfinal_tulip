package com.modules.test.model.enums;

/**
 * <p> 学生表的映射关系 </p>
 *
 * @author liuyadong
 * @since 2020-09-01 23:04
 **/
public enum StudentEnum {

    /**
     * model类、表
     */
    DATABASE("Student", "test_student"),
    /**
     * 主键
     */
    ID("id", "id"),
    /**
     * 学号
     */
    NUMBER("number", "number"),
    /**
     * 学生姓名
     */
    NAME("name", "name"),
    /**
     * 性别
     */
    SEX("sex", "sex"),
    /**
     * 出生日期
     */
    BIRTHDAY("birthday", "birthday"),
    /**
     * 班级ID
     */
    CL_ID("clId", "cl_id");


    /**
     * data
     */
    public String data;
    /**
     * model
     */
    private String model;

    StudentEnum(String model, String data) {
        this.model = model;
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public String getData() {
        return data;
    }
}
