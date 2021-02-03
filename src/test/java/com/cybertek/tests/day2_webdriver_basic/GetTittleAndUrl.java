package com.cybertek.tests.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleAndUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        //getting tittle with selenium
        //driver.getTitle() right click and show... or alt + enter for make variable
        //driver.getTitle()
        //driver.getTitle().sout yazinca bu hale geliyor
        //System.out.println(driver.getTitle());
        String title = driver.getTitle();
        
        //  soutv + enter to print variable name and value 
        
        System.out.println("title = " + title);
        
        // get the url feom browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);
        


    }
}
/*
title = Practice
        currentUrl = http://practice.cybertekschool.com/
        pageSource = <html class="no-js" lang="en"><!--<![endif]--><head>
<script src="/js/vendor/298279967.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<title>Practice</title>
<link href="/css/app.css" rel="stylesheet">
<link href="/css/font-awesome.css" rel="stylesheet">
<link href="/css/registration.css" rel="stylesheet">
<link rel="shortcut icon" type="image/x-icon" href="https://instructure-uploads.s3.amazonaws.com/account_109600000000000001/attachments/18918/Cybertek_Icon_PNG_Large%20copy.png">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<!--  <script src="/js/vendor/jquery-1.11.3.min.js"></script>-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!--  <script src="/js/vendor/jquery-ui-1.11.4/jquery-ui.js"></script>-->
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="/js/foundation/foundation.js"></script><meta class="foundation-mq-small"><meta class="foundation-mq-medium"><meta class="foundation-mq-large"><style></style>
<script src="/js/foundation/foundation.alerts.js"></script>
<script>
      $(document).foundation();
</script>
<!--  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/gasparesganga-jquery-loading-overlay@2.1.6/dist/loadingoverlay.min.js"></script>


<style> @-webkit-keyframes loadingoverlay_animation__rotate_right { to { -webkit-transform : rotate(360deg); transform : rotate(360deg); } } @keyframes loadingoverlay_animation__rotate_right { to { -webkit-transform : rotate(360deg); transform : rotate(360deg); } } @-webkit-keyframes loadingoverlay_animation__rotate_left { to { -webkit-transform : rotate(-360deg); transform : rotate(-360deg); } } @keyframes loadingoverlay_animation__rotate_left { to { -webkit-transform : rotate(-360deg); transform : rotate(-360deg); } } @-webkit-keyframes loadingoverlay_animation__fadein { 0% { opacity   : 0; -webkit-transform : scale(0.1, 0.1); transform : scale(0.1, 0.1); } 50% { opacity   : 1; } 100% { opacity   : 0; -webkit-transform : scale(1, 1); transform : scale(1, 1); } } @keyframes loadingoverlay_animation__fadein { 0% { opacity   : 0; -webkit-transform : scale(0.1, 0.1); transform : scale(0.1, 0.1); } 50% { opacity   : 1; } 100% { opacity   : 0; -webkit-transform : scale(1, 1); transform : scale(1, 1); } } @-webkit-keyframes loadingoverlay_animation__pulse { 0% { -webkit-transform : scale(0, 0); transform : scale(0, 0); } 50% { -webkit-transform : scale(1, 1); transform : scale(1, 1); } 100% { -webkit-transform : scale(0, 0); transform : scale(0, 0); } } @keyframes loadingoverlay_animation__pulse { 0% { -webkit-transform : scale(0, 0); transform : scale(0, 0); } 50% { -webkit-transform : scale(1, 1); transform : scale(1, 1); } 100% { -webkit-transform : scale(0, 0); transform : scale(0, 0); } } </style></head>
<body>
<nav class="navbar navbar-expand-sm bg-light">
<ul class="navbar-nav">
<li class="nav-item">
<a class="nav-link" href="/">Home</a>
</li>
</ul>
</nav>
<div class="container">
<div class="row">
<div id="flash-messages" class="large-12 columns">
</div>
</div>
<div class="row">
<div id="content" class="large-12 columns">
<style>
  ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          }
</style>
<div class="row">
<div class="col-sm-8">
<h1 class="h1"><span class="h1y">Test Automation Practice</span></h1>
<h2><span class="h2">Available Examples</span></h2>
</div>
</div>
<ul class="list-group">
<li class="list-group-item"><a href="/abtest">A/B Testing</a></li>
<li class="list-group-item"><a href="/add_remove_elements/">Add/Remove Elements</a></li>
<li class="list-group-item"><a href="/autocomplete">Autocomplete</a></li>
<li class="list-group-item"><a href="/basic_auth">Basic Auth</a> (user and pass: admin)</li>
<li class="list-group-item"><a href="/broken_images">Broken Images</a></li>
<li class="list-group-item"><a href="/challenging_dom">Challenging DOM</a></li>
<li class="list-group-item"><a href="/checkboxes">Checkboxes</a></li>
<li class="list-group-item"><a href="/context_menu">Context Menu</a></li>
<li class="list-group-item"><a href="/disappearing_elements">Disappearing Elements</a></li>
<li class="list-group-item"><a href="/drag_and_drop">Drag and Drop</a></li>
<li class="list-group-item"><a href="/dropdown">Dropdown</a></li>
<li class="list-group-item"><a href="/dynamic_content">Dynamic Content</a></li>
<li class="list-group-item"><a href="/dynamic_controls">Dynamic Controls</a></li>
<li class="list-group-item"><a href="/dynamic_loading">Dynamic Loading</a></li>
<li class="list-group-item"><a href="/entry_ad">Entry Ad</a></li>
<li class="list-group-item"><a href="/exit_intent">Exit Intent</a></li>
<li class="list-group-item"><a href="/download">File Download</a></li>
<li class="list-group-item"><a href="/upload">File Upload</a></li>
<li class="list-group-item"><a href="/floating_menu">Floating Menu</a></li>
<li class="list-group-item"><a href="/forgot_password">Forgot Password</a></li>
<li class="list-group-item"><a href="/login">Form Authentication</a></li>
<li class="list-group-item"><a href="/frames">Frames</a></li>
<li class="list-group-item"><a href="/geolocation">Geolocation</a></li>
<li class="list-group-item"><a href="/horizontal_slider">Horizontal Slider</a></li>
<li class="list-group-item"><a href="/hovers">Hovers</a></li>
<li class="list-group-item"><a href="/infinite_scroll">Infinite Scroll</a></li>
<li class="list-group-item"><a href="/inputs">Inputs</a></li>
<li class="list-group-item"><a href="/jqueryui/menu">JQuery UI Menus</a></li>
<li class="list-group-item"><a href="/javascript_alerts">JavaScript Alerts</a></li>
<li class="list-group-item"><a href="/javascript_error">JavaScript onload event error</a></li>
<li class="list-group-item"><a href="/key_presses">Key Presses</a></li>
<li class="list-group-item"><a href="/large">Large &amp; Deep DOM</a></li>
<li class="list-group-item"><a href="/multiple_buttons">Multiple Buttons</a></li>
<li class="list-group-item"><a href="/windows">Multiple Windows</a></li>
<li class="list-group-item"><a href="/nested_frames">Nested Frames</a></li>
<li class="list-group-item"><a href="/open_new_tab">New tab</a></li>
<li class="list-group-item"><a href="/notification_message">Notification Messages</a></li>
<li class="list-group-item"><a href="/radio_buttons">Radio Buttons</a></li>
<li class="list-group-item"><a href="/redirector">Redirect Link</a></li>
<li class="list-group-item"><a href="/registration_form">Registration Form</a></li>
<li class="list-group-item"><a href="/download_secure">Secure File Download</a></li>
<li class="list-group-item"><a href="/shifting_content">Shifting Content</a></li>
<li class="list-group-item"><a href="/sign_up">Sign Up For Mailing List</a></li>
<li class="list-group-item"><a href="/slow">Slow Resources</a></li>
<li class="list-group-item"><a href="/tables">Sortable Data Tables</a></li>
<li class="list-group-item"><a href="/status_codes">Status Codes</a></li>
<li class="list-group-item"><a href="/typos">Typos</a></li>
<li class="list-group-item"><a href="/tinymce">WYSIWYG Editor</a></li>
</ul>



</div>
</div>
<div id="page-footer" class="row">
<div class="large-4 large-centered columns">
<hr>
<div style="text-align: center;">Powered by <a target="_blank" href="https://cybertekschool.com/">Cybertek School</a></div>
</div>
</div>
</div>


</body></html>

        Process finished with exit code 0
*/
