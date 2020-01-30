$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/casestudy(login)/addcarts.feature");
formatter.feature({
  "name": "Add cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate add cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launches the application",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_launches_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the sigin",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_click_the_sigin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_enter_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the password",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_enter_the_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search the product and add the cart",
  "keyword": "* "
});
formatter.match({
  "location": "addcarts.user_search_the_product_and_add_the_cart()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [cart] but found [Add to cart]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat cucmbers.addcarts.user_search_the_product_and_add_the_cart(addcarts.java:49)\r\n\tat ✽.user search the product and add the cart(src/test/resources/casestudy(login)/addcarts.feature:8)\r\n",
  "status": "failed"
});
});