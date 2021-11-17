<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Coffee Manager</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }

        .hero-image {
            background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("https://i.pinimg.com/originals/d4/a7/12/d4a712855bb7eb5f87aff423d40640b6.jpg");
            height: 50%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            position: relative;
        }

        .hero-text {
            text-align: center;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            color: white;
        }

        .hero-text button {
            border: none;
            outline: 0;
            display: inline-block;
            padding: 10px 25px;
            color: black;
            background-color: #ddd;
            text-align: center;
            cursor: pointer;
        }

        .hero-text button:hover {
            background-color: #555;
            color: white;
        }
    </style>
    <style>
        table {
            border-collapse: collapse;
            border-spacing: 0;
            width: 100%;
            border: 1px solid #ddd;
        }

        th, td {
            text-align: center;
            padding: 16px;
        }

        tr:nth-child(even) {
            background-color: #dddd;
        }
    </style>
    <meta name="viewport" content="width=device-width, initial-scale=1">

<body>

<div class="hero-image">
    <div class="hero-text">
        <h1 style="font-size:50px">The Happy Garden</h1>
        <p>And I'm a Drinker and Thinker</p>
    </div>
</div>
<br>
<br>
<div class="container rounded bg-white mt-5">

    <div class="row">
        <div class="col-md-4 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5"
                                                                                         src="${updateCoffee.image}"
                                                                                         width="180"></div>
        </div>
        <form action="/demo/updateCoffee" method="post">
        <div class="col-md-8">
            <div class="p-3 py-5">
                <div class="row mt-2">
                    <%--                    <div class="col-md-6"><label>ID</label><input class="form-control" type="text" name="id" id="id"--%>
                    <%--                                                                  value="<c:out value='${updateCoffee.id}' />" readonly/></div>--%>
                    <div class="col-md-6"><label>NAME</label> <input type="text"
                                                                     value="<c:out value='${updateCoffee.name}' />"
                                                                     id="name"
                                                                     class="form-control" name="name" required></div>
                    <div class="col-md-6"><label>CODE</label> <input type="text"
                                                                     value="<c:out value='${updateCoffee.code}' />"
                                                                     id="code"
                                                                     class="form-control" name="code" readonly></div>
                </div>
                <div class="row mt-3">

                    <div class="col-md-6"><label>SIZE</label> <input type="text"
                                                                     value="<c:out value='${updateCoffee.size}' />"
                                                                     id="size"
                                                                     class="form-control" name="size" readonly></div>
                    <div class="col-md-6"><label>PRICE</label> <input type="text"
                                                                      value="<c:out value='${updateCoffee.price}' />"
                                                                      id="price"
                                                                      class="form-control" name="price" required></div>
                </div>
                <div class="row mt-3">

                    <div class="col-md-6"><label>grCoffee</label> <input type="text"
                                                                         value="<c:out value='${updateCoffee.grCoffee}' />"
                                                                         id="grCoffee"
                                                                         class="form-control" name="grCoffee" required>
                    </div>
                    <div class="col-md-6"><label>sugar</label> <input type="text"
                                                                          value="<c:out value='${updateCoffee.sugar}' />"
                                                                          id="sugar"
                                                                          class="form-control" name="sugar"
                                                                          required></div>
                </div>
                <div class="row mt-3">
                    <div class="col-md-6"><label>freshMilk</label> <input type="text"
                                                                          value="<c:out value='${updateCoffee.freshMilk}' />"
                                                                          id="freshMilk"
                                                                          class="form-control" name="freshMilk"
                                                                          required></div>
                    <div class="col-md-6"><label>condensedMilk</label> <input type="text"
                                                                              value="<c:out value='${updateCoffee.condensedMilk}' />"
                                                                              id="condensedMilk"
                                                                              class="form-control" name="price"
                                                                              required></div>
                </div>
                <div class="mt-5 text-right">
                    <button onclick="Alert()" class="btn btn-primary profile-button" type="submit">Save</button>
                </div>
            </div>
        </div>
        </form>
    </div>
</div>
</body>
<script>
    function Alert() {
        alert("Update success")
    }
</script>
</html>