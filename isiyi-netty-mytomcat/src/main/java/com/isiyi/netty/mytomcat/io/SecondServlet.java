package com.isiyi.netty.mytomcat.io;

public class SecondServlet extends MyServlet {
    @Override
    public void doGet(MyRequest request, MyResponse response) throws Exception {
        this.doPost(request, response);
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("this is second servlet");
    }
}
