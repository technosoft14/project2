#Author: your.email@your.domain.com

#Sample Feature Definition Template
@tag
Feature: test triff details
 
  @tag2
  Scenario Outline: The user is in addtriff details
    Given the user in addtriff
    When the user enter validation "<mr>","<flm>","<fim>","<fsp>","<lpmc>","<ipmc>","<sms>"
    When the user click submit
    Then see success message

    Examples: 
    |mr |flm|fim|fsp |lpmc |ipmc|sms|
    |111|23 |34 |44	 |55	 |66	|78|