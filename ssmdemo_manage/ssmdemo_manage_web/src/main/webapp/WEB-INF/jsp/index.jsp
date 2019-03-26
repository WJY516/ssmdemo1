<%--
  Created by IntelliJ IDEA.
  User: wujiayi
  Date: 2019/3/24
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js">
    </script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js">
    </script>
</head>
<body class="easyui-layout">
    <div data-options="region:'west',title:'菜单',split:true,minWidth:180" style="width:100px;">

        <ul id="tt" class="easyui-tree">
            <li>
                <span>用户信息管理</span>
                <ul>
                    <li data-options="attributes:{'url':'student_list'}">学生</li>
                    <li data-options="attributes:{'url':'teacher_list'}">老师</li>
                </ul>
            </li>
            <li>
                <span>课程信息管理</span>
            </li>
            <li>
                <span>测验信息管理</span>
            </li>
        </ul>
    </div>

    <div data-options="region:'center',title:''" style="padding:5px;background:#eee;">

        <div id="tabs" class="easyui-tabs">
            <div title="首页" style="padding:20px;display:none;">
                首页
            </div>
        </div>

    </div>

    <script>
        $('#tt').tree({
            onClick: function(node){
                var tabs = $("#tabs");
                var tab = tabs.tabs("getTab",node.text);
                if(tab){
                    tabs.tabs("select",node.text);
                }else {
                    tabs.tabs('add',{
                        title:node.text,
                        content:'Tab Body',
                        href:node.attributes.url,
                        closable:true
                    });
                }
            }
        });
    </script>
</body>
</html>
