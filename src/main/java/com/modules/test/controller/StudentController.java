package com.modules.test.controller;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.modules.test.service.StudentService;

/**
 * <p> 学生信息的 Controller </p>
 *
 * @author liuyadong
 * @since 2020-09-01 22:54
 **/
public class StudentController extends Controller {

    @Inject
    private StudentService service;

    public void index() {
        setAttr("studentPage", service.paginate(getParaToInt(0, 1), 10));
        render("/WEB-INF/view/student/tables.html");
    }

    public void add() {
    }

    public void test() {
        service.sayHi();
    }

}
