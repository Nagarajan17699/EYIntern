<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
                crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
                crossorigin="anonymous"></script>
        </head>

        <body>
            <hr>
            <jsp:include page="logout.jsp"></jsp:include>
            <hr>

            <form action="shop.do" method="post">
                <input type="hidden" name="formid" value="shop">
                <input type="hidden" name="shopid" value="shop2">

                <div class="container-fluid">

                    <div class="row jumbotron">
                        <div class="col-sm-3"></div>
                       <div class="col-sm-6"><h1>Grocery Shop</h1></div> 
                       <div class="col-sm-3"></div>
                    </div>

                    <div class="row" style="padding-left: 20%; padding-top: 7.5%;">
                        <div class="col-sm-1"></div>
                        <div class="col-sm-10">
                            <table>
                                <tr>
                                    <th style="padding-left: 5px">Name</th>
                                    <th style="padding-left: 5px">Description</th>
                                    <th style="padding-left: 5px">Quantity</th>
                                    <th style="padding-left: 5px">Price</th>
                                    <th style="padding-left: 5px"> Select </th>
                                </tr>

                                <c:forEach items="${items}" var="item">
                                    <tr>
                                        <td style="padding-left: 5px"> ${item.getName()}</td>
                                        <td style="padding-left: 5px"> ${item.getDescp()}</td>
                                        <td style="padding-left: 5px">
                                            <select class="form-control" name=<c:out value='${item.getName()}' />
                                            <option value="1" selected>1</option>
                                            <option value="2">2</option>
                                            <option value="3">3</option>
                                            <option value="4">4</option>
                                            <option value="5">5</option>

                                            </select>
                                        </td>
                                        <td style="padding-left: 5px">${item.getPrice()}</td>
                                        <td style="padding-left: 5px"><input name='selected' type='checkbox' value='${item.getName()}'></td>
                                    </tr>
                                </c:forEach>
                            </table>

                            <input class="btn btn-success" type="submit" value="Next Shop..">
            </form>
            </div>
            <div class="col-sm-1"></div>
            </div>
            </div>

        </body>

        </html>