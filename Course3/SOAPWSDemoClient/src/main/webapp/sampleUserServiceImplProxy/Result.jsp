<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserServiceImplProxyid" scope="session" class="com.fullstack.service.UserServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUserServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUserServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.fullstack.service.UserServiceImpl getUserServiceImpl10mtemp = sampleUserServiceImplProxyid.getUserServiceImpl();
if(getUserServiceImpl10mtemp == null){
%>
<%=getUserServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        com.fullstack.model.User[] getUsers15mtemp = sampleUserServiceImplProxyid.getUsers();
if(getUsers15mtemp == null){
%>
<%=getUsers15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getUsers15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getUsers15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 18:
        gotMethod = true;
        String userId_1id=  request.getParameter("userId31");
        long userId_1idTemp  = Long.parseLong(userId_1id);
        com.fullstack.model.User getUser18mtemp = sampleUserServiceImplProxyid.getUser(userId_1idTemp);
if(getUser18mtemp == null){
%>
<%=getUser18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typephone21 = getUser18mtemp.getPhone();
        String tempResultphone21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone21));
        %>
        <%= tempResultphone21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typepassword23 = getUser18mtemp.getPassword();
        String tempResultpassword23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword23));
        %>
        <%= tempResultpassword23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typename25 = getUser18mtemp.getName();
        String tempResultname25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename25));
        %>
        <%= tempResultname25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getUser18mtemp != null){
java.lang.String typeemail27 = getUser18mtemp.getEmail();
        String tempResultemail27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail27));
        %>
        <%= tempResultemail27 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getUser18mtemp != null){
%>
<%=getUser18mtemp.getId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 33:
        gotMethod = true;
        String phone_3id=  request.getParameter("phone38");
            java.lang.String phone_3idTemp = null;
        if(!phone_3id.equals("")){
         phone_3idTemp  = phone_3id;
        }
        String password_4id=  request.getParameter("password40");
            java.lang.String password_4idTemp = null;
        if(!password_4id.equals("")){
         password_4idTemp  = password_4id;
        }
        String name_5id=  request.getParameter("name42");
            java.lang.String name_5idTemp = null;
        if(!name_5id.equals("")){
         name_5idTemp  = name_5id;
        }
        String email_6id=  request.getParameter("email44");
            java.lang.String email_6idTemp = null;
        if(!email_6id.equals("")){
         email_6idTemp  = email_6id;
        }
        String id_7id=  request.getParameter("id46");
        long id_7idTemp  = Long.parseLong(id_7id);
        %>
        <jsp:useBean id="com1fullstack1model1User_2id" scope="session" class="com.fullstack.model.User" />
        <%
        com1fullstack1model1User_2id.setPhone(phone_3idTemp);
        com1fullstack1model1User_2id.setPassword(password_4idTemp);
        com1fullstack1model1User_2id.setName(name_5idTemp);
        com1fullstack1model1User_2id.setEmail(email_6idTemp);
        com1fullstack1model1User_2id.setId(id_7idTemp);
        boolean registerUser33mtemp = sampleUserServiceImplProxyid.registerUser(com1fullstack1model1User_2id);
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerUser33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
case 48:
        gotMethod = true;
        String phone_9id=  request.getParameter("phone53");
            java.lang.String phone_9idTemp = null;
        if(!phone_9id.equals("")){
         phone_9idTemp  = phone_9id;
        }
        String password_10id=  request.getParameter("password55");
            java.lang.String password_10idTemp = null;
        if(!password_10id.equals("")){
         password_10idTemp  = password_10id;
        }
        String name_11id=  request.getParameter("name57");
            java.lang.String name_11idTemp = null;
        if(!name_11id.equals("")){
         name_11idTemp  = name_11id;
        }
        String email_12id=  request.getParameter("email59");
            java.lang.String email_12idTemp = null;
        if(!email_12id.equals("")){
         email_12idTemp  = email_12id;
        }
        String id_13id=  request.getParameter("id61");
        long id_13idTemp  = Long.parseLong(id_13id);
        %>
        <jsp:useBean id="com1fullstack1model1User_8id" scope="session" class="com.fullstack.model.User" />
        <%
        com1fullstack1model1User_8id.setPhone(phone_9idTemp);
        com1fullstack1model1User_8id.setPassword(password_10idTemp);
        com1fullstack1model1User_8id.setName(name_11idTemp);
        com1fullstack1model1User_8id.setEmail(email_12idTemp);
        com1fullstack1model1User_8id.setId(id_13idTemp);
        boolean loginUser48mtemp = sampleUserServiceImplProxyid.loginUser(com1fullstack1model1User_8id);
        String tempResultreturnp49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(loginUser48mtemp));
        %>
        <%= tempResultreturnp49 %>
        <%
break;
case 63:
        gotMethod = true;
        String userId_14id=  request.getParameter("userId66");
        long userId_14idTemp  = Long.parseLong(userId_14id);
        boolean deleteUser63mtemp = sampleUserServiceImplProxyid.deleteUser(userId_14idTemp);
        String tempResultreturnp64 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteUser63mtemp));
        %>
        <%= tempResultreturnp64 %>
        <%
break;
case 68:
        gotMethod = true;
        String phone_16id=  request.getParameter("phone73");
            java.lang.String phone_16idTemp = null;
        if(!phone_16id.equals("")){
         phone_16idTemp  = phone_16id;
        }
        String password_17id=  request.getParameter("password75");
            java.lang.String password_17idTemp = null;
        if(!password_17id.equals("")){
         password_17idTemp  = password_17id;
        }
        String name_18id=  request.getParameter("name77");
            java.lang.String name_18idTemp = null;
        if(!name_18id.equals("")){
         name_18idTemp  = name_18id;
        }
        String email_19id=  request.getParameter("email79");
            java.lang.String email_19idTemp = null;
        if(!email_19id.equals("")){
         email_19idTemp  = email_19id;
        }
        String id_20id=  request.getParameter("id81");
        long id_20idTemp  = Long.parseLong(id_20id);
        %>
        <jsp:useBean id="com1fullstack1model1User_15id" scope="session" class="com.fullstack.model.User" />
        <%
        com1fullstack1model1User_15id.setPhone(phone_16idTemp);
        com1fullstack1model1User_15id.setPassword(password_17idTemp);
        com1fullstack1model1User_15id.setName(name_18idTemp);
        com1fullstack1model1User_15id.setEmail(email_19idTemp);
        com1fullstack1model1User_15id.setId(id_20idTemp);
        boolean updateUser68mtemp = sampleUserServiceImplProxyid.updateUser(com1fullstack1model1User_15id);
        String tempResultreturnp69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateUser68mtemp));
        %>
        <%= tempResultreturnp69 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>