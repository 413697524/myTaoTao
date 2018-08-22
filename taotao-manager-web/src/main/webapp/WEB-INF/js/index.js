/**
 * Created by lemon on 2018/8/22.
 */

//我们强烈推荐你在代码最外层把需要用到的模块先加载
layui.use(['layer', 'form', 'element','upload'], function(){
    var layer = layui.layer
        ,form = layui.form
        ,element = layui.element
        ,upload = layui.upload

    //……
    //你的代码都应该写在这里面
    console.log("index.js")
    //上传
    upload.render({
        elem: '#uploadDemo'
        ,url: '' //上传接口
        ,done: function(res){
            console.log(res)
        }
    });
});