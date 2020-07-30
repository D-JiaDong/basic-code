package jia.dong.day09.demo06;

import org.omg.CORBA.PUBLIC_MEMBER;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");

    }
}
