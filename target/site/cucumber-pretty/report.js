$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ARegistration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration user",
  "description": "",
  "id": "registration-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Registration user with Programming language is Java",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i click button start register \"startUserRegistration\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i enter as username \"\u003cusername\u003e\" in \"inputUsername\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter as email \"ibnuhazar@btpn.com\" in \"inputEmail\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i enter as password \"\u003cpassword\u003e\" in \"inputPassword\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i select as programming language \"Java\" in \"inputPreferedProgrammingLanguage\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i check as accept adds in \"inputAdds\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i click button register \"btnRegisterUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify user will be display \"Java\" in \"labelPreferedProgrammingLanguage\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "registration-user;registration-user-with-programming-language-is-java;;1"
    },
    {
      "cells": [
        "ibnuh",
        "jakob"
      ],
      "line": 18,
      "id": "registration-user;registration-user-with-programming-language-is-java;;2"
    },
    {
      "cells": [
        "fhadel",
        "raka"
      ],
      "line": 19,
      "id": "registration-user;registration-user-with-programming-language-is-java;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12410237007,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i have opened a selendroid-test-app",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationUser.i_have_opened_a_selendroid_test_app()"
});
formatter.result({
  "duration": 1308798597,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Registration user with Programming language is Java",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i click button start register \"startUserRegistration\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i enter as username \"ibnuh\" in \"inputUsername\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter as email \"ibnuhazar@btpn.com\" in \"inputEmail\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i enter as password \"jakob\" in \"inputPassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i select as programming language \"Java\" in \"inputPreferedProgrammingLanguage\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i check as accept adds in \"inputAdds\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i click button register \"btnRegisterUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify user will be display \"Java\" in \"labelPreferedProgrammingLanguage\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "startUserRegistration",
      "offset": 31
    }
  ],
  "location": "RegistrationUser.i_click_button_start_register(String)"
});
formatter.result({
  "duration": 2105651190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ibnuh",
      "offset": 21
    },
    {
      "val": "inputUsername",
      "offset": 32
    }
  ],
  "location": "RegistrationUser.i_enter_as_username_in(String,String)"
});
formatter.result({
  "duration": 6994499127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ibnuhazar@btpn.com",
      "offset": 18
    },
    {
      "val": "inputEmail",
      "offset": 42
    }
  ],
  "location": "RegistrationUser.i_enter_as_email_in(String,String)"
});
formatter.result({
  "duration": 9853093431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jakob",
      "offset": 21
    },
    {
      "val": "inputPassword",
      "offset": 32
    }
  ],
  "location": "RegistrationUser.i_enter_as_password_in(String,String)"
});
formatter.result({
  "duration": 7672416512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 34
    },
    {
      "val": "inputPreferedProgrammingLanguage",
      "offset": 44
    }
  ],
  "location": "RegistrationUser.i_select_as_programming_language_in(String,String)"
});
formatter.result({
  "duration": 3529794101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "inputAdds",
      "offset": 27
    }
  ],
  "location": "RegistrationUser.i_check_as_accept_adds_in(String)"
});
formatter.result({
  "duration": 1620167783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btnRegisterUser",
      "offset": 25
    }
  ],
  "location": "RegistrationUser.i_click_button_register(String)"
});
formatter.result({
  "duration": 1895764267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 29
    },
    {
      "val": "labelPreferedProgrammingLanguage",
      "offset": 39
    }
  ],
  "location": "RegistrationUser.verify_user_will_be_display_in(String,String)"
});
formatter.result({
  "duration": 510785275,
  "status": "passed"
});
formatter.write("Scenario Pass");
formatter.after({
  "duration": 1923762688,
  "status": "passed"
});
formatter.before({
  "duration": 12597783136,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i have opened a selendroid-test-app",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationUser.i_have_opened_a_selendroid_test_app()"
});
formatter.result({
  "duration": 1568478,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Registration user with Programming language is Java",
  "description": "",
  "id": "registration-user;registration-user-with-programming-language-is-java;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i click button start register \"startUserRegistration\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i enter as username \"fhadel\" in \"inputUsername\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i enter as email \"ibnuhazar@btpn.com\" in \"inputEmail\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i enter as password \"raka\" in \"inputPassword\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i select as programming language \"Java\" in \"inputPreferedProgrammingLanguage\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i check as accept adds in \"inputAdds\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i click button register \"btnRegisterUser\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify user will be display \"Java\" in \"labelPreferedProgrammingLanguage\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "startUserRegistration",
      "offset": 31
    }
  ],
  "location": "RegistrationUser.i_click_button_start_register(String)"
});
formatter.result({
  "duration": 2689731362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fhadel",
      "offset": 21
    },
    {
      "val": "inputUsername",
      "offset": 33
    }
  ],
  "location": "RegistrationUser.i_enter_as_username_in(String,String)"
});
formatter.result({
  "duration": 7404467412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ibnuhazar@btpn.com",
      "offset": 18
    },
    {
      "val": "inputEmail",
      "offset": 42
    }
  ],
  "location": "RegistrationUser.i_enter_as_email_in(String,String)"
});
formatter.result({
  "duration": 10070649198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "raka",
      "offset": 21
    },
    {
      "val": "inputPassword",
      "offset": 31
    }
  ],
  "location": "RegistrationUser.i_enter_as_password_in(String,String)"
});
formatter.result({
  "duration": 6196393898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 34
    },
    {
      "val": "inputPreferedProgrammingLanguage",
      "offset": 44
    }
  ],
  "location": "RegistrationUser.i_select_as_programming_language_in(String,String)"
});
formatter.result({
  "duration": 3142265048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "inputAdds",
      "offset": 27
    }
  ],
  "location": "RegistrationUser.i_check_as_accept_adds_in(String)"
});
formatter.result({
  "duration": 1682533248,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "btnRegisterUser",
      "offset": 25
    }
  ],
  "location": "RegistrationUser.i_click_button_register(String)"
});
formatter.result({
  "duration": 1566632361,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Java",
      "offset": 29
    },
    {
      "val": "labelPreferedProgrammingLanguage",
      "offset": 39
    }
  ],
  "location": "RegistrationUser.verify_user_will_be_display_in(String,String)"
});
formatter.result({
  "duration": 634396994,
  "status": "passed"
});
formatter.write("Scenario Pass");
formatter.after({
  "duration": 1622185998,
  "status": "passed"
});
formatter.before({
  "duration": 13812387624,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i have opened a selendroid-test-app",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationUser.i_have_opened_a_selendroid_test_app()"
});
formatter.result({
  "duration": 1306755,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Web View with dropdown say hello",
  "description": "",
  "id": "registration-user;web-view-with-dropdown-say-hello",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "i click button open chroom in \"buttonStartWebview\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i click button spinner Webdriver Test Data in \"spinnerWebdriverTestData\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "i select as \"formPage\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "i click button \"goBack\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "verify home page display tittle is \"selendroid-test-appa\" in \"title\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "buttonStartWebview",
      "offset": 31
    }
  ],
  "location": "RegistrationUser.i_click_button_open_chroom_in(String)"
});
formatter.result({
  "duration": 3002668093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "spinnerWebdriverTestData",
      "offset": 47
    }
  ],
  "location": "RegistrationUser.i_click_button_spinner_Webdriver_Test_Data_in(String)"
});
formatter.result({
  "duration": 3138227218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "formPage",
      "offset": 13
    }
  ],
  "location": "RegistrationUser.i_select_as(String)"
});
formatter.result({
  "duration": 1834955619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "goBack",
      "offset": 16
    }
  ],
  "location": "RegistrationUser.i_click_button(String)"
});
formatter.result({
  "duration": 821813427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selendroid-test-appa",
      "offset": 36
    },
    {
      "val": "title",
      "offset": 62
    }
  ],
  "location": "RegistrationUser.verify_home_page_display_tittle_is_in(String,String)"
});
formatter.result({
  "duration": 696552986,
  "error_message": "java.lang.AssertionError: expected:\u003cselendroid-test-appa\u003e but was:\u003cselendroid-test-app\u003e\r\n\tat org.testng.AssertJUnit.assertEquals(AssertJUnit.java:101)\r\n\tat org.testng.AssertJUnit.assertEquals(AssertJUnit.java:108)\r\n\tat com.test.eventConnector.EventConnector.assertionLabel(EventConnector.java:59)\r\n\tat com.test.stepdef.RegistrationUser.verify_home_page_display_tittle_is_in(RegistrationUser.java:90)\r\n\tat ✽.Then verify home page display tittle is \"selendroid-test-appa\" in \"title\"(ARegistration.feature:27)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("Scenario Fail");
formatter.after({
  "duration": 2945527782,
  "status": "passed"
});
formatter.uri("BEnd.feature");
formatter.feature({
  "line": 1,
  "name": "End user",
  "description": "",
  "id": "end-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10954420806,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "i have opened a selendroid-test-app",
  "keyword": "Given "
});
formatter.match({
  "location": "RegistrationUser.i_have_opened_a_selendroid_test_app()"
});
formatter.result({
  "duration": 1802211,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "end-user;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i click button En Button in \"buttonTest\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "i click button No, no in \"button2\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify home page tittle is \"selendroid-test-app\" in \"title\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "buttonTest",
      "offset": 29
    }
  ],
  "location": "EndUser.i_click_button_En_Button_in(String)"
});
formatter.result({
  "duration": 2196793716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "button2",
      "offset": 26
    }
  ],
  "location": "EndUser.i_click_button_No_no_in(String)"
});
formatter.result({
  "duration": 3777050196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selendroid-test-app",
      "offset": 28
    },
    {
      "val": "title",
      "offset": 53
    }
  ],
  "location": "EndUser.verify_home_page_tittle_is_in(String,String)"
});
formatter.result({
  "duration": 273268492,
  "status": "passed"
});
formatter.write("Scenario Pass");
formatter.after({
  "duration": 2554480615,
  "status": "passed"
});
});