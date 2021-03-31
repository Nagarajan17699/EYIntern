<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <table>
        
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>quantity</th>
            <th>price</th>
            <th> Select </th>
            </tr>
            
            <!--${invoiceitems}-->
            <c:forEach items = "${invoiceitems}" var="item">

            <tr>
                <td>${item.key.getName()}</td>
                <td>${item.key.getDescp()}</td>
                <td>${item.value}</td>
               <td>${item.key.getPrice()}</td>
            </tr>
            </c:forEach>
    </table>
            
            <form action="invoice.do">
                <input type="hidden" name="mode" value="pdf">
                <input type="hidden" name="formid" value="invoice">
                <input type="submit" value="Create PDF">
            </form>
            
             <form action="invoice.do">
                <input type="hidden" name="mode" value="excel">
                <input type="hidden" name="formid" value="invoice">
                <input type="submit" value="Create Excel">
            </form>
            
             <form action="invoice.do">
                <input type="hidden" name="mode" value="mail">
                <input type="hidden" name="formid" value="invoice">
                <input type="submit" value="Send Mail">
            </form>
            
             <form action="invoice.do">
                <input type="hidden" name="mode" value="sms">
                <input type="hidden" name="formid" value="invoice">
                <input type="submit" value="Create SMS">
            </form>
            
             <form action="invoice.do">
                <input type="hidden" name="mode" value="payment">
                <input type="hidden" name="formid" value="invoice">
                <input type="submit" value="Payment ">
            </form>
</body>
</html>