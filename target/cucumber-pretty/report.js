$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration user",
  "description": "",
  "id": "registration-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Registration user with Programming language is Java",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@sad"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i click button start register \"startUserRegistration\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i loged \"ibnuh\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#   And i enter as username \"\u003cusername\u003e\" in \"inputUsername\""
    },
    {
      "line": 11,
      "value": "#   And i enter as email \"ibnuhazar@btpn.com\" in \"inputEmail\""
    },
    {
      "line": 12,
      "value": "#   And i enter as password \"\u003cpassword\u003e\" in \"inputPassword\""
    }
  ],
  "line": 13,
  "name": "i select as programming language \"Java\" in \"input_preferedProgrammingLanguage\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i check checkbox accept adds in \"input_adds\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i click button register \"btnRegisterUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify user \"Java\" in \"label_preferedProgrammingLanguage_data\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "registration-user;registration-user-with-programming-language-is-java;;1"
    },
    {
      "cells": [
        "ibnuh",
        "jakob"
      ],
      "line": 20,
      "id": "registration-user;registration-user-with-programming-language-is-java;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18166038171,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "i have opened a selendroid-test-app",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 20,
  "name": "Registration user with Programming language is Java",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 6,
      "name": "@sad"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i click button start register \"startUserRegistration\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i loged \"ibnuh\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#   And i enter as username \"\u003cusername\u003e\" in \"inputUsername\""
    },
    {
      "line": 11,
      "value": "#   And i enter as email \"ibnuhazar@btpn.com\" in \"inputEmail\""
    },
    {
      "line": 12,
      "value": "#   And i enter as password \"\u003cpassword\u003e\" in \"inputPassword\""
    }
  ],
  "line": 13,
  "name": "i select as programming language \"Java\" in \"input_preferedProgrammingLanguage\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i check checkbox accept adds in \"input_adds\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "i click button register \"btnRegisterUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "verify user \"Java\" in \"label_preferedProgrammingLanguage_data\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "startUserRegistration",
      "offset": 31
    }
  ],
  "location": "StepDefinition.tap(String)"
});
formatter.result({
  "duration": 4297751737,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ibnuh",
      "offset": 9
    }
  ],
  "location": "StepDefinition.login(String)"
});
formatter.result({
  "duration": 18996273811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 34
    },
    {
      "val": "input_preferedProgrammingLanguage",
      "offset": 44
    }
  ],
  "location": "StepDefinition.selectListItemBylabel(String,String)"
});
formatter.result({
  "duration": 2966240832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "input_adds",
      "offset": 33
    }
  ],
  "location": "StepDefinition.checkElement(String)"
});
formatter.result({
  "duration": 1478553303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btnRegisterUser",
      "offset": 25
    }
  ],
  "location": "StepDefinition.tap(String)"
});
formatter.result({
  "duration": 1633333597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 13
    },
    {
      "val": "label_preferedProgrammingLanguage_data",
      "offset": 23
    }
  ],
  "location": "StepDefinition.verifyEqual(String,String)"
});
formatter.result({
  "duration": 989891191,
  "status": "passed"
});
formatter.write("Scenario Pass");
formatter.after({
  "duration": 2015228528,
  "status": "passed"
});
});