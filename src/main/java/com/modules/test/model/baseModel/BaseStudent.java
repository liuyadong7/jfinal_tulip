package com.modules.test.model.baseModel;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

import java.util.Date;

/**
 * <p> 基础学生信息  </p>
 *
 * @author liuyadong
 * @since 2020-08-31 22:50
 **/
@SuppressWarnings({"serial", "unchecked"})
public class BaseStudent<M extends BaseStudent<M>> extends Model<M> implements IBean {

    /**
     * 表名
     */
    public static final String TABLE_NAME = "test_student";
    private static final long serialVersionUID = -7232680027116101941L;
    /**
     * id
     */
    private static final String ID = "id";
    /**
     * 学号
     */
    private static final String NUMBER = "number";
    /**
     * 学生姓名
     */
    private static final String NAME = "name";
    /**
     * 性别
     */
    private static final String SEX = "sex";
    /**
     * 生日
     */
    private static final String BIRTHDAY = "birthday";
    /**
     * 班级id
     */
    private static final String CL_ID = "cl_id";

    public Long getId() {
        return getLong(ID);
    }

    public void setId(Long id) {
        set(ID, id);
    }

    public String getNumber() {
        return getStr(NUMBER);
    }

    public void setNumber(String number) {
        set(NUMBER, number);
    }

    public String getName() {
        return getStr(NAME);
    }

    public void setName(String name) {
        set(NAME, name);
    }

    public Integer getSex() {
        return getInt(SEX);
    }

    public void setSex(Integer sex) {
        set(SEX, sex);
    }

    public Date getBirthday() {
        return getDate(BIRTHDAY);
    }

    public void setBirthday(Date birthday) {
        set(BIRTHDAY, birthday);
    }

    public Long getClId() {
        return get(CL_ID);
    }

    public void setClId(Long clId) {
        set(CL_ID, clId);
    }
}
