$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration",
  "description": "I want to use this template for my Registration feature",
  "id": "registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Create New Account for NonCommerce Application",
  "description": "",
  "id": "registration;create-new-account-for-noncommerce-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open Browser and Enter Application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on Profile and Select Registration Option",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Application Redirect to the Your Personal Details page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter all Mandatory details and Click Register Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the Email verification text to Activate the Account",
  "keyword": "And "
});
formatter.match({
  "location": "NonCommerce_Library.open_Browser_and_Enter_Application_URL()"
});
formatter.result({
  "duration": 4551349100,
  "status": "passed"
});
formatter.match({
  "location": "NonCommerce_Library.click_on_Profile_and_Select_Registration_Option()"
});
formatter.result({
  "duration": 2126734800,
  "status": "passed"
});
formatter.match({
  "location": "NonCommerce_Library.application_Redirect_to_the_Your_Personal_Details_page()"
});
formatter.result({
  "duration": 152420900,
  "status": "passed"
});
formatter.match({
  "location": "NonCommerce_Library.enter_all_Mandatory_details_and_Click_Register_Button()"
});
formatter.result({
  "duration": 374936200,
  "status": "passed"
});
formatter.match({
  "location": "NonCommerce_Library.verify_the_Email_verification_text_to_Activate_the_Account()"
});
formatter.result({
  "duration": 43200,
  "status": "passed"
});
});