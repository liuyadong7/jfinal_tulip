package com.modules.test.service;

import com.jfinal.plugin.activerecord.Page;
import com.modules.test.model.Student;

/**
 * <p> 学生的业务层 </p>
 *
 * @author liuyadong
 * @since 2020-09-02 22:13
 **/
public class StudentService {

    /**
     * 学生的dao
     */
    private Student dao = new Student().dao();

    public void sayHi() {
        System.out.println("你好啊！！！！！！！！！");
    }

    public Page<Student> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "from test_student order by id asc");
    }

}
