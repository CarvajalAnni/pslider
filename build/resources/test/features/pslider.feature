Feature: DemoQA
  i want to interactive
  to the DemoQA page
  to put my skills into practice
  Scenario Outline: Scenario: Interact with the website
    Given that 'Anni' open the browser and enter the page 'https://demoqa.com/'
    When she select the elemnt option and the category slider she will be able to click and slide the mouse
      | Slider    | <Slider>      |
    Then she should see on the screen the number where the mouse slides
      | Slider    | <Slider>      |
      | Number    | <Number>      |
    Examples:
      | Slider    | Number        |
      |  anni     | js            |
