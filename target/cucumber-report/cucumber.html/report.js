$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Functionality",
  "description": "\r\nAs a user I want to check register functionality",
  "id": "register-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11005437800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should Successfully Register with valid credentials",
  "description": "",
  "id": "register-functionality;user-should-successfully-register-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I click on register link",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I enter first Name \"kelly\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I enter last Name \"spencer\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter email \"kelly.spencer@yahoo.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter confirmed password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see registration completed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterTest.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 2195009400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kelly",
      "offset": 20
    }
  ],
  "location": "RegisterTest.iEnterFirstName(String)"
});
formatter.result({
  "duration": 800725300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "spencer",
      "offset": 19
    }
  ],
  "location": "RegisterTest.iEnterLastName(String)"
});
formatter.result({
  "duration": 215534600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kelly.spencer@yahoo.com",
      "offset": 15
    }
  ],
  "location": "RegisterTest.iEnterEmail(String)"
});
formatter.result({
  "duration": 282352600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 18
    }
  ],
  "location": "LoginTest.iEnterPassword(String)"
});
formatter.result({
  "duration": 735201400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 28
    }
  ],
  "location": "RegisterTest.iEnterConfirmedPassword(String)"
});
formatter.result({
  "duration": 181650900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 22011312000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.iShouldSeeRegistrationCompletedSuccessfully()"
});
formatter.result({
  "duration": 1113962100,
  "status": "passed"
});
formatter.after({
  "duration": 1485796600,
  "status": "passed"
});
});