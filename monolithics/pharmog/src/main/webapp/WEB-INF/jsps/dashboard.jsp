<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>SMS dashboard</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
	
</head>


<body>

<div class="container">

    <section class="jumbotron">
        <h1>SMS Dashboard</h1>
        Sending from <span th:text="${phoneNumber}">XXXXX</span>
    </section>

    <div class="row">

        <div class="col">
            <section class="card">
                <h2 class="card-header">Add Phone number</h2>
                <div class="card-body">
                    <div class="form-group">
                        <label for="new-name">Contact name:</label>
                        <input type="tel" id="new-name" class="form-control"/>
                        <label for="new-phone-number">Phone number:</label>
                        <input type="tel" id="new-phone-number" class="form-control"/>
                    </div>
                    <button id="add-new-phone-number" class="btn btn-primary">Add Number</button>
                </div>
            </section>
        </div>

        <div class="col">
            <section class="card">
                <h2 class="card-header">Send Messages</h2>
                <div class="card-body">
                    <div class="form-group">
                        <label for="available-numbers">Select Numbers:</label>
                        <select multiple id="available-numbers" class="form-control"></select>
                        <label for="messageDetails">Enter your messageDetails:</label>
                        <textarea id="messageDetails" class="form-control" rows="3"></textarea>
                    </div>
                    <button id="send-messages" class="btn btn-primary">Send Message</button>
                </div>
            </section>
        </div>

    </div>

</div>

<script>
    window.addEventListener("DOMContentLoaded", e => {

        const log = msg => {console.log(msg)}

        log("Welcome to the SMS dashboard");

        const newName = document.querySelector("#new-name");
        const newPhoneNumber = document.querySelector("#new-phone-number");
        const availableNumbers = document.querySelector("#available-numbers");
        const messageContent = document.querySelector("#messageDetails");

        document.querySelector("#add-new-phone-number").onclick = e => {
            log("Adding number: " + newPhoneNumber.value);

            const newOption = document.createElement("option");
            newOption.text = `${newName.value} (${newPhoneNumber.value})`;
            newOption.value = newPhoneNumber.value;

            availableNumbers.add(newOption, null);

            newName.value = "";
            newPhoneNumber.value = "";
        };

        document.querySelector("#send-messages").onclick = e => {
            log("Sending messageDetails: " + messageContent.value);

            var selectedNumbers = [];
            document.querySelectorAll("#available-numbers option:checked").forEach( o => selectedNumbers.push(o.value) );

            const postBody = {
                numbers: selectedNumbers,
                message: messageContent.value
            }

            var req = new XMLHttpRequest();
            req.addEventListener("load", e => {
                if (e.target.status === 202) {
                    log("Sent!");
                    messageContent.value = "";
                } else {
                    console.error("Error sending messageDetails", e.target);
                }
            });
            req.open("POST", "/send-messages", true);
            req.setRequestHeader("Content-Type", "application/json");
            req.send(JSON.stringify(postBody));
        }
    }, false);

</script>

</body>

</html>