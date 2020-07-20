$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PodPointPurchase.feature");
formatter.feature({
  "line": 1,
  "name": "Podpoint purchase for Mitsubishi Outlander",
  "description": "",
  "id": "podpoint-purchase-for-mitsubishi-outlander",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9088305600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Universal Socket connection type",
  "description": "",
  "id": "podpoint-purchase-for-mitsubishi-outlander;universal-socket-connection-type",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestToRun"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the Url \"https://checkout.pod-point.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select \"Mitsubishi\" and \"Outlander\" in the Select your car fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I check the box \"I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select \"Universal Socket\" option connection type",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the prices for the 7KW power rating contains the following",
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 10
    },
    {
      "cells": [
        "full price",
        "£879.00"
      ],
      "line": 11
    },
    {
      "cells": [
        "with OLEV grant",
        "£529.00"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on the \"7kW\" power rating",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "6 compatible extras are shown",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I choose the first compartible extra",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the Total price correctly matches 7kw unit price plus the compartible extra price",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://checkout.pod-point.com/",
      "offset": 17
    }
  ],
  "location": "PodPointPurchaseSteps.i_am_on_the_Url(String)"
});
formatter.result({
  "duration": 3614335200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mitsubishi",
      "offset": 10
    },
    {
      "val": "Outlander",
      "offset": 27
    }
  ],
  "location": "PodPointPurchaseSteps.i_select_and_in_the_Select_your_car_fields(String,String)"
});
formatter.result({
  "duration": 1007660500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I am NOT eligible to claim the dealership discount as I did not come through a dedicated dealership",
      "offset": 17
    }
  ],
  "location": "PodPointPurchaseSteps.i_check_the_box(String)"
});
formatter.result({
  "duration": 5107877800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Universal Socket",
      "offset": 10
    }
  ],
  "location": "PodPointPurchaseSteps.i_select_option_connection_type(String)"
});
formatter.result({
  "duration": 4154000600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 19
    }
  ],
  "location": "PodPointPurchaseSteps.thePricesForTheKWPowerRatingContainsTheFollowing(int,DataTable)"
});
formatter.result({
  "duration": 3128404000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7kW",
      "offset": 16
    }
  ],
  "location": "PodPointPurchaseSteps.iClickOnThePowerRating(String)"
});
formatter.result({
  "duration": 188013700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 0
    }
  ],
  "location": "PodPointPurchaseSteps.compatible_extras_are_shown(int)"
});
formatter.result({
  "duration": 4025327200,
  "status": "passed"
});
formatter.match({
  "location": "PodPointPurchaseSteps.i_choose_the_first_compartible_extra()"
});
