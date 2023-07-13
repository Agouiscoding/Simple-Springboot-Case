package com.itheima.controller.utils;

import lombok.Data;

@Data
public class R {
    private Boolean flag;
    private Object data;
<<<<<<< HEAD
    private String msg;
=======
>>>>>>> 2cb6bb0ececf12786b86c957f956ddc53e20b67c
    public R(){}
    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
<<<<<<< HEAD

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
=======
>>>>>>> 2cb6bb0ececf12786b86c957f956ddc53e20b67c
}
